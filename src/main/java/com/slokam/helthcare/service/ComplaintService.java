package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.ComplaintDao;
import com.slokam.helthcare.entity.Complaint;

@Service
public class ComplaintService {
	@Autowired
	private ComplaintDao cdao;
	
	public void saveComplaint(Complaint c){
		cdao.save(c);
	}
	
}
