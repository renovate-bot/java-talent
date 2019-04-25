// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Request for updating a specified application.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.UpdateApplicationRequest}
 */
public final class UpdateApplicationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.UpdateApplicationRequest)
    UpdateApplicationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateApplicationRequest.newBuilder() to construct.
  private UpdateApplicationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateApplicationRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateApplicationRequest(
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
          case 10:
            {
              com.google.cloud.talent.v4beta1.Application.Builder subBuilder = null;
              if (application_ != null) {
                subBuilder = application_.toBuilder();
              }
              application_ =
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Application.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(application_);
                application_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.ApplicationServiceProto
        .internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.ApplicationServiceProto
        .internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.UpdateApplicationRequest.class,
            com.google.cloud.talent.v4beta1.UpdateApplicationRequest.Builder.class);
  }

  public static final int APPLICATION_FIELD_NUMBER = 1;
  private com.google.cloud.talent.v4beta1.Application application_;
  /**
   *
   *
   * <pre>
   * Required.
   * The application resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
   */
  public boolean hasApplication() {
    return application_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The application resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
   */
  public com.google.cloud.talent.v4beta1.Application getApplication() {
    return application_ == null
        ? com.google.cloud.talent.v4beta1.Application.getDefaultInstance()
        : application_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The application resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
   */
  public com.google.cloud.talent.v4beta1.ApplicationOrBuilder getApplicationOrBuilder() {
    return getApplication();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended for the best service
   * experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
   * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
   * A field mask to specify the application fields to be updated. Only
   * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended for the best service
   * experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
   * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
   * A field mask to specify the application fields to be updated. Only
   * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended for the best service
   * experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
   * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
   * A field mask to specify the application fields to be updated. Only
   * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (application_ != null) {
      output.writeMessage(1, getApplication());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (application_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getApplication());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.UpdateApplicationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.UpdateApplicationRequest other =
        (com.google.cloud.talent.v4beta1.UpdateApplicationRequest) obj;

    if (hasApplication() != other.hasApplication()) return false;
    if (hasApplication()) {
      if (!getApplication().equals(other.getApplication())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasApplication()) {
      hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
      hash = (53 * hash) + getApplication().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.talent.v4beta1.UpdateApplicationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for updating a specified application.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.UpdateApplicationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.UpdateApplicationRequest)
      com.google.cloud.talent.v4beta1.UpdateApplicationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.ApplicationServiceProto
          .internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.ApplicationServiceProto
          .internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.UpdateApplicationRequest.class,
              com.google.cloud.talent.v4beta1.UpdateApplicationRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.UpdateApplicationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (applicationBuilder_ == null) {
        application_ = null;
      } else {
        application_ = null;
        applicationBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.ApplicationServiceProto
          .internal_static_google_cloud_talent_v4beta1_UpdateApplicationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateApplicationRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.UpdateApplicationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateApplicationRequest build() {
      com.google.cloud.talent.v4beta1.UpdateApplicationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateApplicationRequest buildPartial() {
      com.google.cloud.talent.v4beta1.UpdateApplicationRequest result =
          new com.google.cloud.talent.v4beta1.UpdateApplicationRequest(this);
      if (applicationBuilder_ == null) {
        result.application_ = application_;
      } else {
        result.application_ = applicationBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.UpdateApplicationRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.UpdateApplicationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.UpdateApplicationRequest other) {
      if (other == com.google.cloud.talent.v4beta1.UpdateApplicationRequest.getDefaultInstance())
        return this;
      if (other.hasApplication()) {
        mergeApplication(other.getApplication());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.talent.v4beta1.UpdateApplicationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.UpdateApplicationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.talent.v4beta1.Application application_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Application,
            com.google.cloud.talent.v4beta1.Application.Builder,
            com.google.cloud.talent.v4beta1.ApplicationOrBuilder>
        applicationBuilder_;
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public boolean hasApplication() {
      return applicationBuilder_ != null || application_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Application getApplication() {
      if (applicationBuilder_ == null) {
        return application_ == null
            ? com.google.cloud.talent.v4beta1.Application.getDefaultInstance()
            : application_;
      } else {
        return applicationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public Builder setApplication(com.google.cloud.talent.v4beta1.Application value) {
      if (applicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        application_ = value;
        onChanged();
      } else {
        applicationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public Builder setApplication(
        com.google.cloud.talent.v4beta1.Application.Builder builderForValue) {
      if (applicationBuilder_ == null) {
        application_ = builderForValue.build();
        onChanged();
      } else {
        applicationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public Builder mergeApplication(com.google.cloud.talent.v4beta1.Application value) {
      if (applicationBuilder_ == null) {
        if (application_ != null) {
          application_ =
              com.google.cloud.talent.v4beta1.Application.newBuilder(application_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          application_ = value;
        }
        onChanged();
      } else {
        applicationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public Builder clearApplication() {
      if (applicationBuilder_ == null) {
        application_ = null;
        onChanged();
      } else {
        application_ = null;
        applicationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Application.Builder getApplicationBuilder() {

      onChanged();
      return getApplicationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.ApplicationOrBuilder getApplicationOrBuilder() {
      if (applicationBuilder_ != null) {
        return applicationBuilder_.getMessageOrBuilder();
      } else {
        return application_ == null
            ? com.google.cloud.talent.v4beta1.Application.getDefaultInstance()
            : application_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The application resource to replace the current resource in the system.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application application = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Application,
            com.google.cloud.talent.v4beta1.Application.Builder,
            com.google.cloud.talent.v4beta1.ApplicationOrBuilder>
        getApplicationFieldBuilder() {
      if (applicationBuilder_ == null) {
        applicationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Application,
                com.google.cloud.talent.v4beta1.Application.Builder,
                com.google.cloud.talent.v4beta1.ApplicationOrBuilder>(
                getApplication(), getParentForChildren(), isClean());
        application_ = null;
      }
      return applicationBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional but strongly recommended for the best service
     * experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateApplicationRequest.update_mask] is provided, only the specified fields in
     * [application][google.cloud.talent.v4beta1.UpdateApplicationRequest.application] are updated. Otherwise all the fields are updated.
     * A field mask to specify the application fields to be updated. Only
     * top level fields of [Application][google.cloud.talent.v4beta1.Application] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.UpdateApplicationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.UpdateApplicationRequest)
  private static final com.google.cloud.talent.v4beta1.UpdateApplicationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.UpdateApplicationRequest();
  }

  public static com.google.cloud.talent.v4beta1.UpdateApplicationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateApplicationRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateApplicationRequest>() {
        @java.lang.Override
        public UpdateApplicationRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateApplicationRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateApplicationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateApplicationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.UpdateApplicationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
