package com.example.demoorg.patient_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoorg.patient_service.entity.Patient;
import com.example.demoorg.patient_service.repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PatientService 
{
	private final PatientRepository patientRepo;
	
	public Patient saveNewPatient(Patient patient)
	{
		Patient savedPatient = patientRepo.save(patient);
		
		return savedPatient;
	}

	public List<Patient> getAllPatients() 
	{
		return patientRepo.findAll();
	}

	public Patient getAppointmentByPatientId(Long id) 
	{
		return patientRepo.findById(id).orElseThrow();
	}
	
}
