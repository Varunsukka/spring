package com.studentmongo.studentmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document

public class Course {
    @Id
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents = new ArrayList<>();
    public Course(String courseName, String courseId) {
        this.courseId=courseId;
        this.courseName = courseName;
    }
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

}
