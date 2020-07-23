// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

/**
 * Protobuf type {@code gpss.FormatAvro}
 */
public final class FormatAvro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gpss.FormatAvro)
    FormatAvroOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FormatAvro.newBuilder() to construct.
  private FormatAvro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FormatAvro() {
    sourceColumnName_ = "";
    schemaUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FormatAvro();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FormatAvro(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceColumnName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            schemaUrl_ = s;
            break;
          }
          case 24: {

            bytesToBase64_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gpss.Gpssjob.internal_static_gpss_FormatAvro_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gpss.Gpssjob.internal_static_gpss_FormatAvro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gpss.FormatAvro.class, gpss.FormatAvro.Builder.class);
  }

  public static final int SOURCE_COLUMN_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object sourceColumnName_;
  /**
   * <pre>
   * the source column name , may be used in Expression/Mapping node.
   * </pre>
   *
   * <code>string source_column_name = 1;</code>
   * @return The sourceColumnName.
   */
  @java.lang.Override
  public java.lang.String getSourceColumnName() {
    java.lang.Object ref = sourceColumnName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceColumnName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the source column name , may be used in Expression/Mapping node.
   * </pre>
   *
   * <code>string source_column_name = 1;</code>
   * @return The bytes for sourceColumnName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceColumnNameBytes() {
    java.lang.Object ref = sourceColumnName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceColumnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object schemaUrl_;
  /**
   * <pre>
   * used for avro schema, if exists, then request avro schema from url
   * </pre>
   *
   * <code>string schema_url = 2;</code>
   * @return The schemaUrl.
   */
  @java.lang.Override
  public java.lang.String getSchemaUrl() {
    java.lang.Object ref = schemaUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schemaUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * used for avro schema, if exists, then request avro schema from url
   * </pre>
   *
   * <code>string schema_url = 2;</code>
   * @return The bytes for schemaUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSchemaUrlBytes() {
    java.lang.Object ref = schemaUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      schemaUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BYTES_TO_BASE64_FIELD_NUMBER = 3;
  private boolean bytesToBase64_;
  /**
   * <pre>
   * when set to true, bytes field in avro message will be converted to base64 encoded string. It works only if 'schema_url' exists.
   * </pre>
   *
   * <code>bool bytes_to_base64 = 3;</code>
   * @return The bytesToBase64.
   */
  @java.lang.Override
  public boolean getBytesToBase64() {
    return bytesToBase64_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSourceColumnNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceColumnName_);
    }
    if (!getSchemaUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, schemaUrl_);
    }
    if (bytesToBase64_ != false) {
      output.writeBool(3, bytesToBase64_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceColumnNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceColumnName_);
    }
    if (!getSchemaUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, schemaUrl_);
    }
    if (bytesToBase64_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, bytesToBase64_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof gpss.FormatAvro)) {
      return super.equals(obj);
    }
    gpss.FormatAvro other = (gpss.FormatAvro) obj;

    if (!getSourceColumnName()
        .equals(other.getSourceColumnName())) return false;
    if (!getSchemaUrl()
        .equals(other.getSchemaUrl())) return false;
    if (getBytesToBase64()
        != other.getBytesToBase64()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SOURCE_COLUMN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSourceColumnName().hashCode();
    hash = (37 * hash) + SCHEMA_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSchemaUrl().hashCode();
    hash = (37 * hash) + BYTES_TO_BASE64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBytesToBase64());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gpss.FormatAvro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.FormatAvro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.FormatAvro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.FormatAvro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.FormatAvro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.FormatAvro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.FormatAvro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gpss.FormatAvro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gpss.FormatAvro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gpss.FormatAvro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gpss.FormatAvro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gpss.FormatAvro parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(gpss.FormatAvro prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code gpss.FormatAvro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gpss.FormatAvro)
      gpss.FormatAvroOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gpss.Gpssjob.internal_static_gpss_FormatAvro_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gpss.Gpssjob.internal_static_gpss_FormatAvro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gpss.FormatAvro.class, gpss.FormatAvro.Builder.class);
    }

    // Construct using gpss.FormatAvro.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sourceColumnName_ = "";

      schemaUrl_ = "";

      bytesToBase64_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gpss.Gpssjob.internal_static_gpss_FormatAvro_descriptor;
    }

    @java.lang.Override
    public gpss.FormatAvro getDefaultInstanceForType() {
      return gpss.FormatAvro.getDefaultInstance();
    }

    @java.lang.Override
    public gpss.FormatAvro build() {
      gpss.FormatAvro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gpss.FormatAvro buildPartial() {
      gpss.FormatAvro result = new gpss.FormatAvro(this);
      result.sourceColumnName_ = sourceColumnName_;
      result.schemaUrl_ = schemaUrl_;
      result.bytesToBase64_ = bytesToBase64_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gpss.FormatAvro) {
        return mergeFrom((gpss.FormatAvro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gpss.FormatAvro other) {
      if (other == gpss.FormatAvro.getDefaultInstance()) return this;
      if (!other.getSourceColumnName().isEmpty()) {
        sourceColumnName_ = other.sourceColumnName_;
        onChanged();
      }
      if (!other.getSchemaUrl().isEmpty()) {
        schemaUrl_ = other.schemaUrl_;
        onChanged();
      }
      if (other.getBytesToBase64() != false) {
        setBytesToBase64(other.getBytesToBase64());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      gpss.FormatAvro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gpss.FormatAvro) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sourceColumnName_ = "";
    /**
     * <pre>
     * the source column name , may be used in Expression/Mapping node.
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     * @return The sourceColumnName.
     */
    public java.lang.String getSourceColumnName() {
      java.lang.Object ref = sourceColumnName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceColumnName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the source column name , may be used in Expression/Mapping node.
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     * @return The bytes for sourceColumnName.
     */
    public com.google.protobuf.ByteString
        getSourceColumnNameBytes() {
      java.lang.Object ref = sourceColumnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceColumnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the source column name , may be used in Expression/Mapping node.
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     * @param value The sourceColumnName to set.
     * @return This builder for chaining.
     */
    public Builder setSourceColumnName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceColumnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the source column name , may be used in Expression/Mapping node.
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceColumnName() {
      
      sourceColumnName_ = getDefaultInstance().getSourceColumnName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the source column name , may be used in Expression/Mapping node.
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     * @param value The bytes for sourceColumnName to set.
     * @return This builder for chaining.
     */
    public Builder setSourceColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceColumnName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object schemaUrl_ = "";
    /**
     * <pre>
     * used for avro schema, if exists, then request avro schema from url
     * </pre>
     *
     * <code>string schema_url = 2;</code>
     * @return The schemaUrl.
     */
    public java.lang.String getSchemaUrl() {
      java.lang.Object ref = schemaUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schemaUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * used for avro schema, if exists, then request avro schema from url
     * </pre>
     *
     * <code>string schema_url = 2;</code>
     * @return The bytes for schemaUrl.
     */
    public com.google.protobuf.ByteString
        getSchemaUrlBytes() {
      java.lang.Object ref = schemaUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schemaUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * used for avro schema, if exists, then request avro schema from url
     * </pre>
     *
     * <code>string schema_url = 2;</code>
     * @param value The schemaUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      schemaUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * used for avro schema, if exists, then request avro schema from url
     * </pre>
     *
     * <code>string schema_url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSchemaUrl() {
      
      schemaUrl_ = getDefaultInstance().getSchemaUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * used for avro schema, if exists, then request avro schema from url
     * </pre>
     *
     * <code>string schema_url = 2;</code>
     * @param value The bytes for schemaUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      schemaUrl_ = value;
      onChanged();
      return this;
    }

    private boolean bytesToBase64_ ;
    /**
     * <pre>
     * when set to true, bytes field in avro message will be converted to base64 encoded string. It works only if 'schema_url' exists.
     * </pre>
     *
     * <code>bool bytes_to_base64 = 3;</code>
     * @return The bytesToBase64.
     */
    @java.lang.Override
    public boolean getBytesToBase64() {
      return bytesToBase64_;
    }
    /**
     * <pre>
     * when set to true, bytes field in avro message will be converted to base64 encoded string. It works only if 'schema_url' exists.
     * </pre>
     *
     * <code>bool bytes_to_base64 = 3;</code>
     * @param value The bytesToBase64 to set.
     * @return This builder for chaining.
     */
    public Builder setBytesToBase64(boolean value) {
      
      bytesToBase64_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when set to true, bytes field in avro message will be converted to base64 encoded string. It works only if 'schema_url' exists.
     * </pre>
     *
     * <code>bool bytes_to_base64 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBytesToBase64() {
      
      bytesToBase64_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:gpss.FormatAvro)
  }

  // @@protoc_insertion_point(class_scope:gpss.FormatAvro)
  private static final gpss.FormatAvro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gpss.FormatAvro();
  }

  public static gpss.FormatAvro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormatAvro>
      PARSER = new com.google.protobuf.AbstractParser<FormatAvro>() {
    @java.lang.Override
    public FormatAvro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FormatAvro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FormatAvro> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FormatAvro> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gpss.FormatAvro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
