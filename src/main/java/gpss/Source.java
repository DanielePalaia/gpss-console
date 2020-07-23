// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

/**
 * <pre>
 * Source is the source of data
 * </pre>
 *
 * Protobuf type {@code gpss.Source}
 */
public final class Source extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gpss.Source)
    SourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Source.newBuilder() to construct.
  private Source(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Source() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Source();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Source(
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
            gpss.KafkaSource.Builder subBuilder = null;
            if (unitCase_ == 1) {
              subBuilder = ((gpss.KafkaSource) unit_).toBuilder();
            }
            unit_ =
                input.readMessage(gpss.KafkaSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((gpss.KafkaSource) unit_);
              unit_ = subBuilder.buildPartial();
            }
            unitCase_ = 1;
            break;
          }
          case 18: {
            gpss.FileSource.Builder subBuilder = null;
            if (unitCase_ == 2) {
              subBuilder = ((gpss.FileSource) unit_).toBuilder();
            }
            unit_ =
                input.readMessage(gpss.FileSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((gpss.FileSource) unit_);
              unit_ = subBuilder.buildPartial();
            }
            unitCase_ = 2;
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
    return gpss.Gpssjob.internal_static_gpss_Source_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gpss.Gpssjob.internal_static_gpss_Source_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gpss.Source.class, gpss.Source.Builder.class);
  }

  private int unitCase_ = 0;
  private java.lang.Object unit_;
  public enum UnitCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    KAFKA(1),
    FILE(2),
    UNIT_NOT_SET(0);
    private final int value;
    private UnitCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UnitCase valueOf(int value) {
      return forNumber(value);
    }

    public static UnitCase forNumber(int value) {
      switch (value) {
        case 1: return KAFKA;
        case 2: return FILE;
        case 0: return UNIT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public UnitCase
  getUnitCase() {
    return UnitCase.forNumber(
        unitCase_);
  }

  public static final int KAFKA_FIELD_NUMBER = 1;
  /**
   * <code>.gpss.KafkaSource kafka = 1;</code>
   * @return Whether the kafka field is set.
   */
  @java.lang.Override
  public boolean hasKafka() {
    return unitCase_ == 1;
  }
  /**
   * <code>.gpss.KafkaSource kafka = 1;</code>
   * @return The kafka.
   */
  @java.lang.Override
  public gpss.KafkaSource getKafka() {
    if (unitCase_ == 1) {
       return (gpss.KafkaSource) unit_;
    }
    return gpss.KafkaSource.getDefaultInstance();
  }
  /**
   * <code>.gpss.KafkaSource kafka = 1;</code>
   */
  @java.lang.Override
  public gpss.KafkaSourceOrBuilder getKafkaOrBuilder() {
    if (unitCase_ == 1) {
       return (gpss.KafkaSource) unit_;
    }
    return gpss.KafkaSource.getDefaultInstance();
  }

  public static final int FILE_FIELD_NUMBER = 2;
  /**
   * <code>.gpss.FileSource file = 2;</code>
   * @return Whether the file field is set.
   */
  @java.lang.Override
  public boolean hasFile() {
    return unitCase_ == 2;
  }
  /**
   * <code>.gpss.FileSource file = 2;</code>
   * @return The file.
   */
  @java.lang.Override
  public gpss.FileSource getFile() {
    if (unitCase_ == 2) {
       return (gpss.FileSource) unit_;
    }
    return gpss.FileSource.getDefaultInstance();
  }
  /**
   * <code>.gpss.FileSource file = 2;</code>
   */
  @java.lang.Override
  public gpss.FileSourceOrBuilder getFileOrBuilder() {
    if (unitCase_ == 2) {
       return (gpss.FileSource) unit_;
    }
    return gpss.FileSource.getDefaultInstance();
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
    if (unitCase_ == 1) {
      output.writeMessage(1, (gpss.KafkaSource) unit_);
    }
    if (unitCase_ == 2) {
      output.writeMessage(2, (gpss.FileSource) unit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unitCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (gpss.KafkaSource) unit_);
    }
    if (unitCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (gpss.FileSource) unit_);
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
    if (!(obj instanceof gpss.Source)) {
      return super.equals(obj);
    }
    gpss.Source other = (gpss.Source) obj;

    if (!getUnitCase().equals(other.getUnitCase())) return false;
    switch (unitCase_) {
      case 1:
        if (!getKafka()
            .equals(other.getKafka())) return false;
        break;
      case 2:
        if (!getFile()
            .equals(other.getFile())) return false;
        break;
      case 0:
      default:
    }
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
    switch (unitCase_) {
      case 1:
        hash = (37 * hash) + KAFKA_FIELD_NUMBER;
        hash = (53 * hash) + getKafka().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFile().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gpss.Source parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.Source parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.Source parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.Source parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.Source parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.Source parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.Source parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gpss.Source parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gpss.Source parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gpss.Source parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gpss.Source parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gpss.Source parseFrom(
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
  public static Builder newBuilder(gpss.Source prototype) {
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
   * <pre>
   * Source is the source of data
   * </pre>
   *
   * Protobuf type {@code gpss.Source}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gpss.Source)
      gpss.SourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gpss.Gpssjob.internal_static_gpss_Source_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gpss.Gpssjob.internal_static_gpss_Source_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gpss.Source.class, gpss.Source.Builder.class);
    }

    // Construct using gpss.Source.newBuilder()
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
      unitCase_ = 0;
      unit_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gpss.Gpssjob.internal_static_gpss_Source_descriptor;
    }

    @java.lang.Override
    public gpss.Source getDefaultInstanceForType() {
      return gpss.Source.getDefaultInstance();
    }

    @java.lang.Override
    public gpss.Source build() {
      gpss.Source result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gpss.Source buildPartial() {
      gpss.Source result = new gpss.Source(this);
      if (unitCase_ == 1) {
        if (kafkaBuilder_ == null) {
          result.unit_ = unit_;
        } else {
          result.unit_ = kafkaBuilder_.build();
        }
      }
      if (unitCase_ == 2) {
        if (fileBuilder_ == null) {
          result.unit_ = unit_;
        } else {
          result.unit_ = fileBuilder_.build();
        }
      }
      result.unitCase_ = unitCase_;
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
      if (other instanceof gpss.Source) {
        return mergeFrom((gpss.Source)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gpss.Source other) {
      if (other == gpss.Source.getDefaultInstance()) return this;
      switch (other.getUnitCase()) {
        case KAFKA: {
          mergeKafka(other.getKafka());
          break;
        }
        case FILE: {
          mergeFile(other.getFile());
          break;
        }
        case UNIT_NOT_SET: {
          break;
        }
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
      gpss.Source parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gpss.Source) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int unitCase_ = 0;
    private java.lang.Object unit_;
    public UnitCase
        getUnitCase() {
      return UnitCase.forNumber(
          unitCase_);
    }

    public Builder clearUnit() {
      unitCase_ = 0;
      unit_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        gpss.KafkaSource, gpss.KafkaSource.Builder, gpss.KafkaSourceOrBuilder> kafkaBuilder_;
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     * @return Whether the kafka field is set.
     */
    @java.lang.Override
    public boolean hasKafka() {
      return unitCase_ == 1;
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     * @return The kafka.
     */
    @java.lang.Override
    public gpss.KafkaSource getKafka() {
      if (kafkaBuilder_ == null) {
        if (unitCase_ == 1) {
          return (gpss.KafkaSource) unit_;
        }
        return gpss.KafkaSource.getDefaultInstance();
      } else {
        if (unitCase_ == 1) {
          return kafkaBuilder_.getMessage();
        }
        return gpss.KafkaSource.getDefaultInstance();
      }
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    public Builder setKafka(gpss.KafkaSource value) {
      if (kafkaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        unit_ = value;
        onChanged();
      } else {
        kafkaBuilder_.setMessage(value);
      }
      unitCase_ = 1;
      return this;
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    public Builder setKafka(
        gpss.KafkaSource.Builder builderForValue) {
      if (kafkaBuilder_ == null) {
        unit_ = builderForValue.build();
        onChanged();
      } else {
        kafkaBuilder_.setMessage(builderForValue.build());
      }
      unitCase_ = 1;
      return this;
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    public Builder mergeKafka(gpss.KafkaSource value) {
      if (kafkaBuilder_ == null) {
        if (unitCase_ == 1 &&
            unit_ != gpss.KafkaSource.getDefaultInstance()) {
          unit_ = gpss.KafkaSource.newBuilder((gpss.KafkaSource) unit_)
              .mergeFrom(value).buildPartial();
        } else {
          unit_ = value;
        }
        onChanged();
      } else {
        if (unitCase_ == 1) {
          kafkaBuilder_.mergeFrom(value);
        }
        kafkaBuilder_.setMessage(value);
      }
      unitCase_ = 1;
      return this;
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    public Builder clearKafka() {
      if (kafkaBuilder_ == null) {
        if (unitCase_ == 1) {
          unitCase_ = 0;
          unit_ = null;
          onChanged();
        }
      } else {
        if (unitCase_ == 1) {
          unitCase_ = 0;
          unit_ = null;
        }
        kafkaBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    public gpss.KafkaSource.Builder getKafkaBuilder() {
      return getKafkaFieldBuilder().getBuilder();
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    @java.lang.Override
    public gpss.KafkaSourceOrBuilder getKafkaOrBuilder() {
      if ((unitCase_ == 1) && (kafkaBuilder_ != null)) {
        return kafkaBuilder_.getMessageOrBuilder();
      } else {
        if (unitCase_ == 1) {
          return (gpss.KafkaSource) unit_;
        }
        return gpss.KafkaSource.getDefaultInstance();
      }
    }
    /**
     * <code>.gpss.KafkaSource kafka = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        gpss.KafkaSource, gpss.KafkaSource.Builder, gpss.KafkaSourceOrBuilder> 
        getKafkaFieldBuilder() {
      if (kafkaBuilder_ == null) {
        if (!(unitCase_ == 1)) {
          unit_ = gpss.KafkaSource.getDefaultInstance();
        }
        kafkaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            gpss.KafkaSource, gpss.KafkaSource.Builder, gpss.KafkaSourceOrBuilder>(
                (gpss.KafkaSource) unit_,
                getParentForChildren(),
                isClean());
        unit_ = null;
      }
      unitCase_ = 1;
      onChanged();;
      return kafkaBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        gpss.FileSource, gpss.FileSource.Builder, gpss.FileSourceOrBuilder> fileBuilder_;
    /**
     * <code>.gpss.FileSource file = 2;</code>
     * @return Whether the file field is set.
     */
    @java.lang.Override
    public boolean hasFile() {
      return unitCase_ == 2;
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     * @return The file.
     */
    @java.lang.Override
    public gpss.FileSource getFile() {
      if (fileBuilder_ == null) {
        if (unitCase_ == 2) {
          return (gpss.FileSource) unit_;
        }
        return gpss.FileSource.getDefaultInstance();
      } else {
        if (unitCase_ == 2) {
          return fileBuilder_.getMessage();
        }
        return gpss.FileSource.getDefaultInstance();
      }
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    public Builder setFile(gpss.FileSource value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        unit_ = value;
        onChanged();
      } else {
        fileBuilder_.setMessage(value);
      }
      unitCase_ = 2;
      return this;
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    public Builder setFile(
        gpss.FileSource.Builder builderForValue) {
      if (fileBuilder_ == null) {
        unit_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }
      unitCase_ = 2;
      return this;
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    public Builder mergeFile(gpss.FileSource value) {
      if (fileBuilder_ == null) {
        if (unitCase_ == 2 &&
            unit_ != gpss.FileSource.getDefaultInstance()) {
          unit_ = gpss.FileSource.newBuilder((gpss.FileSource) unit_)
              .mergeFrom(value).buildPartial();
        } else {
          unit_ = value;
        }
        onChanged();
      } else {
        if (unitCase_ == 2) {
          fileBuilder_.mergeFrom(value);
        }
        fileBuilder_.setMessage(value);
      }
      unitCase_ = 2;
      return this;
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        if (unitCase_ == 2) {
          unitCase_ = 0;
          unit_ = null;
          onChanged();
        }
      } else {
        if (unitCase_ == 2) {
          unitCase_ = 0;
          unit_ = null;
        }
        fileBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    public gpss.FileSource.Builder getFileBuilder() {
      return getFileFieldBuilder().getBuilder();
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    @java.lang.Override
    public gpss.FileSourceOrBuilder getFileOrBuilder() {
      if ((unitCase_ == 2) && (fileBuilder_ != null)) {
        return fileBuilder_.getMessageOrBuilder();
      } else {
        if (unitCase_ == 2) {
          return (gpss.FileSource) unit_;
        }
        return gpss.FileSource.getDefaultInstance();
      }
    }
    /**
     * <code>.gpss.FileSource file = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        gpss.FileSource, gpss.FileSource.Builder, gpss.FileSourceOrBuilder> 
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        if (!(unitCase_ == 2)) {
          unit_ = gpss.FileSource.getDefaultInstance();
        }
        fileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            gpss.FileSource, gpss.FileSource.Builder, gpss.FileSourceOrBuilder>(
                (gpss.FileSource) unit_,
                getParentForChildren(),
                isClean());
        unit_ = null;
      }
      unitCase_ = 2;
      onChanged();;
      return fileBuilder_;
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


    // @@protoc_insertion_point(builder_scope:gpss.Source)
  }

  // @@protoc_insertion_point(class_scope:gpss.Source)
  private static final gpss.Source DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gpss.Source();
  }

  public static gpss.Source getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Source>
      PARSER = new com.google.protobuf.AbstractParser<Source>() {
    @java.lang.Override
    public Source parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Source(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Source> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Source> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gpss.Source getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

