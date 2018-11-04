package com.slokam.helthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Disease;
import com.slokam.helthcare.service.DiseaseService;

@RestController
@RequestMapping("disease")
public class DiseaseController {
	@Autowired
	private DiseaseService ds;
	
	@PostMapping
	public void saveDisease(@RequestBody Disease d){
		ds.saveDisease(d);
	}
}
