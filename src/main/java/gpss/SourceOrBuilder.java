// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface SourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.gpss.KafkaSource kafka = 1;</code>
   * @return Whether the kafka field is set.
   */
  boolean hasKafka();
  /**
   * <code>.gpss.KafkaSource kafka = 1;</code>
   * @return The kafka.
   */
  gpss.KafkaSource getKafka();
  /**
   * <code>.gpss.KafkaSource kafka = 1;</code>
   */
  gpss.KafkaSourceOrBuilder getKafkaOrBuilder();

  /**
   * <code>.gpss.FileSource file = 2;</code>
   * @return Whether the file field is set.
   */
  boolean hasFile();
  /**
   * <code>.gpss.FileSource file = 2;</code>
   * @return The file.
   */
  gpss.FileSource getFile();
  /**
   * <code>.gpss.FileSource file = 2;</code>
   */
  gpss.FileSourceOrBuilder getFileOrBuilder();

  public gpss.Source.UnitCase getUnitCase();
}