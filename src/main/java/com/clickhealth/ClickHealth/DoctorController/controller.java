package com.clickhealth.ClickHealth.DoctorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clickhealth.ClickHealth.DoctorRepository.DoctorRepository;
import com.clickhealth.ClickHealth.DoctorRepository.PatientRepository;
import com.clickhealth.ClickHealth.model.Doctor;
import com.clickhealth.ClickHealth.model.Patient;

@RestController
@RequestMapping({"/api/click"})
public class controller 
{
	@Autowired
	private DoctorRepository doctorRepository;
	private PatientRepository patientRepository;
	
	
	@PostMapping({"/add-doctor"})
	@ResponseStatus(HttpStatus.CREATED)
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		
		return doctorRepository.save(doctor);
		
	}
	
	@PostMapping({"/add-patient"})
	@ResponseStatus(HttpStatus.CREATED)
	public Patient addPatient(@RequestBody Patient patient) {
		
		return patientRepository.save(patient);
		
	}

}
