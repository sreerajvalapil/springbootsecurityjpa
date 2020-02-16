package com.springsecurity.jpa.springbootsecurityjpa.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/sreyaan")
public class SreyaanController {
    @GetMapping("/toyList")
    public List<String> getToys() {
        return Arrays.asList("Truck","JCB","VolvoCar","Helicopter") ;
    }
}
