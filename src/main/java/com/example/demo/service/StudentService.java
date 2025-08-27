package com.example.demo.service;


import com.example.demo.pojo.Student;

import java.util.List;


public interface StudentService {
    Student getStudent(Integer id);

    void insertStudent(Student student);

    void deleteStudent(List<Integer> ids);

    void updateStudent(Student student);

    List<Student> getStudentList();
}
