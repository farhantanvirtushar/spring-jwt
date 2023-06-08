package com.example.springjwt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/rest/home")
public class HomeController {
    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }


}
