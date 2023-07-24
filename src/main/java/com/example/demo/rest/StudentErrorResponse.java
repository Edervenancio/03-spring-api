package com.example.demo.rest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentErrorResponse {

    private int status;
    private String message;
    private long timestamp;

    public StudentErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public StudentErrorResponse(){

    }




}
