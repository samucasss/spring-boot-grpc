package com.samuca.grpc.springbootgrpc.controller;

import com.samuca.grpc.springbootgrpc.model.Category;
import com.samuca.grpc.springbootgrpc.service.CategoryClientGrpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryClientController {

    private final CategoryClientGrpc categoryClientGrpc;

    public CategoryClientController(CategoryClientGrpc categoryClientGrpc) {
        this.categoryClientGrpc = categoryClientGrpc;
    }

    @GetMapping("/categories")
    public List<Category> listCategories() {
        return categoryClientGrpc.listCategories();
    }

}
