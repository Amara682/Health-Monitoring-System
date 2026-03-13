package com.example.health_monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/addpage")
    public String addPatientPage() {
        return "add_patient";
    }

    @GetMapping("/view")
    public String viewPatientsPage() {
        return "view_patients";
    }
}