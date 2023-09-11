package com.student.studentmanagement.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Section {
    private String name;
    private List<Student> studentList =new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
            ;

}
