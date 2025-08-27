package com.example.demo.pojo;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    // Getters and Setters
    private Long id;

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
