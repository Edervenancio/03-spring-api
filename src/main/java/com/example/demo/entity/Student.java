package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {


    private String firstName;

    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(){

    }
}
