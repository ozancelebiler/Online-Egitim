package com.ozanc.repository;

import com.ozanc.repository.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends MongoRepository <Course, String> {




}
