package com.example.demo.controller;


import com.example.demo.pojo.Result;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Long id)
    {
        return studentService.getStudent(id);
    }

    // insert a new student
    @PostMapping("/insertStudent")
    public String insertStudent(@RequestBody Student student)
    {
        log.info("insertStudent: {}", student);
//        Student newStudent = studentService.insertStudent(student);
        return Result.success(1).toString();
    }

}
