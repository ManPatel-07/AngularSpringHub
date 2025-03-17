package com.example.demoorg.patient_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoorg.patient_service.entity.Patient;
import com.example.demoorg.patient_service.service.PatientService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/patient")
public class PatientController 
{
	private final PatientService patientService;
	
	@PostMapping(path = "/register")
	public ResponseEntity<?> registerNewPatient(@RequestBody Patient patient)
	{
		return new ResponseEntity<>(patientService.saveNewPatient(patient), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAll")
	public ResponseEntity<?> getAllPatients()
	{
		return new ResponseEntity<>(patientService.getAllPatients(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAppointments/{id}")
	public ResponseEntity<?> getAppointmentsByPatientId(@PathVariable("id") Long id)
	{
		return new ResponseEntity<>(patientService.getAppointmentByPatientId(id), HttpStatus.OK);
	}
}
