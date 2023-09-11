package com.studentmongo.studentmongo.repository;

import com.studentmongo.studentmongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository
        extends MongoRepository<Student, String> {
}
