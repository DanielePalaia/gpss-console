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

    private final static Logger logger = Logger.getLogger(GpssWrapper.class.getName());

    public GpssWrapper(String gpssHost, int gpssPort /*String gpMasterHost, Integer gpMasterPort, String gpRoleName, String gpPasswd, String dbName, String tableName, String schemaName,*/)    {

        /* GPSS connection parameters */
        this.gpssHost = gpssHost;
        this.gpssPort = gpssPort;

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

    public String submitJob(String yamlPath, String name)    {

        String errorMessage = "";

        System.out.println("yamlPath:" + yamlPath + " name: " + name);
        try {
        String yamlContent = fileAsString(yamlPath);

        SubmitRawJobRequest builder = SubmitRawJobRequest.newBuilder()
                .setJobName(name)
                .setYamlContent(yamlContent)
                .build();


            bStub.submitRawJob(builder);
        }

        catch(Exception e)   {
            errorMessage = convertExceptionToString(e);
        }

       return errorMessage;

    }

    public String startJob(String name)     {

        String errorMessage = "";
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
            errorMessage = convertExceptionToString(e);
            return errorMessage;
        }

        return errorMessage;

    }

    public String stopJob(String name)     {

        String errorMessage = "";
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
            errorMessage = convertExceptionToString(e);
            return errorMessage;
        }

        return errorMessage;

    }

    public String deleteJob(String name)     {

        String errorMessage = "";

        JobIdentifier jobId = JobIdentifier.newBuilder()
                .setJobName(name)
                .build();

        RemoveJobRequest deleteJob = RemoveJobRequest.newBuilder()
                .setJobIdentifier(jobId)
                .build();

        try {
            bStub.removeJob(deleteJob);
        }
        catch (Exception e)    {
            errorMessage = convertExceptionToString(e);
            return errorMessage;
        }

        return errorMessage;

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

    private String fileAsString(String filePath) throws Exception  {

        StringBuilder sb = null;

        InputStream is = new FileInputStream(filePath);
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        String line = buf.readLine();
        sb = new StringBuilder();
        while (line != null) {
            sb.append(line).append("\n");
            line = buf.readLine();
        }


        return sb.toString();


    }

    private String convertExceptionToString(Exception e)   {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String sStackTrace = sw.toString(); // stack trace as a string
        return sStackTrace;
    }


}