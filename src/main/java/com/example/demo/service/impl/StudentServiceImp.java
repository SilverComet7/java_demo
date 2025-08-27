package com.example.demo.service.impl;

import com.example.demo.dao.StudentRepositoryDao;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Resource
    private StudentMapper studentRepository;

    @Override
    public Student getStudent(Integer id) {
        return studentRepository.findById(id);
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
    public PageInfo<Student> getStudentList(Integer pageNum, Integer pageSize, String name, Integer age) {
         // 设置分页参数
         PageHelper.startPage(pageNum, pageSize);
         Page<Student> page = new Page<>();
         List<Student> students = studentRepository.findAll(name, age);
         page.setTotal(page.getTotal());
         page.addAll(students);
         return new PageInfo<>(page);
    }

}
