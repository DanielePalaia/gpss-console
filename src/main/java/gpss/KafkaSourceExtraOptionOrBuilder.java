// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface KafkaSourceExtraOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.KafkaSourceExtraOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * specific for rdkafka, if there is no more data, an eof will return and the job will end.
   * </pre>
   *
   * <code>bool quit_at_eof = 1;</code>
   * @return The quitAtEof.
   */
  boolean getQuitAtEof();

  /**
   * <pre>
   * reset option
   * </pre>
   *
   * <code>.gpss.KafkaReset kafka_reset = 2;</code>
   * @return Whether the kafkaReset field is set.
   */
  boolean hasKafkaReset();
  /**
   * <pre>
   * reset option
   * </pre>
   *
   * <code>.gpss.KafkaReset kafka_reset = 2;</code>
   * @return The kafkaReset.
   */
  gpss.KafkaReset getKafkaReset();
  /**
   * <pre>
   * reset option
   * </pre>
   *
   * <code>.gpss.KafkaReset kafka_reset = 2;</code>
   */
  gpss.KafkaResetOrBuilder getKafkaResetOrBuilder();
}
