package com.studentmongo.studentmongo.service;

import com.studentmongo.studentmongo.model.Course;
import com.studentmongo.studentmongo.model.Student;
import com.studentmongo.studentmongo.repository.CourseRepository;
import com.studentmongo.studentmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student addStudent(Student student){

        return studentRepository.save(student);
    }
    public void deleteStudentById(String studentId) {
        studentRepository.deleteById(studentId);
    }

}
