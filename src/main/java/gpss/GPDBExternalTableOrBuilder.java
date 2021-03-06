// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface GPDBExternalTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.GPDBExternalTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * mode to process data, ex: insert/update/merge and etc. Default mode is insert.
   * </pre>
   *
   * <code>.gpss.Mode mode = 1;</code>
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   * <pre>
   * mode to process data, ex: insert/update/merge and etc. Default mode is insert.
   * </pre>
   *
   * <code>.gpss.Mode mode = 1;</code>
   * @return The mode.
   */
  gpss.Mode getMode();
  /**
   * <pre>
   * mode to process data, ex: insert/update/merge and etc. Default mode is insert.
   * </pre>
   *
   * <code>.gpss.Mode mode = 1;</code>
   */
  gpss.ModeOrBuilder getModeOrBuilder();

  /**
   * <pre>
   * when data flows, we will create some work tables
   * and put these work tables into work_schema
   * if it's empty, we will use the schema in GreenplumTargetUnit as default.
   * </pre>
   *
   * <code>string work_schema = 2;</code>
   * @return The workSchema.
   */
  java.lang.String getWorkSchema();
  /**
   * <pre>
   * when data flows, we will create some work tables
   * and put these work tables into work_schema
   * if it's empty, we will use the schema in GreenplumTargetUnit as default.
   * </pre>
   *
   * <code>string work_schema = 2;</code>
   * @return The bytes for workSchema.
   */
  com.google.protobuf.ByteString
      getWorkSchemaBytes();

  /**
   * <pre>
   * max error number in parsing source data per gpdb segment
   * </pre>
   *
   * <code>string error_limit = 3;</code>
   * @return The errorLimit.
   */
  java.lang.String getErrorLimit();
  /**
   * <pre>
   * max error number in parsing source data per gpdb segment
   * </pre>
   *
   * <code>string error_limit = 3;</code>
   * @return The bytes for errorLimit.
   */
  com.google.protobuf.ByteString
      getErrorLimitBytes();

  /**
   * <code>.gpss.BatchWindow batch_window = 4;</code>
   * @return Whether the batchWindow field is set.
   */
  boolean hasBatchWindow();
  /**
   * <code>.gpss.BatchWindow batch_window = 4;</code>
   * @return The batchWindow.
   */
  gpss.BatchWindow getBatchWindow();
  /**
   * <code>.gpss.BatchWindow batch_window = 4;</code>
   */
  gpss.BatchWindowOrBuilder getBatchWindowOrBuilder();

  /**
   * <pre>
   * &lt;column name, expression&gt; funcExpression(input data) -&gt; output data, the ordered expression is not guaranteed
   * </pre>
   *
   * <code>map&lt;string, string&gt; mapping = 5;</code>
   */
  int getMappingCount();
  /**
   * <pre>
   * &lt;column name, expression&gt; funcExpression(input data) -&gt; output data, the ordered expression is not guaranteed
   * </pre>
   *
   * <code>map&lt;string, string&gt; mapping = 5;</code>
   */
  boolean containsMapping(
      java.lang.String key);
  /**
   * Use {@link #getMappingMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMapping();
  /**
   * <pre>
   * &lt;column name, expression&gt; funcExpression(input data) -&gt; output data, the ordered expression is not guaranteed
   * </pre>
   *
   * <code>map&lt;string, string&gt; mapping = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMappingMap();
  /**
   * <pre>
   * &lt;column name, expression&gt; funcExpression(input data) -&gt; output data, the ordered expression is not guaranteed
   * </pre>
   *
   * <code>map&lt;string, string&gt; mapping = 5;</code>
   */

  java.lang.String getMappingOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * &lt;column name, expression&gt; funcExpression(input data) -&gt; output data, the ordered expression is not guaranteed
   * </pre>
   *
   * <code>map&lt;string, string&gt; mapping = 5;</code>
   */

  java.lang.String getMappingOrThrow(
      java.lang.String key);
}
