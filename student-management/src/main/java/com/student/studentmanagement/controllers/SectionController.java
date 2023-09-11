package com.student.studentmanagement.controllers;

import com.student.studentmanagement.models.AddToSectionRequest;
import com.student.studentmanagement.models.Section;
import com.student.studentmanagement.models.SectionRequest;
import com.student.studentmanagement.models.Student;
import com.student.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SectionController {
    @Autowired
    private StudentService studentService;
    private List<Section> sections = new ArrayList<>();
    @PostMapping("/sections")
    public void createSection(@RequestBody SectionRequest request){
        System.out.println(request+ "\n\n\n");
        sections.add(new Section(request.getSectionName()));
    }
    @PostMapping("/add-to-section")
    public void addToSection(@RequestBody AddToSectionRequest addToSectionRequest){
    //step1: Get student
        Student student = studentService.getStudentById(addToSectionRequest.getStudentId());
        // step2: Get Section
        Section section = getSectionByName(addToSectionRequest.getSectionName());
        // step 3: Add student to section
        section.addStudent(student);
    }
    @GetMapping("/sections")
    public List<Section> getSections(){
        return sections;
    }
    private Section getSectionByName(String sectionName){
        Optional<Section> result = sections.stream()
                .filter(section -> section.getName()
                        .equals(sectionName))
                .findFirst();
        if(result.isEmpty())
        {
            throw new RuntimeException("section not found");
        }
        else{
            return result.get();
        }
    }


}
