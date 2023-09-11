package com.studentmongo.studentmongo.controller;

import com.studentmongo.studentmongo.model.AddToCourseRequest;

import com.studentmongo.studentmongo.service.AddToCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addToCourseController {
    @Autowired
    private AddToCourseService addToCourseService;
    @PostMapping("/add-to-section")
    public AddToCourseRequest addToSection(@RequestBody AddToCourseRequest addToCourseRequest){
        return addToCourseService.addToSection(addToCourseRequest);
    }
}
