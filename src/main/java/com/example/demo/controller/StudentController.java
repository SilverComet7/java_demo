package com.example.demo.controller;


import com.example.demo.pojo.Result;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent/{id}")
    public Result<Student> getStudent(@PathVariable Integer id)
    {
        Student student = studentService.getStudent(id);
        return Result.success(student);
    }

    // insert a new student
    @PostMapping("/insertStudent")
    public Result<Student> insertStudent(@RequestBody Student student)
    {
        log.info("insertStudent: {}", student);
        studentService.insertStudent(student);
        return Result.success(null);
    }

    // delete a student 批量删除
    @DeleteMapping("/deleteStudent/{ids}")
    public Result<Void> deleteStudent(@PathVariable List<Integer> ids)
    {
        log.info("deleteStudent: {}", ids);
        studentService.deleteStudent(ids);
        return Result.success(null);
    }

    // update a student
    @PutMapping("/updateStudent")
    public Result<Student> updateStudent(@RequestBody Student student)
    {
        log.info("updateStudent: {}", student);
        studentService.updateStudent(student);
        return Result.success(null);
    }

    // get students
    @GetMapping("/getStudentList")
    public Result<PageInfo<Student>> getStudentList(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize, @RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
        PageInfo<Student> studentList = studentService.getStudentList(pageNum, pageSize, name, age);
        return Result.success(studentList);
    }
}
