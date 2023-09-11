package com.studentmongo.studentmongo.service;

import com.studentmongo.studentmongo.model.Course;
import com.studentmongo.studentmongo.model.CourseRequest;
import com.studentmongo.studentmongo.repository.CourseRepository;
import com.studentmongo.studentmongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
    public Course addCourse(Course course){
        System.out.println(course);

        return courseRepository.save(new Course(course.getCourseId(),course.getCourseName()));
    }
    public void deleteCourseById(String courseId){
        courseRepository.deleteById(courseId);
    }
}
