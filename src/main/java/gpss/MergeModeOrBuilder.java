// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface MergeModeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.MergeMode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * filter expression is used for filter source data
   * </pre>
   *
   * <code>string filter_expression = 1;</code>
   * @return The filterExpression.
   */
  java.lang.String getFilterExpression();
  /**
   * <pre>
   * filter expression is used for filter source data
   * </pre>
   *
   * <code>string filter_expression = 1;</code>
   * @return The bytes for filterExpression.
   */
  com.google.protobuf.ByteString
      getFilterExpressionBytes();

  /**
   * <pre>
   * primary key for update/upsert/delete
   * </pre>
   *
   * <code>repeated string match_columns = 2;</code>
   * @return A list containing the matchColumns.
   */
  java.util.List<java.lang.String>
      getMatchColumnsList();
  /**
   * <pre>
   * primary key for update/upsert/delete
   * </pre>
   *
   * <code>repeated string match_columns = 2;</code>
   * @return The count of matchColumns.
   */
  int getMatchColumnsCount();
  /**
   * <pre>
   * primary key for update/upsert/delete
   * </pre>
   *
   * <code>repeated string match_columns = 2;</code>
   * @param index The index of the element to return.
   * @return The matchColumns at the given index.
   */
  java.lang.String getMatchColumns(int index);
  /**
   * <pre>
   * primary key for update/upsert/delete
   * </pre>
   *
   * <code>repeated string match_columns = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the matchColumns at the given index.
   */
  com.google.protobuf.ByteString
      getMatchColumnsBytes(int index);

  /**
   * <pre>
   * columns to be updated
   * </pre>
   *
   * <code>repeated string update_columns = 3;</code>
   * @return A list containing the updateColumns.
   */
  java.util.List<java.lang.String>
      getUpdateColumnsList();
  /**
   * <pre>
   * columns to be updated
   * </pre>
   *
   * <code>repeated string update_columns = 3;</code>
   * @return The count of updateColumns.
   */
  int getUpdateColumnsCount();
  /**
   * <pre>
   * columns to be updated
   * </pre>
   *
   * <code>repeated string update_columns = 3;</code>
   * @param index The index of the element to return.
   * @return The updateColumns at the given index.
   */
  java.lang.String getUpdateColumns(int index);
  /**
   * <pre>
   * columns to be updated
   * </pre>
   *
   * <code>repeated string update_columns = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the updateColumns at the given index.
   */
  com.google.protobuf.ByteString
      getUpdateColumnsBytes(int index);

  /**
   * <pre>
   * columns used to sort rows, row with biggest value takes effect.
   * </pre>
   *
   * <code>repeated string order_columns = 4;</code>
   * @return A list containing the orderColumns.
   */
  java.util.List<java.lang.String>
      getOrderColumnsList();
  /**
   * <pre>
   * columns used to sort rows, row with biggest value takes effect.
   * </pre>
   *
   * <code>repeated string order_columns = 4;</code>
   * @return The count of orderColumns.
   */
  int getOrderColumnsCount();
  /**
   * <pre>
   * columns used to sort rows, row with biggest value takes effect.
   * </pre>
   *
   * <code>repeated string order_columns = 4;</code>
   * @param index The index of the element to return.
   * @return The orderColumns at the given index.
   */
  java.lang.String getOrderColumns(int index);
  /**
   * <pre>
   * columns used to sort rows, row with biggest value takes effect.
   * </pre>
   *
   * <code>repeated string order_columns = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the orderColumns at the given index.
   */
  com.google.protobuf.ByteString
      getOrderColumnsBytes(int index);

  /**
   * <pre>
   * where condition
   * </pre>
   *
   * <code>string update_condition = 5;</code>
   * @return The updateCondition.
   */
  java.lang.String getUpdateCondition();
  /**
   * <pre>
   * where condition
   * </pre>
   *
   * <code>string update_condition = 5;</code>
   * @return The bytes for updateCondition.
   */
  com.google.protobuf.ByteString
      getUpdateConditionBytes();

  /**
   * <pre>
   * where condition
   * </pre>
   *
   * <code>string delete_condition = 6;</code>
   * @return The deleteCondition.
   */
  java.lang.String getDeleteCondition();
  /**
   * <pre>
   * where condition
   * </pre>
   *
   * <code>string delete_condition = 6;</code>
   * @return The bytes for deleteCondition.
   */
  com.google.protobuf.ByteString
      getDeleteConditionBytes();
}