package com.example.demoorg.patient_service.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.demoorg.patient_service.entity.Patient;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_NULL)
public class Appointment 
{
    private Long id;

    private LocalDate appointmentDate;
    private LocalTime appointmentTime;

    @Column(name = "patient_id")
    private Patient patient;
    
    @Column(name = "doctor_id")
    private Doctor doctor;

}
