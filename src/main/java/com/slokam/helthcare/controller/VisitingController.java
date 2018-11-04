package com.slokam.helthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Visiting;
import com.slokam.helthcare.service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {
	@Autowired
	private VisitingService vs;
	@PostMapping
	public void saveVisiting(@RequestBody Visiting v){
		vs.saveVisiting(v);
	}
}
