package com.example.demo.dao;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;


@Mapper
public interface StudentRepositoryDao  extends JpaRepository<Student, Long> {
}