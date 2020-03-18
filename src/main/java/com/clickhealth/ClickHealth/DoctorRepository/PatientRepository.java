package com.clickhealth.ClickHealth.DoctorRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clickhealth.ClickHealth.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
