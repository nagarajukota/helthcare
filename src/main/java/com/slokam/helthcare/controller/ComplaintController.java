package com.slokam.helthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Complaint;
import com.slokam.helthcare.entity.Medication;
import com.slokam.helthcare.service.ComplaintService;

@RestController
@RequestMapping("complaint")
public class ComplaintController {
	@Autowired
	private ComplaintService cs;
	
	@PostMapping
	public void saveComplaint(@RequestBody Complaint c){
		List<Medication> mclist = c.getMclist();
		for (Medication m : mclist) {
			m.setComplaint(c);
		}
		cs.saveComplaint(c);
	}
}
