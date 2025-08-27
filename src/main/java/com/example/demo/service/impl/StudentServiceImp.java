package com.example.demo.service.impl;

import com.example.demo.dao.StudentRepositoryDao;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepositoryDao studentRepository;

    @Override
    public Student getStudent(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }
    @Override
    public void deleteStudent(List<Integer> ids) {
        studentRepository.deleteAllById(ids);
    }

    @Override
    public void updateStudent(Student student) {
        if (student. getId() != null) {
            studentRepository.save(student);
        } else {
            throw new IllegalArgumentException("Student ID must not be null for update");
        }
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}
