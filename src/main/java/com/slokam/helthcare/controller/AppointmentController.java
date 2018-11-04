package com.slokam.helthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Appointment;
import com.slokam.helthcare.service.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService as;
	@PostMapping
	public void saveAppointment(@RequestBody Appointment a){
		as.saveAppointment(a);
	}
}
