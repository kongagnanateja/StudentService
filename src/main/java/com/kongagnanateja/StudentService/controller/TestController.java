package com.kongagnanateja.StudentService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
@CrossOrigin("*")
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity("hello", HttpStatus.OK);
    }

    @GetMapping("/hii")
    public ResponseEntity<?> hii() {
        return new ResponseEntity("hii", HttpStatus.OK);

    }
    @GetMapping("/students")
    public ResponseEntity<?> getStudents(){
        Map<String, Integer> students =new HashMap<>();
        students.put("hari",22);
        students.put("Girl",32);
        students.put("Siri",24);
        students.put("Pari",22);
        students.put("Jari",25);
        return new ResponseEntity("students",HttpStatus.OK);
    }
}