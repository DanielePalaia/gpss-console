// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

public interface FileSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gpss.FileSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * file uri
   * </pre>
   *
   * <code>repeated string uri = 1;</code>
   * @return A list containing the uri.
   */
  java.util.List<java.lang.String>
      getUriList();
  /**
   * <pre>
   * file uri
   * </pre>
   *
   * <code>repeated string uri = 1;</code>
   * @return The count of uri.
   */
  int getUriCount();
  /**
   * <pre>
   * file uri
   * </pre>
   *
   * <code>repeated string uri = 1;</code>
   * @param index The index of the element to return.
   * @return The uri at the given index.
   */
  java.lang.String getUri(int index);
  /**
   * <pre>
   * file uri
   * </pre>
   *
   * <code>repeated string uri = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the uri at the given index.
   */
  com.google.protobuf.ByteString
      getUriBytes(int index);

  /**
   * <pre>
   * source data format
   * </pre>
   *
   * <code>.gpss.SourceDataFormat content = 2;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * source data format
   * </pre>
   *
   * <code>.gpss.SourceDataFormat content = 2;</code>
   * @return The content.
   */
  gpss.SourceDataFormat getContent();
  /**
   * <pre>
   * source data format
   * </pre>
   *
   * <code>.gpss.SourceDataFormat content = 2;</code>
   */
  gpss.SourceDataFormatOrBuilder getContentOrBuilder();

  /**
   * <pre>
   * source data format
   * </pre>
   *
   * <code>.gpss.SourceDataFormat meta = 3;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <pre>
   * source data format
   * </pre>
   *
   * <code>.gpss.SourceDataFormat meta = 3;</code>
   * @return The meta.
   */
  gpss.SourceDataFormat getMeta();
  /**
   * <pre>
   * source data format
   * </pre>
   *
   * <code>.gpss.SourceDataFormat meta = 3;</code>
   */
  gpss.SourceDataFormatOrBuilder getMetaOrBuilder();
}
