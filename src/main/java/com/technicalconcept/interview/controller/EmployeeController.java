package com.technicalconcept.interview.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    EmployeeController(){
        System.out.println("Employee controller bean created...");
    }
}
