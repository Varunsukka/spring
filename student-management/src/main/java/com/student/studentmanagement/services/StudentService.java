package com.student.studentmanagement.services;

import com.student.studentmanagement.models.Student;
import com.student.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getStudents(){
        return studentRepository.getStudents();
    }
    public Student addStudent(Student student){
        return studentRepository.addStudent(student);
    }
    public Student getStudentById(String studentId){
       return studentRepository.getStudentById(studentId);
    }
}
