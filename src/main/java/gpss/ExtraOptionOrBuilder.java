// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface ExtraOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.ExtraOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.gpss.KafkaSourceExtraOption kafka = 1;</code>
   * @return Whether the kafka field is set.
   */
  boolean hasKafka();
  /**
   * <code>.gpss.KafkaSourceExtraOption kafka = 1;</code>
   * @return The kafka.
   */
  gpss.KafkaSourceExtraOption getKafka();
  /**
   * <code>.gpss.KafkaSourceExtraOption kafka = 1;</code>
   */
  gpss.KafkaSourceExtraOptionOrBuilder getKafkaOrBuilder();

  public gpss.ExtraOption.UnitCase getUnitCase();
}
