package org.appointment_service.controller;

import org.appointment_service.entity.Appointment;
import org.appointment_service.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/appointment")
public class AppointmentController 
{
	private final AppointmentService appointmentService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<?> saveAppointment(@RequestBody Appointment appointment)
	{
		return new ResponseEntity<>(appointmentService.saveNewAppointment(appointment), HttpStatus.OK);
	}
}
