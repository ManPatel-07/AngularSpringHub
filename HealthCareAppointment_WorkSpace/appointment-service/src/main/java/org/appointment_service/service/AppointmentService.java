package org.appointment_service.service;

import org.appointment_service.entity.Appointment;
import org.appointment_service.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AppointmentService 
{
	private final AppointmentRepository appointmentRepo;
	
	public Appointment saveNewAppointment(Appointment appointment)
	{
		return appointmentRepo.save(appointment);
	}
}
