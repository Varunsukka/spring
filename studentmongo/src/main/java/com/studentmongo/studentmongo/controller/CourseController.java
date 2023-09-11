package com.studentmongo.studentmongo.controller;

import com.studentmongo.studentmongo.model.Course;
import com.studentmongo.studentmongo.model.CourseRequest;
import com.studentmongo.studentmongo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return courseService.getCourses();
    }


    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @DeleteMapping("/courses")
    public void deleteCourseById(@RequestBody String courseId){
        courseService.deleteCourseById(courseId);
    }
}
