package com.proto.cart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: cart/ShoppingCartService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShoppingCartServiceGrpc {

  private ShoppingCartServiceGrpc() {}

  public static final String SERVICE_NAME = "ShoppingCartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.cart.CreateProductRequest,
      com.proto.cart.CreateProductResponse> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = com.proto.cart.CreateProductRequest.class,
      responseType = com.proto.cart.CreateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.cart.CreateProductRequest,
      com.proto.cart.CreateProductResponse> getCreateProductMethod() {
    io.grpc.MethodDescriptor<com.proto.cart.CreateProductRequest, com.proto.cart.CreateProductResponse> getCreateProductMethod;
    if ((getCreateProductMethod = ShoppingCartServiceGrpc.getCreateProductMethod) == null) {
      synchronized (ShoppingCartServiceGrpc.class) {
        if ((getCreateProductMethod = ShoppingCartServiceGrpc.getCreateProductMethod) == null) {
          ShoppingCartServiceGrpc.getCreateProductMethod = getCreateProductMethod =
              io.grpc.MethodDescriptor.<com.proto.cart.CreateProductRequest, com.proto.cart.CreateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.CreateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.CreateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartServiceMethodDescriptorSupplier("CreateProduct"))
              .build();
        }
      }
    }
    return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.cart.ReadProductRequest,
      com.proto.cart.ReadProductResponse> getReadProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadProduct",
      requestType = com.proto.cart.ReadProductRequest.class,
      responseType = com.proto.cart.ReadProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.cart.ReadProductRequest,
      com.proto.cart.ReadProductResponse> getReadProductMethod() {
    io.grpc.MethodDescriptor<com.proto.cart.ReadProductRequest, com.proto.cart.ReadProductResponse> getReadProductMethod;
    if ((getReadProductMethod = ShoppingCartServiceGrpc.getReadProductMethod) == null) {
      synchronized (ShoppingCartServiceGrpc.class) {
        if ((getReadProductMethod = ShoppingCartServiceGrpc.getReadProductMethod) == null) {
          ShoppingCartServiceGrpc.getReadProductMethod = getReadProductMethod =
              io.grpc.MethodDescriptor.<com.proto.cart.ReadProductRequest, com.proto.cart.ReadProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.ReadProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.ReadProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartServiceMethodDescriptorSupplier("ReadProduct"))
              .build();
        }
      }
    }
    return getReadProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.cart.UpdateProductRequest,
      com.proto.cart.UpdateProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.proto.cart.UpdateProductRequest.class,
      responseType = com.proto.cart.UpdateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.cart.UpdateProductRequest,
      com.proto.cart.UpdateProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.proto.cart.UpdateProductRequest, com.proto.cart.UpdateProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = ShoppingCartServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ShoppingCartServiceGrpc.class) {
        if ((getUpdateProductMethod = ShoppingCartServiceGrpc.getUpdateProductMethod) == null) {
          ShoppingCartServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.proto.cart.UpdateProductRequest, com.proto.cart.UpdateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.UpdateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingCartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingCartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingCartServiceStub>() {
        @java.lang.Override
        public ShoppingCartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingCartServiceStub(channel, callOptions);
        }
      };
    return ShoppingCartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingCartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingCartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingCartServiceBlockingStub>() {
        @java.lang.Override
        public ShoppingCartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingCartServiceBlockingStub(channel, callOptions);
        }
      };
    return ShoppingCartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingCartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingCartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingCartServiceFutureStub>() {
        @java.lang.Override
        public ShoppingCartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingCartServiceFutureStub(channel, callOptions);
        }
      };
    return ShoppingCartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ShoppingCartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(com.proto.cart.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.CreateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void readProduct(com.proto.cart.ReadProductRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.ReadProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(com.proto.cart.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.cart.CreateProductRequest,
                com.proto.cart.CreateProductResponse>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getReadProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.cart.ReadProductRequest,
                com.proto.cart.ReadProductResponse>(
                  this, METHODID_READ_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.cart.UpdateProductRequest,
                com.proto.cart.UpdateProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ShoppingCartServiceStub extends io.grpc.stub.AbstractAsyncStub<ShoppingCartServiceStub> {
    private ShoppingCartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingCartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingCartServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(com.proto.cart.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.CreateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readProduct(com.proto.cart.ReadProductRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.ReadProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.proto.cart.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShoppingCartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShoppingCartServiceBlockingStub> {
    private ShoppingCartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingCartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingCartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.cart.CreateProductResponse createProduct(com.proto.cart.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.cart.ReadProductResponse readProduct(com.proto.cart.ReadProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.cart.UpdateProductResponse updateProduct(com.proto.cart.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShoppingCartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ShoppingCartServiceFutureStub> {
    private ShoppingCartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingCartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingCartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.cart.CreateProductResponse> createProduct(
        com.proto.cart.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.cart.ReadProductResponse> readProduct(
        com.proto.cart.ReadProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.cart.UpdateProductResponse> updateProduct(
        com.proto.cart.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_READ_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShoppingCartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingCartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.proto.cart.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.cart.CreateProductResponse>) responseObserver);
          break;
        case METHODID_READ_PRODUCT:
          serviceImpl.readProduct((com.proto.cart.ReadProductRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.cart.ReadProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.proto.cart.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.cart.UpdateProductResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ShoppingCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingCartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.cart.ShoppingCartServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingCartService");
    }
  }

  private static final class ShoppingCartServiceFileDescriptorSupplier
      extends ShoppingCartServiceBaseDescriptorSupplier {
    ShoppingCartServiceFileDescriptorSupplier() {}
  }

  private static final class ShoppingCartServiceMethodDescriptorSupplier
      extends ShoppingCartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingCartServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShoppingCartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingCartServiceFileDescriptorSupplier())
              .addMethod(getCreateProductMethod())
              .addMethod(getReadProductMethod())
              .addMethod(getUpdateProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
