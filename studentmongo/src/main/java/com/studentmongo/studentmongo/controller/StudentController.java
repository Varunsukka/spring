package com.studentmongo.studentmongo.controller;

import com.studentmongo.studentmongo.model.Student;
import com.studentmongo.studentmongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @DeleteMapping("/students")
    public void deleteStudentById(@RequestBody String studentId){
        studentService.deleteStudentById(studentId);
    }

}
