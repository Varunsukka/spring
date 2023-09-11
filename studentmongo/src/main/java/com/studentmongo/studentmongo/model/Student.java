package com.studentmongo.studentmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor

public class Student {
    @Id
    private String studentId;
    private String firstName;
    private String lastName;

}
