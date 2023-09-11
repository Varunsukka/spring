package com.student.studentmanagement.models;

import lombok.Data;

@Data
public class AddToSectionRequest {
    private String studentId;
    private String sectionName;
}
