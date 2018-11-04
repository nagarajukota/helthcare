package com.slokam.helthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.helthcare.entity.Medicine;
import com.slokam.helthcare.service.MedicineService;

@RestController
@RequestMapping("medicine")
public class MedicineController {
	@Autowired
	private MedicineService ms;
	
	@PostMapping
	public void saveMedicine(@RequestBody Medicine m){
		ms.saveMedicine(m);
	}
	@GetMapping("/byMedicine/{Mname}")
	public List<Object[]> getPatientbyMedicine(@PathVariable(name="Mname") String Mname){
		return ms.getPatientByMedicine(Mname);
	}
}
