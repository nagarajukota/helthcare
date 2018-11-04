package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.AppointmentDao;
import com.slokam.helthcare.entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao adao;
	public void saveAppointment(Appointment a){
		adao.save(a);
	}
}
