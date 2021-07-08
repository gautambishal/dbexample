package com.example.dbexample.controller;

import com.example.dbexample.model.Teacher;
import com.example.dbexample.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher")
    public List<Teacher> teacherList(){

        return teacherService.getTeacherList();
    }
}
