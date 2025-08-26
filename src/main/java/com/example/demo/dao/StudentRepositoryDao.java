package com.example.demo.dao;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentRepositoryDao  extends JpaRepository<Student, Long> {


}