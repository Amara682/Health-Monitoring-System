package com.example.health_monitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.health_monitor.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}