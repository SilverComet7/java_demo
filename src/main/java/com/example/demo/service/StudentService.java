package com.example.demo.service;


import com.example.demo.pojo.Student;


public interface StudentService {
    Student getStudent(Long id);

    void insertStudent(Student student);
}
