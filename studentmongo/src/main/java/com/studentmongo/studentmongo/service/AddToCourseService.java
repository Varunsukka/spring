package com.studentmongo.studentmongo.service;

import com.studentmongo.studentmongo.model.AddToCourseRequest;
import com.studentmongo.studentmongo.model.Course;
import com.studentmongo.studentmongo.model.Student;
import com.studentmongo.studentmongo.repository.CourseRepository;
import com.studentmongo.studentmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AddToCourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId)
                .orElse(null);
    }

    public Course getCourseByID(String courseId) {
        return courseRepository.findById(courseId)
                .orElse(null);
    }


    public AddToCourseRequest addToSection(AddToCourseRequest addToCourseRequest) {

        Student addStudent = studentRepository.findById(addToCourseRequest.getStudentId()).stream().findFirst().get();

        Course course = courseRepository.findById(addToCourseRequest.getCourseId()).stream().findFirst().get();
        course.addStudent(addStudent);
        courseRepository.save(course);
        return addToCourseRequest;
    }
}
