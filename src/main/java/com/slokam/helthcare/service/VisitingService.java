package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.VisitingDao;
import com.slokam.helthcare.entity.Visiting;

@Service
public class VisitingService {
	@Autowired
	private VisitingDao vdao;
	
	public void saveVisiting(Visiting v){
		vdao.save(v);
	}
}
