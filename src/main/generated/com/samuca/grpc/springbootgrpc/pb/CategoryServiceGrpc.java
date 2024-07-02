package com.samuca.grpc.springbootgrpc.pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: course_category.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CategoryServiceGrpc {

  private CategoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pb.CategoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCreateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategory",
      requestType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest.class,
      responseType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCreateCategoryMethod() {
    io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCreateCategoryMethod;
    if ((getCreateCategoryMethod = CategoryServiceGrpc.getCreateCategoryMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getCreateCategoryMethod = CategoryServiceGrpc.getCreateCategoryMethod) == null) {
          CategoryServiceGrpc.getCreateCategoryMethod = getCreateCategoryMethod =
              io.grpc.MethodDescriptor.<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("CreateCategory"))
              .build();
        }
      }
    }
    return getCreateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> getCreateCategoryStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategoryStream",
      requestType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest.class,
      responseType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> getCreateCategoryStreamMethod() {
    io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> getCreateCategoryStreamMethod;
    if ((getCreateCategoryStreamMethod = CategoryServiceGrpc.getCreateCategoryStreamMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getCreateCategoryStreamMethod = CategoryServiceGrpc.getCreateCategoryStreamMethod) == null) {
          CategoryServiceGrpc.getCreateCategoryStreamMethod = getCreateCategoryStreamMethod =
              io.grpc.MethodDescriptor.<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategoryStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("CreateCategoryStream"))
              .build();
        }
      }
    }
    return getCreateCategoryStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCreateCategoryStreamBidirectionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategoryStreamBidirectional",
      requestType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest.class,
      responseType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCreateCategoryStreamBidirectionalMethod() {
    io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCreateCategoryStreamBidirectionalMethod;
    if ((getCreateCategoryStreamBidirectionalMethod = CategoryServiceGrpc.getCreateCategoryStreamBidirectionalMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getCreateCategoryStreamBidirectionalMethod = CategoryServiceGrpc.getCreateCategoryStreamBidirectionalMethod) == null) {
          CategoryServiceGrpc.getCreateCategoryStreamBidirectionalMethod = getCreateCategoryStreamBidirectionalMethod =
              io.grpc.MethodDescriptor.<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategoryStreamBidirectional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("CreateCategoryStreamBidirectional"))
              .build();
        }
      }
    }
    return getCreateCategoryStreamBidirectionalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> getListCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCategories",
      requestType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank.class,
      responseType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> getListCategoriesMethod() {
    io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank, com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> getListCategoriesMethod;
    if ((getListCategoriesMethod = CategoryServiceGrpc.getListCategoriesMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getListCategoriesMethod = CategoryServiceGrpc.getListCategoriesMethod) == null) {
          CategoryServiceGrpc.getListCategoriesMethod = getListCategoriesMethod =
              io.grpc.MethodDescriptor.<com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank, com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("ListCategories"))
              .build();
        }
      }
    }
    return getListCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getGetCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCategory",
      requestType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest.class,
      responseType = com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest,
      com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getGetCategoryMethod() {
    io.grpc.MethodDescriptor<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getGetCategoryMethod;
    if ((getGetCategoryMethod = CategoryServiceGrpc.getGetCategoryMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getGetCategoryMethod = CategoryServiceGrpc.getGetCategoryMethod) == null) {
          CategoryServiceGrpc.getGetCategoryMethod = getGetCategoryMethod =
              io.grpc.MethodDescriptor.<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest, com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("GetCategory"))
              .build();
        }
      }
    }
    return getGetCategoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub>() {
        @java.lang.Override
        public CategoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceStub(channel, callOptions);
        }
      };
    return CategoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub>() {
        @java.lang.Override
        public CategoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceBlockingStub(channel, callOptions);
        }
      };
    return CategoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub>() {
        @java.lang.Override
        public CategoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceFutureStub(channel, callOptions);
        }
      };
    return CategoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCategory(com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest> createCategoryStream(
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateCategoryStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest> createCategoryStreamBidirectional(
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateCategoryStreamBidirectionalMethod(), responseObserver);
    }

    /**
     */
    default void listCategories(com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank request,
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCategoriesMethod(), responseObserver);
    }

    /**
     */
    default void getCategory(com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest request,
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CategoryService.
   */
  public static abstract class CategoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CategoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CategoryService.
   */
  public static final class CategoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CategoryServiceStub> {
    private CategoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCategory(com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest> createCategoryStream(
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateCategoryStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest> createCategoryStreamBidirectional(
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateCategoryStreamBidirectionalMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void listCategories(com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank request,
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCategory(com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest request,
        io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CategoryService.
   */
  public static final class CategoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CategoryServiceBlockingStub> {
    private CategoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category createCategory(com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList listCategories(com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCategoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category getCategory(com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CategoryService.
   */
  public static final class CategoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CategoryServiceFutureStub> {
    private CategoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> createCategory(
        com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList> listCategories(
        com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category> getCategory(
        com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CATEGORY = 0;
  private static final int METHODID_LIST_CATEGORIES = 1;
  private static final int METHODID_GET_CATEGORY = 2;
  private static final int METHODID_CREATE_CATEGORY_STREAM = 3;
  private static final int METHODID_CREATE_CATEGORY_STREAM_BIDIRECTIONAL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>) responseObserver);
          break;
        case METHODID_LIST_CATEGORIES:
          serviceImpl.listCategories((com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank) request,
              (io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList>) responseObserver);
          break;
        case METHODID_GET_CATEGORY:
          serviceImpl.getCategory((com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest) request,
              (io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>) responseObserver);
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
        case METHODID_CREATE_CATEGORY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createCategoryStream(
              (io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList>) responseObserver);
        case METHODID_CREATE_CATEGORY_STREAM_BIDIRECTIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createCategoryStreamBidirectional(
              (io.grpc.stub.StreamObserver<com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>(
                service, METHODID_CREATE_CATEGORY)))
        .addMethod(
          getCreateCategoryStreamMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList>(
                service, METHODID_CREATE_CATEGORY_STREAM)))
        .addMethod(
          getCreateCategoryStreamBidirectionalMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.CreateCategoryRequest,
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>(
                service, METHODID_CREATE_CATEGORY_STREAM_BIDIRECTIONAL)))
        .addMethod(
          getListCategoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.blank,
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryList>(
                service, METHODID_LIST_CATEGORIES)))
        .addMethod(
          getGetCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.CategoryGetRequest,
              com.samuca.grpc.springbootgrpc.pb.CourseCategory.Category>(
                service, METHODID_GET_CATEGORY)))
        .build();
  }

  private static abstract class CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.samuca.grpc.springbootgrpc.pb.CourseCategory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryService");
    }
  }

  private static final class CategoryServiceFileDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier {
    CategoryServiceFileDescriptorSupplier() {}
  }

  private static final class CategoryServiceMethodDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CategoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CategoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryServiceFileDescriptorSupplier())
              .addMethod(getCreateCategoryMethod())
              .addMethod(getCreateCategoryStreamMethod())
              .addMethod(getCreateCategoryStreamBidirectionalMethod())
              .addMethod(getListCategoriesMethod())
              .addMethod(getGetCategoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
