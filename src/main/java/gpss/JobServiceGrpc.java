package gpss;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: gpssjob.proto")
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "gpss.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gpss.SubmitJobRequest,
      gpss.SubmitJobResponse> getSubmitJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitJob",
      requestType = gpss.SubmitJobRequest.class,
      responseType = gpss.SubmitJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.SubmitJobRequest,
      gpss.SubmitJobResponse> getSubmitJobMethod() {
    io.grpc.MethodDescriptor<gpss.SubmitJobRequest, gpss.SubmitJobResponse> getSubmitJobMethod;
    if ((getSubmitJobMethod = JobServiceGrpc.getSubmitJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getSubmitJobMethod = JobServiceGrpc.getSubmitJobMethod) == null) {
          JobServiceGrpc.getSubmitJobMethod = getSubmitJobMethod =
              io.grpc.MethodDescriptor.<gpss.SubmitJobRequest, gpss.SubmitJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.SubmitJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.SubmitJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("SubmitJob"))
              .build();
        }
      }
    }
    return getSubmitJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.StartJobRequest,
      gpss.StartJobResponse> getStartJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartJob",
      requestType = gpss.StartJobRequest.class,
      responseType = gpss.StartJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.StartJobRequest,
      gpss.StartJobResponse> getStartJobMethod() {
    io.grpc.MethodDescriptor<gpss.StartJobRequest, gpss.StartJobResponse> getStartJobMethod;
    if ((getStartJobMethod = JobServiceGrpc.getStartJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getStartJobMethod = JobServiceGrpc.getStartJobMethod) == null) {
          JobServiceGrpc.getStartJobMethod = getStartJobMethod =
              io.grpc.MethodDescriptor.<gpss.StartJobRequest, gpss.StartJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.StartJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.StartJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("StartJob"))
              .build();
        }
      }
    }
    return getStartJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.StopJobRequest,
      gpss.StopJobResponse> getStopJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopJob",
      requestType = gpss.StopJobRequest.class,
      responseType = gpss.StopJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.StopJobRequest,
      gpss.StopJobResponse> getStopJobMethod() {
    io.grpc.MethodDescriptor<gpss.StopJobRequest, gpss.StopJobResponse> getStopJobMethod;
    if ((getStopJobMethod = JobServiceGrpc.getStopJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getStopJobMethod = JobServiceGrpc.getStopJobMethod) == null) {
          JobServiceGrpc.getStopJobMethod = getStopJobMethod =
              io.grpc.MethodDescriptor.<gpss.StopJobRequest, gpss.StopJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.StopJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.StopJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("StopJob"))
              .build();
        }
      }
    }
    return getStopJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.ListJobRequest,
      gpss.ListJobResponse> getListJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListJobs",
      requestType = gpss.ListJobRequest.class,
      responseType = gpss.ListJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.ListJobRequest,
      gpss.ListJobResponse> getListJobsMethod() {
    io.grpc.MethodDescriptor<gpss.ListJobRequest, gpss.ListJobResponse> getListJobsMethod;
    if ((getListJobsMethod = JobServiceGrpc.getListJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListJobsMethod = JobServiceGrpc.getListJobsMethod) == null) {
          JobServiceGrpc.getListJobsMethod = getListJobsMethod =
              io.grpc.MethodDescriptor.<gpss.ListJobRequest, gpss.ListJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.ListJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.ListJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ListJobs"))
              .build();
        }
      }
    }
    return getListJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.SubmitRawJobRequest,
      gpss.SubmitJobResponse> getSubmitRawJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitRawJob",
      requestType = gpss.SubmitRawJobRequest.class,
      responseType = gpss.SubmitJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.SubmitRawJobRequest,
      gpss.SubmitJobResponse> getSubmitRawJobMethod() {
    io.grpc.MethodDescriptor<gpss.SubmitRawJobRequest, gpss.SubmitJobResponse> getSubmitRawJobMethod;
    if ((getSubmitRawJobMethod = JobServiceGrpc.getSubmitRawJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getSubmitRawJobMethod = JobServiceGrpc.getSubmitRawJobMethod) == null) {
          JobServiceGrpc.getSubmitRawJobMethod = getSubmitRawJobMethod =
              io.grpc.MethodDescriptor.<gpss.SubmitRawJobRequest, gpss.SubmitJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitRawJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.SubmitRawJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.SubmitJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("SubmitRawJob"))
              .build();
        }
      }
    }
    return getSubmitRawJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.GetJobStatusRequest,
      gpss.GetJobStatusResponse> getGetJobStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobStatus",
      requestType = gpss.GetJobStatusRequest.class,
      responseType = gpss.GetJobStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.GetJobStatusRequest,
      gpss.GetJobStatusResponse> getGetJobStatusMethod() {
    io.grpc.MethodDescriptor<gpss.GetJobStatusRequest, gpss.GetJobStatusResponse> getGetJobStatusMethod;
    if ((getGetJobStatusMethod = JobServiceGrpc.getGetJobStatusMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetJobStatusMethod = JobServiceGrpc.getGetJobStatusMethod) == null) {
          JobServiceGrpc.getGetJobStatusMethod = getGetJobStatusMethod =
              io.grpc.MethodDescriptor.<gpss.GetJobStatusRequest, gpss.GetJobStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetJobStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetJobStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetJobStatus"))
              .build();
        }
      }
    }
    return getGetJobStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.RemoveJobRequest,
      gpss.RemoveJobResponse> getRemoveJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveJob",
      requestType = gpss.RemoveJobRequest.class,
      responseType = gpss.RemoveJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.RemoveJobRequest,
      gpss.RemoveJobResponse> getRemoveJobMethod() {
    io.grpc.MethodDescriptor<gpss.RemoveJobRequest, gpss.RemoveJobResponse> getRemoveJobMethod;
    if ((getRemoveJobMethod = JobServiceGrpc.getRemoveJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getRemoveJobMethod = JobServiceGrpc.getRemoveJobMethod) == null) {
          JobServiceGrpc.getRemoveJobMethod = getRemoveJobMethod =
              io.grpc.MethodDescriptor.<gpss.RemoveJobRequest, gpss.RemoveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.RemoveJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.RemoveJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("RemoveJob"))
              .build();
        }
      }
    }
    return getRemoveJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.GetJobConfigRequest,
      gpss.GetJobConfigResponse> getGetJobConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobConfig",
      requestType = gpss.GetJobConfigRequest.class,
      responseType = gpss.GetJobConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.GetJobConfigRequest,
      gpss.GetJobConfigResponse> getGetJobConfigMethod() {
    io.grpc.MethodDescriptor<gpss.GetJobConfigRequest, gpss.GetJobConfigResponse> getGetJobConfigMethod;
    if ((getGetJobConfigMethod = JobServiceGrpc.getGetJobConfigMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetJobConfigMethod = JobServiceGrpc.getGetJobConfigMethod) == null) {
          JobServiceGrpc.getGetJobConfigMethod = getGetJobConfigMethod =
              io.grpc.MethodDescriptor.<gpss.GetJobConfigRequest, gpss.GetJobConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetJobConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetJobConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetJobConfig"))
              .build();
        }
      }
    }
    return getGetJobConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.WaitJobRequest,
      gpss.WaitJobResponse> getWaitJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaitJob",
      requestType = gpss.WaitJobRequest.class,
      responseType = gpss.WaitJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.WaitJobRequest,
      gpss.WaitJobResponse> getWaitJobMethod() {
    io.grpc.MethodDescriptor<gpss.WaitJobRequest, gpss.WaitJobResponse> getWaitJobMethod;
    if ((getWaitJobMethod = JobServiceGrpc.getWaitJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getWaitJobMethod = JobServiceGrpc.getWaitJobMethod) == null) {
          JobServiceGrpc.getWaitJobMethod = getWaitJobMethod =
              io.grpc.MethodDescriptor.<gpss.WaitJobRequest, gpss.WaitJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WaitJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.WaitJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.WaitJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("WaitJob"))
              .build();
        }
      }
    }
    return getWaitJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.GetJobPartitionStatusRequest,
      gpss.GetJobPartitionStatusResponse> getGetJobPartitionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobPartitionStatus",
      requestType = gpss.GetJobPartitionStatusRequest.class,
      responseType = gpss.GetJobPartitionStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gpss.GetJobPartitionStatusRequest,
      gpss.GetJobPartitionStatusResponse> getGetJobPartitionStatusMethod() {
    io.grpc.MethodDescriptor<gpss.GetJobPartitionStatusRequest, gpss.GetJobPartitionStatusResponse> getGetJobPartitionStatusMethod;
    if ((getGetJobPartitionStatusMethod = JobServiceGrpc.getGetJobPartitionStatusMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetJobPartitionStatusMethod = JobServiceGrpc.getGetJobPartitionStatusMethod) == null) {
          JobServiceGrpc.getGetJobPartitionStatusMethod = getGetJobPartitionStatusMethod =
              io.grpc.MethodDescriptor.<gpss.GetJobPartitionStatusRequest, gpss.GetJobPartitionStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobPartitionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetJobPartitionStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetJobPartitionStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetJobPartitionStatus"))
              .build();
        }
      }
    }
    return getGetJobPartitionStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gpss.GetCurrentProgressRequest,
      gpss.GetCurrentProgressResponse> getGetCurrentProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentProgress",
      requestType = gpss.GetCurrentProgressRequest.class,
      responseType = gpss.GetCurrentProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gpss.GetCurrentProgressRequest,
      gpss.GetCurrentProgressResponse> getGetCurrentProgressMethod() {
    io.grpc.MethodDescriptor<gpss.GetCurrentProgressRequest, gpss.GetCurrentProgressResponse> getGetCurrentProgressMethod;
    if ((getGetCurrentProgressMethod = JobServiceGrpc.getGetCurrentProgressMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetCurrentProgressMethod = JobServiceGrpc.getGetCurrentProgressMethod) == null) {
          JobServiceGrpc.getGetCurrentProgressMethod = getGetCurrentProgressMethod =
              io.grpc.MethodDescriptor.<gpss.GetCurrentProgressRequest, gpss.GetCurrentProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetCurrentProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gpss.GetCurrentProgressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetCurrentProgress"))
              .build();
        }
      }
    }
    return getGetCurrentProgressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
        @java.lang.Override
        public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceStub(channel, callOptions);
        }
      };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
        @java.lang.Override
        public JobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceBlockingStub(channel, callOptions);
        }
      };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
        @java.lang.Override
        public JobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceFutureStub(channel, callOptions);
        }
      };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * begin of published api
     * </pre>
     */
    public void submitJob(gpss.SubmitJobRequest request,
        io.grpc.stub.StreamObserver<gpss.SubmitJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitJobMethod(), responseObserver);
    }

    /**
     */
    public void startJob(gpss.StartJobRequest request,
        io.grpc.stub.StreamObserver<gpss.StartJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartJobMethod(), responseObserver);
    }

    /**
     */
    public void stopJob(gpss.StopJobRequest request,
        io.grpc.stub.StreamObserver<gpss.StopJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopJobMethod(), responseObserver);
    }

    /**
     */
    public void listJobs(gpss.ListJobRequest request,
        io.grpc.stub.StreamObserver<gpss.ListJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubmitRawJob rpc is a compatible one which provides a quick submit by yaml file from gpsscli command
     * we strongly recomand using SubmitJob rpc instead
     * </pre>
     */
    public void submitRawJob(gpss.SubmitRawJobRequest request,
        io.grpc.stub.StreamObserver<gpss.SubmitJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitRawJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * unpublished api
     * </pre>
     */
    public void getJobStatus(gpss.GetJobStatusRequest request,
        io.grpc.stub.StreamObserver<gpss.GetJobStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobStatusMethod(), responseObserver);
    }

    /**
     */
    public void removeJob(gpss.RemoveJobRequest request,
        io.grpc.stub.StreamObserver<gpss.RemoveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveJobMethod(), responseObserver);
    }

    /**
     */
    public void getJobConfig(gpss.GetJobConfigRequest request,
        io.grpc.stub.StreamObserver<gpss.GetJobConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobConfigMethod(), responseObserver);
    }

    /**
     */
    public void waitJob(gpss.WaitJobRequest request,
        io.grpc.stub.StreamObserver<gpss.WaitJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWaitJobMethod(), responseObserver);
    }

    /**
     */
    public void getJobPartitionStatus(gpss.GetJobPartitionStatusRequest request,
        io.grpc.stub.StreamObserver<gpss.GetJobPartitionStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobPartitionStatusMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentProgress(gpss.GetCurrentProgressRequest request,
        io.grpc.stub.StreamObserver<gpss.GetCurrentProgressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentProgressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.SubmitJobRequest,
                gpss.SubmitJobResponse>(
                  this, METHODID_SUBMIT_JOB)))
          .addMethod(
            getStartJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.StartJobRequest,
                gpss.StartJobResponse>(
                  this, METHODID_START_JOB)))
          .addMethod(
            getStopJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.StopJobRequest,
                gpss.StopJobResponse>(
                  this, METHODID_STOP_JOB)))
          .addMethod(
            getListJobsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.ListJobRequest,
                gpss.ListJobResponse>(
                  this, METHODID_LIST_JOBS)))
          .addMethod(
            getSubmitRawJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.SubmitRawJobRequest,
                gpss.SubmitJobResponse>(
                  this, METHODID_SUBMIT_RAW_JOB)))
          .addMethod(
            getGetJobStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.GetJobStatusRequest,
                gpss.GetJobStatusResponse>(
                  this, METHODID_GET_JOB_STATUS)))
          .addMethod(
            getRemoveJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.RemoveJobRequest,
                gpss.RemoveJobResponse>(
                  this, METHODID_REMOVE_JOB)))
          .addMethod(
            getGetJobConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.GetJobConfigRequest,
                gpss.GetJobConfigResponse>(
                  this, METHODID_GET_JOB_CONFIG)))
          .addMethod(
            getWaitJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.WaitJobRequest,
                gpss.WaitJobResponse>(
                  this, METHODID_WAIT_JOB)))
          .addMethod(
            getGetJobPartitionStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gpss.GetJobPartitionStatusRequest,
                gpss.GetJobPartitionStatusResponse>(
                  this, METHODID_GET_JOB_PARTITION_STATUS)))
          .addMethod(
            getGetCurrentProgressMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                gpss.GetCurrentProgressRequest,
                gpss.GetCurrentProgressResponse>(
                  this, METHODID_GET_CURRENT_PROGRESS)))
          .build();
    }
  }

  /**
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * begin of published api
     * </pre>
     */
    public void submitJob(gpss.SubmitJobRequest request,
        io.grpc.stub.StreamObserver<gpss.SubmitJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startJob(gpss.StartJobRequest request,
        io.grpc.stub.StreamObserver<gpss.StartJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopJob(gpss.StopJobRequest request,
        io.grpc.stub.StreamObserver<gpss.StopJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listJobs(gpss.ListJobRequest request,
        io.grpc.stub.StreamObserver<gpss.ListJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubmitRawJob rpc is a compatible one which provides a quick submit by yaml file from gpsscli command
     * we strongly recomand using SubmitJob rpc instead
     * </pre>
     */
    public void submitRawJob(gpss.SubmitRawJobRequest request,
        io.grpc.stub.StreamObserver<gpss.SubmitJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitRawJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * unpublished api
     * </pre>
     */
    public void getJobStatus(gpss.GetJobStatusRequest request,
        io.grpc.stub.StreamObserver<gpss.GetJobStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeJob(gpss.RemoveJobRequest request,
        io.grpc.stub.StreamObserver<gpss.RemoveJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobConfig(gpss.GetJobConfigRequest request,
        io.grpc.stub.StreamObserver<gpss.GetJobConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void waitJob(gpss.WaitJobRequest request,
        io.grpc.stub.StreamObserver<gpss.WaitJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWaitJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobPartitionStatus(gpss.GetJobPartitionStatusRequest request,
        io.grpc.stub.StreamObserver<gpss.GetJobPartitionStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobPartitionStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentProgress(gpss.GetCurrentProgressRequest request,
        io.grpc.stub.StreamObserver<gpss.GetCurrentProgressResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrentProgressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * begin of published api
     * </pre>
     */
    public gpss.SubmitJobResponse submitJob(gpss.SubmitJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.StartJobResponse startJob(gpss.StartJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.StopJobResponse stopJob(gpss.StopJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.ListJobResponse listJobs(gpss.ListJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getListJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubmitRawJob rpc is a compatible one which provides a quick submit by yaml file from gpsscli command
     * we strongly recomand using SubmitJob rpc instead
     * </pre>
     */
    public gpss.SubmitJobResponse submitRawJob(gpss.SubmitRawJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitRawJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unpublished api
     * </pre>
     */
    public gpss.GetJobStatusResponse getJobStatus(gpss.GetJobStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.RemoveJobResponse removeJob(gpss.RemoveJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.GetJobConfigResponse getJobConfig(gpss.GetJobConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.WaitJobResponse waitJob(gpss.WaitJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getWaitJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public gpss.GetJobPartitionStatusResponse getJobPartitionStatus(gpss.GetJobPartitionStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobPartitionStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<gpss.GetCurrentProgressResponse> getCurrentProgress(
        gpss.GetCurrentProgressRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrentProgressMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * begin of published api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.SubmitJobResponse> submitJob(
        gpss.SubmitJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.StartJobResponse> startJob(
        gpss.StartJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.StopJobResponse> stopJob(
        gpss.StopJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.ListJobResponse> listJobs(
        gpss.ListJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubmitRawJob rpc is a compatible one which provides a quick submit by yaml file from gpsscli command
     * we strongly recomand using SubmitJob rpc instead
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.SubmitJobResponse> submitRawJob(
        gpss.SubmitRawJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitRawJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * unpublished api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.GetJobStatusResponse> getJobStatus(
        gpss.GetJobStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.RemoveJobResponse> removeJob(
        gpss.RemoveJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.GetJobConfigResponse> getJobConfig(
        gpss.GetJobConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.WaitJobResponse> waitJob(
        gpss.WaitJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWaitJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gpss.GetJobPartitionStatusResponse> getJobPartitionStatus(
        gpss.GetJobPartitionStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobPartitionStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_JOB = 0;
  private static final int METHODID_START_JOB = 1;
  private static final int METHODID_STOP_JOB = 2;
  private static final int METHODID_LIST_JOBS = 3;
  private static final int METHODID_SUBMIT_RAW_JOB = 4;
  private static final int METHODID_GET_JOB_STATUS = 5;
  private static final int METHODID_REMOVE_JOB = 6;
  private static final int METHODID_GET_JOB_CONFIG = 7;
  private static final int METHODID_WAIT_JOB = 8;
  private static final int METHODID_GET_JOB_PARTITION_STATUS = 9;
  private static final int METHODID_GET_CURRENT_PROGRESS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_JOB:
          serviceImpl.submitJob((gpss.SubmitJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.SubmitJobResponse>) responseObserver);
          break;
        case METHODID_START_JOB:
          serviceImpl.startJob((gpss.StartJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.StartJobResponse>) responseObserver);
          break;
        case METHODID_STOP_JOB:
          serviceImpl.stopJob((gpss.StopJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.StopJobResponse>) responseObserver);
          break;
        case METHODID_LIST_JOBS:
          serviceImpl.listJobs((gpss.ListJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.ListJobResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_RAW_JOB:
          serviceImpl.submitRawJob((gpss.SubmitRawJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.SubmitJobResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_STATUS:
          serviceImpl.getJobStatus((gpss.GetJobStatusRequest) request,
              (io.grpc.stub.StreamObserver<gpss.GetJobStatusResponse>) responseObserver);
          break;
        case METHODID_REMOVE_JOB:
          serviceImpl.removeJob((gpss.RemoveJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.RemoveJobResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_CONFIG:
          serviceImpl.getJobConfig((gpss.GetJobConfigRequest) request,
              (io.grpc.stub.StreamObserver<gpss.GetJobConfigResponse>) responseObserver);
          break;
        case METHODID_WAIT_JOB:
          serviceImpl.waitJob((gpss.WaitJobRequest) request,
              (io.grpc.stub.StreamObserver<gpss.WaitJobResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_PARTITION_STATUS:
          serviceImpl.getJobPartitionStatus((gpss.GetJobPartitionStatusRequest) request,
              (io.grpc.stub.StreamObserver<gpss.GetJobPartitionStatusResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_PROGRESS:
          serviceImpl.getCurrentProgress((gpss.GetCurrentProgressRequest) request,
              (io.grpc.stub.StreamObserver<gpss.GetCurrentProgressResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gpss.Gpssjob.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getSubmitJobMethod())
              .addMethod(getStartJobMethod())
              .addMethod(getStopJobMethod())
              .addMethod(getListJobsMethod())
              .addMethod(getSubmitRawJobMethod())
              .addMethod(getGetJobStatusMethod())
              .addMethod(getRemoveJobMethod())
              .addMethod(getGetJobConfigMethod())
              .addMethod(getWaitJobMethod())
              .addMethod(getGetJobPartitionStatusMethod())
              .addMethod(getGetCurrentProgressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
