// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface JobStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.JobStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.gpss.JobStatusCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.gpss.JobStatusCode code = 1;</code>
   * @return The code.
   */
  gpss.JobStatusCode getCode();

  /**
   * <code>string msg = 2;</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 2;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>.google.protobuf.Timestamp time = 3;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 3;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();
}