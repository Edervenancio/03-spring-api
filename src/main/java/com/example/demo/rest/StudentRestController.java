package com.example.demo.rest;


import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data... only once!

    @PostConstruct
    public void loadData(){
       theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("mario", "rossi"));
        theStudents.add(new Student("mary", "smith"));
    }

    // define end point for students

    @GetMapping("/students")

    public List<Student> getStudents(){


        return theStudents;


    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if ((studentId > theStudents.size()) || (studentId <0)){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }


}
