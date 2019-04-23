package com.parc.demo.basicRest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


private static String responseBody  = "Hello, %s";


@GetMapping("/hello")
public ResponseEntity<String> hello(@RequestParam(value="name", defaultValue = "World") String name){
    
    return new ResponseEntity<>(String.format(responseBody, name), HttpStatus.OK);
}
}