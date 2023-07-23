package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

public class Student {

    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(){

    }
}
