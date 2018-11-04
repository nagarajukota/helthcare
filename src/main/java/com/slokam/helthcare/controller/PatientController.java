package com.slokam.helthcare.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Patient;
import com.slokam.helthcare.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired
	private PatientService ps;
	
	@PostMapping
	public void savePatient(@RequestBody Patient p){
		ps.savePatient(p);
	}
	@GetMapping("/byDisease/{name}")
	public List<Object[]> getPatientByDisease(@PathVariable("name") String Dname){
		return ps.getPatientByDisease(Dname);
	}
	@GetMapping("/byDoctor/{dname}")
	public List<String> getPatientBYDoctor(@PathVariable("dname") String doctorname){
		return ps.getPatientBYDoctor(doctorname);
	}
	@GetMapping("/byPatient/{pname}")
	public List<String> getDoctorByPatient(@PathVariable("pname") String Pname){
		return ps.getDoctorByPatient(Pname);
	}
	@GetMapping("/byappointmentdates/{astart}/{aend}")
	public List<Object[]> getDetailsBySdateAndEdate(@PathVariable("astart") @DateTimeFormat(pattern="yyyy-MM-dd") Date startdate,
			@PathVariable("aend") @DateTimeFormat(pattern="yyyy-MM-dd") Date enddate){
		return ps.getDetailsBySdateAndEdate(startdate, enddate);
	}
	@GetMapping("/byVisitingdates/{vstart}/{vend}")
	public List<Object[]> getallDetailsBySdateAndEdate(@PathVariable("vstart") @DateTimeFormat(pattern="yyyy-MM-dd") Date startdate,
				@PathVariable("vend") @DateTimeFormat(pattern="yyyy-MM-dd") Date enddate){
		return ps.getallDetailsBySdateAndEdate(startdate, enddate);
	}
}
