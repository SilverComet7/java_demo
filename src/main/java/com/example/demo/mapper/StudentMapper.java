package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    Student findById(int id);
    void save(Student student);
    void deleteAllById(List<Integer> ids);
    void update(Student student);
    List<Student> findAll(String name, Integer age);
}
