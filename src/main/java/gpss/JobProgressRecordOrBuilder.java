// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface JobProgressRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.JobProgressRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.gpss.JobHistoryRecord record = 1;</code>
   * @return Whether the record field is set.
   */
  boolean hasRecord();
  /**
   * <code>.gpss.JobHistoryRecord record = 1;</code>
   * @return The record.
   */
  gpss.JobHistoryRecord getRecord();
  /**
   * <code>.gpss.JobHistoryRecord record = 1;</code>
   */
  gpss.JobHistoryRecordOrBuilder getRecordOrBuilder();

  /**
   * <code>int64 msg_size = 2;</code>
   * @return The msgSize.
   */
  long getMsgSize();
}
