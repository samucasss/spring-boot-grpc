package com.samuca.grpc.springbootgrpc.service;

import com.samuca.grpc.springbootgrpc.model.Category;
import com.samuca.grpc.springbootgrpc.pb.CategoryServiceGrpc;
import com.samuca.grpc.springbootgrpc.pb.CourseCategory;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryClientGrpc {

    @GrpcClient("grpc-server")
    private CategoryServiceGrpc.CategoryServiceBlockingStub categoryServiceBlockingStub;

    public List<Category> listCategories() {
        CourseCategory.CategoryList categoryList = categoryServiceBlockingStub.listCategories(CourseCategory.blank.newBuilder()
                .build());

        List<Category> categories = categoryList.getCategoriesList().stream()
                .map(category -> new Category(category.getId(), category.getName(), category.getDescription(), null))
                .toList();

        return categories;
    }

}
