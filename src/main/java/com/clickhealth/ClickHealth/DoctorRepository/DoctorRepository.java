package com.clickhealth.ClickHealth.DoctorRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clickhealth.ClickHealth.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
