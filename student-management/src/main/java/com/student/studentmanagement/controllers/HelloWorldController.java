package com.student.studentmanagement.controllers;
import com.student.studentmanagement.models.Section;
import com.student.studentmanagement.models.Student;
import com.student.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class HelloWorldController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}
