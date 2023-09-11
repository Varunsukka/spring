package com.studentmongo.studentmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddToCourseRequest {
    private String studentId;
    private String courseId;
}
