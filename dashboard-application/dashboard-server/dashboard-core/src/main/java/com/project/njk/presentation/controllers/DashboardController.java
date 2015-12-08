package com.project.njk.presentation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @RequestMapping(value = "/api/greeting", method = RequestMethod.GET)
    public String greeting() {
        return "{\"value\":\"HELLO\"}";
    }
}
