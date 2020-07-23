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

    public void startJob(String name)     {

        JobIdentifier jobId = JobIdentifier.newBuilder()
                .setJobName(name)
                .build();

        StartJobRequest startJob = StartJobRequest.newBuilder()
                .setJobIdentifier(jobId)
                .build();

        bStub.startJob(startJob);

    }

    public void stopJob(String name)     {

        JobIdentifier jobId = JobIdentifier.newBuilder()
                .setJobName(name)
                .build();

        StopJobRequest stopJob = StopJobRequest.newBuilder()
                .setJobIdentifier(jobId)
                .build();

        bStub.stopJob(stopJob);

    }

    public void listJobs(String name)   {


       ListJobResponse listReponse =  bStub.listJobs(ListJobRequest.getDefaultInstance());

       List<JobInfo> listJobs = listReponse.getJobInfosList();

       for(JobInfo job : listJobs)    {

            System.out.println("Listing jobs:" + job.toString());

       }

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