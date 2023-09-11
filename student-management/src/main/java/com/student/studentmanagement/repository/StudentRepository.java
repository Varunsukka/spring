package com.student.studentmanagement.repository;

import com.student.studentmanagement.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {
    private List<Student> students= new ArrayList<>();
    public List<Student> getStudents(){
        return students;
    }
    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    public Student getStudentById(String studentId) {
        Optional<Student> result= students
                .stream()
                .filter(student -> student
                        .getStudentId()
                        .equals(studentId))
                .findFirst();
       // result.orElseGet(throw new RuntimeException("student not found"));
        return result.get();
    }
}
