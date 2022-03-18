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
  private static volatile io.grpc.MethodDescriptor<com.proto.cart.AddProductsRequest,
      com.proto.cart.AddProductResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProduct",
      requestType = com.proto.cart.AddProductsRequest.class,
      responseType = com.proto.cart.AddProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.cart.AddProductsRequest,
      com.proto.cart.AddProductResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.proto.cart.AddProductsRequest, com.proto.cart.AddProductResponse> getAddProductMethod;
    if ((getAddProductMethod = ShoppingCartServiceGrpc.getAddProductMethod) == null) {
      synchronized (ShoppingCartServiceGrpc.class) {
        if ((getAddProductMethod = ShoppingCartServiceGrpc.getAddProductMethod) == null) {
          ShoppingCartServiceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.proto.cart.AddProductsRequest, com.proto.cart.AddProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.AddProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.cart.AddProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartServiceMethodDescriptorSupplier("AddProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
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
    public void addProduct(com.proto.cart.AddProductsRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.AddProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.cart.AddProductsRequest,
                com.proto.cart.AddProductResponse>(
                  this, METHODID_ADD_PRODUCT)))
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
    public void addProduct(com.proto.cart.AddProductsRequest request,
        io.grpc.stub.StreamObserver<com.proto.cart.AddProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
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
    public com.proto.cart.AddProductResponse addProduct(com.proto.cart.AddProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.proto.cart.AddProductResponse> addProduct(
        com.proto.cart.AddProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT = 0;

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
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.proto.cart.AddProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.cart.AddProductResponse>) responseObserver);
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
              .addMethod(getAddProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
