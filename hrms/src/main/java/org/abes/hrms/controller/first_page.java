package org.abes.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first_page {
    @GetMapping("/")
    public String show(){
        return "<h2> this is my first page </h2>";
    }
}
