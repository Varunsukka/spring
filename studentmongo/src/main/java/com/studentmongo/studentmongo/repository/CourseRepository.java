package com.studentmongo.studentmongo.repository;

import com.studentmongo.studentmongo.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository
        extends MongoRepository<Course, String> {
}
