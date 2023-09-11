package com.student.studentmanagement.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
   // private String section;
    //private String grade;

}

