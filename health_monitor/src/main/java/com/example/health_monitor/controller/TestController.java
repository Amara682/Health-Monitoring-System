package com.example.health_monitor.controller;

import com.example.health_monitor.entity.Patient;
import com.example.health_monitor.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/add")
    public String addPatient(Patient patient) {

        patientRepository.save(patient);

        return "redirect:/view";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}