package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.DoctorDao;
import com.slokam.helthcare.entity.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao dod;

	public void saveDoctor(Doctor d) {
		dod.save(d);
	}
}
