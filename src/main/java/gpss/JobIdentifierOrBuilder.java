// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface JobIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.JobIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique hash id
   * </pre>
   *
   * <code>string job_id = 1;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * unique hash id
   * </pre>
   *
   * <code>string job_id = 1;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * unique job name, map[name][job_uid], TODO rpc
   * </pre>
   *
   * <code>string job_name = 2;</code>
   * @return The jobName.
   */
  java.lang.String getJobName();
  /**
   * <pre>
   * unique job name, map[name][job_uid], TODO rpc
   * </pre>
   *
   * <code>string job_name = 2;</code>
   * @return The bytes for jobName.
   */
  com.google.protobuf.ByteString
      getJobNameBytes();

  public gpss.JobIdentifier.UnitCase getUnitCase();
}
