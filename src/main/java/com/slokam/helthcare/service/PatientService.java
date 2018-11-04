package com.slokam.helthcare.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.PatientDao;
import com.slokam.helthcare.entity.Patient;

@Service
public class PatientService {
	@Autowired
	private PatientDao pdao;

	public void savePatient(Patient p) {
		pdao.save(p);
	}
	public List<Object[]> getPatientByDisease(String dname){
		return pdao.getPatientByDisease(dname);
	}
	public List<String> getPatientBYDoctor(String doctorname){
		return pdao.getPatientBYDoctor(doctorname);
	}
	public List<String> getDoctorByPatient(String Pname){
		return pdao.getDoctorByPatient(Pname);
	}
	public List<Object[]> getDetailsBySdateAndEdate(Date startdate,Date enddate){
		return pdao.getDetailsBySdateAndEdate(startdate, enddate);
	}
	public List<Object[]> getallDetailsBySdateAndEdate(Date startdate,Date enddate){
		return pdao.getallDetailsBySdateAndEdate(startdate, enddate);
	}
}
