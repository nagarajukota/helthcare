package com.slokam.helthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.helthcare.dao.DiseaseDao;
import com.slokam.helthcare.entity.Disease;

@Service
public class DiseaseService {
	@Autowired
	private DiseaseDao ddao;

	public void saveDisease(Disease d) {
		ddao.save(d);
	}
	

}
