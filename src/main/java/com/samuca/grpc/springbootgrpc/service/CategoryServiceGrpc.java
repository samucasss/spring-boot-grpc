package com.samuca.grpc.springbootgrpc.service;

import com.samuca.grpc.springbootgrpc.model.Category;
import com.samuca.grpc.springbootgrpc.pb.CategoryServiceGrpc.CategoryServiceImplBase;
import com.samuca.grpc.springbootgrpc.pb.CourseCategory;
import com.samuca.grpc.springbootgrpc.repository.CategoryRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@GrpcService
public class CategoryServiceGrpc extends CategoryServiceImplBase {

    private final CategoryRepository categoryRepository;

    public CategoryServiceGrpc(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void listCategories(CourseCategory.blank request, StreamObserver<CourseCategory.CategoryList> responseObserver) {
        List<Category> categoryList = StreamSupport.stream(categoryRepository.findAll().spliterator(),
                false).toList();

        CourseCategory.CategoryList categoryListGrpc = CourseCategory.CategoryList.newBuilder()
                .addAllCategories(categoryList.stream()
                        .map(category -> CourseCategory.Category.newBuilder()
                                .setId(category.getId())
                                .setName(category.getName())
                                .setDescription(category.getDescription())
                                .build())
                        .toList())
                .build();

        responseObserver.onNext(categoryListGrpc);
        responseObserver.onCompleted();
    }

    @Override
    public void createCategory(CourseCategory.CreateCategoryRequest request, StreamObserver<CourseCategory.Category> responseObserver) {
        Category category = new Category(null, request.getName(), request.getDescription(), null);
        category = categoryRepository.save(category);

        CourseCategory.Category categoryGrpc = CourseCategory.Category.newBuilder()
                .setId(category.getId())
                .setName(category.getName())
                .setDescription(category.getDescription())
                .build();

        responseObserver.onNext(categoryGrpc);
        responseObserver.onCompleted();
    }

    @Override
    public void getCategory(CourseCategory.CategoryGetRequest request, StreamObserver<CourseCategory.Category> responseObserver) {
        Category category = categoryRepository.findById(request.getId())
                .orElse(null);

        if (category == null) {
            responseObserver.onError(new RuntimeException("Category not found"));

        } else {
            CourseCategory.Category categoryGrpc = CourseCategory.Category.newBuilder()
                    .setId(category.getId())
                    .setName(category.getName())
                    .setDescription(category.getDescription())
                    .build();

            responseObserver.onNext(categoryGrpc);
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<CourseCategory.CreateCategoryRequest> createCategoryStream(StreamObserver<CourseCategory.CategoryList> responseObserver) {
        return new StreamObserver<>() {
            private List<Category> categoryList = new ArrayList<>();

            @Override
            public void onNext(CourseCategory.CreateCategoryRequest value) {
                Category category = new Category(null, value.getName(), value.getDescription(), null);
                category = categoryRepository.save(category);
                categoryList.add(category);
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                CourseCategory.CategoryList categoryListGrpc = CourseCategory.CategoryList.newBuilder()
                        .addAllCategories(categoryList.stream()
                                .map(category -> CourseCategory.Category.newBuilder()
                                        .setId(category.getId())
                                        .setName(category.getName())
                                        .setDescription(category.getDescription())
                                        .build())
                                .toList())
                        .build();

                responseObserver.onNext(categoryListGrpc);
                responseObserver.onCompleted();
            }
        };

    }

    @Override
    public StreamObserver<CourseCategory.CreateCategoryRequest> createCategoryStreamBidirectional(StreamObserver<CourseCategory.Category> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(CourseCategory.CreateCategoryRequest value) {
                Category category = new Category(null, value.getName(), value.getDescription(), null);
                category = categoryRepository.save(category);

                CourseCategory.Category categoryGrpc = CourseCategory.Category.newBuilder()
                        .setId(category.getId())
                        .setName(category.getName())
                        .setDescription(category.getDescription())
                        .build();

                responseObserver.onNext(categoryGrpc);
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

    }
}
