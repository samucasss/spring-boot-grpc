package com.samuca.grpc.springbootgrpc.repository;

import com.samuca.grpc.springbootgrpc.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}
