package com.springsecurity.jpa.springbootsecurityjpa.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/saj")
public class SajController {

    @GetMapping("/courseList")
    public List<String> getBankList() {
        return Arrays.asList("Maven","GIT","Appium");
    }
}
