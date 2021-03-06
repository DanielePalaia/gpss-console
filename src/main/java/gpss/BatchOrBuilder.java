// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface BatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.Batch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * if number of rows &gt;= min_row, TODO file job server
   * for kafka source, it's better to max_count &gt;= 200
   * </pre>
   *
   * <code>int64 max_count = 1;</code>
   * @return The maxCount.
   */
  long getMaxCount();

  /**
   * <pre>
   * time interval, unit: milliseconds , 100W
   * </pre>
   *
   * <code>int64 interval_ms = 2;</code>
   * @return The intervalMs.
   */
  long getIntervalMs();
}
