// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cart/ShoppingCartService.proto

package com.proto.cart;

/**
 * Protobuf type {@code ReadProductResponse}
 */
public final class ReadProductResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReadProductResponse)
    ReadProductResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadProductResponse.newBuilder() to construct.
  private ReadProductResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadProductResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadProductResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadProductResponse(
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
            com.proto.cart.Product.Builder subBuilder = null;
            if (product_ != null) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(com.proto.cart.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
            }

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
    return com.proto.cart.ShoppingCartServiceOuterClass.internal_static_ReadProductResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.cart.ShoppingCartServiceOuterClass.internal_static_ReadProductResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.cart.ReadProductResponse.class, com.proto.cart.ReadProductResponse.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private com.proto.cart.Product product_;
  /**
   * <code>.Product product = 1;</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <code>.Product product = 1;</code>
   * @return The product.
   */
  @java.lang.Override
  public com.proto.cart.Product getProduct() {
    return product_ == null ? com.proto.cart.Product.getDefaultInstance() : product_;
  }
  /**
   * <code>.Product product = 1;</code>
   */
  @java.lang.Override
  public com.proto.cart.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
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
    if (product_ != null) {
      output.writeMessage(1, getProduct());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProduct());
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
    if (!(obj instanceof com.proto.cart.ReadProductResponse)) {
      return super.equals(obj);
    }
    com.proto.cart.ReadProductResponse other = (com.proto.cart.ReadProductResponse) obj;

    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
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
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.cart.ReadProductResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.cart.ReadProductResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.cart.ReadProductResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.cart.ReadProductResponse parseFrom(
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
  public static Builder newBuilder(com.proto.cart.ReadProductResponse prototype) {
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
   * Protobuf type {@code ReadProductResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReadProductResponse)
      com.proto.cart.ReadProductResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.cart.ShoppingCartServiceOuterClass.internal_static_ReadProductResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.cart.ShoppingCartServiceOuterClass.internal_static_ReadProductResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.cart.ReadProductResponse.class, com.proto.cart.ReadProductResponse.Builder.class);
    }

    // Construct using com.proto.cart.ReadProductResponse.newBuilder()
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
      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.cart.ShoppingCartServiceOuterClass.internal_static_ReadProductResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.cart.ReadProductResponse getDefaultInstanceForType() {
      return com.proto.cart.ReadProductResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.cart.ReadProductResponse build() {
      com.proto.cart.ReadProductResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.cart.ReadProductResponse buildPartial() {
      com.proto.cart.ReadProductResponse result = new com.proto.cart.ReadProductResponse(this);
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
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
      if (other instanceof com.proto.cart.ReadProductResponse) {
        return mergeFrom((com.proto.cart.ReadProductResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.cart.ReadProductResponse other) {
      if (other == com.proto.cart.ReadProductResponse.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
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
      com.proto.cart.ReadProductResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.cart.ReadProductResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.cart.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.cart.Product, com.proto.cart.Product.Builder, com.proto.cart.ProductOrBuilder> productBuilder_;
    /**
     * <code>.Product product = 1;</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <code>.Product product = 1;</code>
     * @return The product.
     */
    public com.proto.cart.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? com.proto.cart.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>.Product product = 1;</code>
     */
    public Builder setProduct(com.proto.cart.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Product product = 1;</code>
     */
    public Builder setProduct(
        com.proto.cart.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Product product = 1;</code>
     */
    public Builder mergeProduct(com.proto.cart.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            com.proto.cart.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Product product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Product product = 1;</code>
     */
    public com.proto.cart.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.Product product = 1;</code>
     */
    public com.proto.cart.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            com.proto.cart.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <code>.Product product = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.cart.Product, com.proto.cart.Product.Builder, com.proto.cart.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.cart.Product, com.proto.cart.Product.Builder, com.proto.cart.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ReadProductResponse)
  }

  // @@protoc_insertion_point(class_scope:ReadProductResponse)
  private static final com.proto.cart.ReadProductResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.cart.ReadProductResponse();
  }

  public static com.proto.cart.ReadProductResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadProductResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadProductResponse>() {
    @java.lang.Override
    public ReadProductResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadProductResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadProductResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadProductResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.cart.ReadProductResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

