package com.samuca.grpc.springbootgrpc.repository;

import com.samuca.grpc.springbootgrpc.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String>{
}
