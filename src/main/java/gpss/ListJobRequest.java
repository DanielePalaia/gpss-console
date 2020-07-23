// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpssjob.proto

package gpss;

/**
 * <pre>
 * ListJobs service Request message
 * </pre>
 *
 * Protobuf type {@code gpss.ListJobRequest}
 */
public final class ListJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gpss.ListJobRequest)
    ListJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListJobRequest.newBuilder() to construct.
  private ListJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListJobRequest() {
    jobIdentifiers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListJobRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jobIdentifiers_ = new java.util.ArrayList<gpss.JobIdentifier>();
              mutable_bitField0_ |= 0x00000001;
            }
            jobIdentifiers_.add(
                input.readMessage(gpss.JobIdentifier.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        jobIdentifiers_ = java.util.Collections.unmodifiableList(jobIdentifiers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gpss.Gpssjob.internal_static_gpss_ListJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gpss.Gpssjob.internal_static_gpss_ListJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gpss.ListJobRequest.class, gpss.ListJobRequest.Builder.class);
  }

  public static final int JOB_IDENTIFIERS_FIELD_NUMBER = 1;
  private java.util.List<gpss.JobIdentifier> jobIdentifiers_;
  /**
   * <pre>
   * id xxx not found, valid values returned
   * </pre>
   *
   * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<gpss.JobIdentifier> getJobIdentifiersList() {
    return jobIdentifiers_;
  }
  /**
   * <pre>
   * id xxx not found, valid values returned
   * </pre>
   *
   * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends gpss.JobIdentifierOrBuilder> 
      getJobIdentifiersOrBuilderList() {
    return jobIdentifiers_;
  }
  /**
   * <pre>
   * id xxx not found, valid values returned
   * </pre>
   *
   * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
   */
  @java.lang.Override
  public int getJobIdentifiersCount() {
    return jobIdentifiers_.size();
  }
  /**
   * <pre>
   * id xxx not found, valid values returned
   * </pre>
   *
   * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
   */
  @java.lang.Override
  public gpss.JobIdentifier getJobIdentifiers(int index) {
    return jobIdentifiers_.get(index);
  }
  /**
   * <pre>
   * id xxx not found, valid values returned
   * </pre>
   *
   * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
   */
  @java.lang.Override
  public gpss.JobIdentifierOrBuilder getJobIdentifiersOrBuilder(
      int index) {
    return jobIdentifiers_.get(index);
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
    for (int i = 0; i < jobIdentifiers_.size(); i++) {
      output.writeMessage(1, jobIdentifiers_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobIdentifiers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobIdentifiers_.get(i));
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
    if (!(obj instanceof gpss.ListJobRequest)) {
      return super.equals(obj);
    }
    gpss.ListJobRequest other = (gpss.ListJobRequest) obj;

    if (!getJobIdentifiersList()
        .equals(other.getJobIdentifiersList())) return false;
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
    if (getJobIdentifiersCount() > 0) {
      hash = (37 * hash) + JOB_IDENTIFIERS_FIELD_NUMBER;
      hash = (53 * hash) + getJobIdentifiersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gpss.ListJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.ListJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.ListJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.ListJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.ListJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gpss.ListJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gpss.ListJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gpss.ListJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gpss.ListJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gpss.ListJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gpss.ListJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gpss.ListJobRequest parseFrom(
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
  public static Builder newBuilder(gpss.ListJobRequest prototype) {
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
   * ListJobs service Request message
   * </pre>
   *
   * Protobuf type {@code gpss.ListJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gpss.ListJobRequest)
      gpss.ListJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gpss.Gpssjob.internal_static_gpss_ListJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gpss.Gpssjob.internal_static_gpss_ListJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gpss.ListJobRequest.class, gpss.ListJobRequest.Builder.class);
    }

    // Construct using gpss.ListJobRequest.newBuilder()
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
        getJobIdentifiersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jobIdentifiersBuilder_ == null) {
        jobIdentifiers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jobIdentifiersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gpss.Gpssjob.internal_static_gpss_ListJobRequest_descriptor;
    }

    @java.lang.Override
    public gpss.ListJobRequest getDefaultInstanceForType() {
      return gpss.ListJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public gpss.ListJobRequest build() {
      gpss.ListJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gpss.ListJobRequest buildPartial() {
      gpss.ListJobRequest result = new gpss.ListJobRequest(this);
      int from_bitField0_ = bitField0_;
      if (jobIdentifiersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jobIdentifiers_ = java.util.Collections.unmodifiableList(jobIdentifiers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobIdentifiers_ = jobIdentifiers_;
      } else {
        result.jobIdentifiers_ = jobIdentifiersBuilder_.build();
      }
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
      if (other instanceof gpss.ListJobRequest) {
        return mergeFrom((gpss.ListJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gpss.ListJobRequest other) {
      if (other == gpss.ListJobRequest.getDefaultInstance()) return this;
      if (jobIdentifiersBuilder_ == null) {
        if (!other.jobIdentifiers_.isEmpty()) {
          if (jobIdentifiers_.isEmpty()) {
            jobIdentifiers_ = other.jobIdentifiers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobIdentifiersIsMutable();
            jobIdentifiers_.addAll(other.jobIdentifiers_);
          }
          onChanged();
        }
      } else {
        if (!other.jobIdentifiers_.isEmpty()) {
          if (jobIdentifiersBuilder_.isEmpty()) {
            jobIdentifiersBuilder_.dispose();
            jobIdentifiersBuilder_ = null;
            jobIdentifiers_ = other.jobIdentifiers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobIdentifiersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobIdentifiersFieldBuilder() : null;
          } else {
            jobIdentifiersBuilder_.addAllMessages(other.jobIdentifiers_);
          }
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
      gpss.ListJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gpss.ListJobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<gpss.JobIdentifier> jobIdentifiers_ =
      java.util.Collections.emptyList();
    private void ensureJobIdentifiersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobIdentifiers_ = new java.util.ArrayList<gpss.JobIdentifier>(jobIdentifiers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        gpss.JobIdentifier, gpss.JobIdentifier.Builder, gpss.JobIdentifierOrBuilder> jobIdentifiersBuilder_;

    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public java.util.List<gpss.JobIdentifier> getJobIdentifiersList() {
      if (jobIdentifiersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobIdentifiers_);
      } else {
        return jobIdentifiersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public int getJobIdentifiersCount() {
      if (jobIdentifiersBuilder_ == null) {
        return jobIdentifiers_.size();
      } else {
        return jobIdentifiersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public gpss.JobIdentifier getJobIdentifiers(int index) {
      if (jobIdentifiersBuilder_ == null) {
        return jobIdentifiers_.get(index);
      } else {
        return jobIdentifiersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder setJobIdentifiers(
        int index, gpss.JobIdentifier value) {
      if (jobIdentifiersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.set(index, value);
        onChanged();
      } else {
        jobIdentifiersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder setJobIdentifiers(
        int index, gpss.JobIdentifier.Builder builderForValue) {
      if (jobIdentifiersBuilder_ == null) {
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobIdentifiersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder addJobIdentifiers(gpss.JobIdentifier value) {
      if (jobIdentifiersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.add(value);
        onChanged();
      } else {
        jobIdentifiersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder addJobIdentifiers(
        int index, gpss.JobIdentifier value) {
      if (jobIdentifiersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.add(index, value);
        onChanged();
      } else {
        jobIdentifiersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder addJobIdentifiers(
        gpss.JobIdentifier.Builder builderForValue) {
      if (jobIdentifiersBuilder_ == null) {
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.add(builderForValue.build());
        onChanged();
      } else {
        jobIdentifiersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder addJobIdentifiers(
        int index, gpss.JobIdentifier.Builder builderForValue) {
      if (jobIdentifiersBuilder_ == null) {
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobIdentifiersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder addAllJobIdentifiers(
        java.lang.Iterable<? extends gpss.JobIdentifier> values) {
      if (jobIdentifiersBuilder_ == null) {
        ensureJobIdentifiersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobIdentifiers_);
        onChanged();
      } else {
        jobIdentifiersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder clearJobIdentifiers() {
      if (jobIdentifiersBuilder_ == null) {
        jobIdentifiers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobIdentifiersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public Builder removeJobIdentifiers(int index) {
      if (jobIdentifiersBuilder_ == null) {
        ensureJobIdentifiersIsMutable();
        jobIdentifiers_.remove(index);
        onChanged();
      } else {
        jobIdentifiersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public gpss.JobIdentifier.Builder getJobIdentifiersBuilder(
        int index) {
      return getJobIdentifiersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public gpss.JobIdentifierOrBuilder getJobIdentifiersOrBuilder(
        int index) {
      if (jobIdentifiersBuilder_ == null) {
        return jobIdentifiers_.get(index);  } else {
        return jobIdentifiersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public java.util.List<? extends gpss.JobIdentifierOrBuilder> 
         getJobIdentifiersOrBuilderList() {
      if (jobIdentifiersBuilder_ != null) {
        return jobIdentifiersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobIdentifiers_);
      }
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public gpss.JobIdentifier.Builder addJobIdentifiersBuilder() {
      return getJobIdentifiersFieldBuilder().addBuilder(
          gpss.JobIdentifier.getDefaultInstance());
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public gpss.JobIdentifier.Builder addJobIdentifiersBuilder(
        int index) {
      return getJobIdentifiersFieldBuilder().addBuilder(
          index, gpss.JobIdentifier.getDefaultInstance());
    }
    /**
     * <pre>
     * id xxx not found, valid values returned
     * </pre>
     *
     * <code>repeated .gpss.JobIdentifier job_identifiers = 1;</code>
     */
    public java.util.List<gpss.JobIdentifier.Builder> 
         getJobIdentifiersBuilderList() {
      return getJobIdentifiersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        gpss.JobIdentifier, gpss.JobIdentifier.Builder, gpss.JobIdentifierOrBuilder> 
        getJobIdentifiersFieldBuilder() {
      if (jobIdentifiersBuilder_ == null) {
        jobIdentifiersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            gpss.JobIdentifier, gpss.JobIdentifier.Builder, gpss.JobIdentifierOrBuilder>(
                jobIdentifiers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jobIdentifiers_ = null;
      }
      return jobIdentifiersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:gpss.ListJobRequest)
  }

  // @@protoc_insertion_point(class_scope:gpss.ListJobRequest)
  private static final gpss.ListJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gpss.ListJobRequest();
  }

  public static gpss.ListJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListJobRequest>() {
    @java.lang.Override
    public ListJobRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListJobRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gpss.ListJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

