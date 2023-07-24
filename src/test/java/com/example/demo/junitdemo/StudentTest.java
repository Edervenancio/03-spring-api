package com.example.demo.junitdemo;


import com.example.demo.entity.Student;
import com.example.demo.rest.StudentErrorResponse;
import com.example.demo.rest.StudentRestController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class StudentTest {



    @DisplayName("Check Student id existence")
    @Test
    void hasStudent(){


    }
}
