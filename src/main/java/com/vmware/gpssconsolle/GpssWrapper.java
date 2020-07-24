package com.vmware.gpssconsolle;

import gpss.*;
import io.grpc.ManagedChannel;
import java.io.StringWriter;
import java.io.PrintWriter;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.NegotiationType;
import java.util.logging.*;
import java.io.*;
import java.util.*;



public class GpssWrapper {

    private String gpssHost;
    private int gpssPort;
    private JobServiceGrpc.JobServiceBlockingStub bStub = null;
    //private Session mSession = null;
    /*private String gpMasterHost;
    private Integer gpMasterPort;
    private String gpRoleName;
    private String gpPasswd;
    private String dbName;
    private String schemaName;
    private String tableName;

    private String kafkaBrokers;
    private String kafkaTopic;*/



    private final static Logger logger = Logger.getLogger(GpssWrapper.class.getName());

    public GpssWrapper(String gpssHost, int gpssPort /*String gpMasterHost, Integer gpMasterPort, String gpRoleName, String gpPasswd, String dbName, String tableName, String schemaName,*/)    {

        /* GPSS connection parameters */
        this.gpssHost = gpssHost;
        this.gpssPort = gpssPort;

        /* Greenplum connection parameter */
        /*this.gpMasterHost = gpMasterHost;
        this.gpMasterPort = gpMasterPort;
        this.gpRoleName =  gpRoleName;
        if (gpPasswd == null)  {
            this.gpPasswd = "";
        } else {
            this.gpPasswd = gpPasswd;
        }
        this.dbName = dbName;
        this.tableName = tableName;
        this.schemaName = schemaName;*/

        /* Kafka connection parameters */



    }


    public void connectToGrpc()      {

        ManagedChannel channel = null;

        logger.info("connecting to grpc server:" + gpssHost);

        try {
            // connect to GPSS gRPC service instance; create a channel and a blocking stub
            channel = NettyChannelBuilder.forAddress(gpssHost, gpssPort)
                    .negotiationType(NegotiationType.PLAINTEXT) // TODO: gRPC encryption
                    .build();
            bStub = JobServiceGrpc.newBlockingStub(channel);

        } catch (Exception e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            logger.log(Level.SEVERE, "failed to connect to the grpc serverxxx: " +  errors.toString());

        }


    }

    public void submitJob(String yamlPath, String name)    {

        /*GPDBTarget gpdbTarget =  GPDBTarget.newBuilder()
                .setHost(this.gpMasterHost)
                .setPort(this.gpMasterPort)
                .setPassword(this.gpPasswd)
                .setSchema(this.schemaName)
                .setDatabase(this.dbName)
                .setTable(this.tableName)
                .build();

        KafkaSource kafkaSource = KafkaSource.newBuilder()
                .setBrokers(this.kafkaBrokers)
                .setTopic(this.kafkaTopic)
                .build();


        Target targetValue = Target.newBuilder()
                .setGpdb(gpdbTarget)
                .build();
*/


        String yamlContent = fileAsString(yamlPath);

        SubmitRawJobRequest builder = SubmitRawJobRequest.newBuilder()
                .setJobName(name)
                .setYamlContent(yamlContent)
                .build();

        bStub.submitRawJob(builder);

       /* InputStream inputstream = null;
        SubmitJobResponse submitResponse = null;

        try {
            inputstream = new FileInputStream(fileConfigurationPath);
            SubmitJobRequest jobRequest = SubmitJobRequest.parseFrom(inputstream);


            submitResponse = bStub.submitJob(jobRequest);

        }
        catch (Exception e)   {
            e.printStackTrace();
        }*/

    }

    public Boolean startJob(String name)     {



        Boolean success = false;
        JobIdentifier jobId = JobIdentifier.newBuilder()
                .setJobName(name)
                .build();

        StartJobRequest startJob = StartJobRequest.newBuilder()
                .setJobIdentifier(jobId)
                .build();

        StartJobResponse startJobResponse = null;

        try {
            startJobResponse = bStub.startJob(startJob);
        }
        catch (Exception e)    {
            return false;
        }

        if (startJobResponse == null)    {
            return false;
        }

        return true;

    }

    public Boolean stopJob(String name)     {

        Boolean success = false;

        JobIdentifier jobId = JobIdentifier.newBuilder()
                .setJobName(name)
                .build();

        StopJobRequest stopJob = StopJobRequest.newBuilder()
                .setJobIdentifier(jobId)
                .build();

        try {
            bStub.stopJob(stopJob);
        }
        catch (Exception e)    {
            return false;
        }

        return true;

    }

    public String listJobs(String name)   {


       ListJobResponse listResponse =  bStub.listJobs(ListJobRequest.getDefaultInstance());

       if(listResponse == null)     {
           String output = "Server returned an error value";
           return output;
       }

       List<JobInfo> listJobs = listResponse.getJobInfosList();

       String output = "";

       output = "JobName               JobHost               GPport               Database             Schema                 Table                 Topic                  Status \n\n";


       int lineformat = 22;

       for(JobInfo job : listJobs) {
           output += job.getName();

           for (int i = 0; i < lineformat - job.getName().length(); i++)
               output += " ";

           output += job.getTarget().getGpdb().getHost();

           for (int i = 0; i < lineformat - job.getTarget().getGpdb().getHost().length(); i++)
               output += " ";

           output += job.getTarget().getGpdb().getPort();

           for (int i = 0; i < lineformat - 5; i++)
               output += " ";

           output += job.getTarget().getGpdb().getDatabase();

           for (int i = 0; i < lineformat - job.getTarget().getGpdb().getDatabase().length(); i++)
               output += " ";

           output += job.getTarget().getGpdb().getSchema();

           for (int i = 0; i < lineformat - job.getTarget().getGpdb().getSchema().length(); i++)
               output += " ";

           output += job.getTarget().getGpdb().getTable();

           for (int i = 0; i < lineformat - job.getTarget().getGpdb().getTable().length(); i++)
               output += " ";

           output += job.getSource().getKafka().getTopic();

           for (int i = 0; i < lineformat - job.getSource().getKafka().getTopic().length(); i++)
               output += " ";

           output += job.getStatus().getCode();



           output += "\n";

       }


       return output;

    }

    private String fileAsString(String filePath)   {

        StringBuilder sb = null;
        try {
            InputStream is = new FileInputStream(filePath);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
            String line = buf.readLine();
            sb = new StringBuilder();
            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }
        }
        catch(Exception e)    {
            e.printStackTrace();
        }
        return sb.toString();


    }


}