package com.edcristo.crud_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edcristo.crud_spring.model.CourseModel;
import com.edcristo.crud_spring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<CourseModel> list() {
        return courseRepository.findAll();
    }

}
