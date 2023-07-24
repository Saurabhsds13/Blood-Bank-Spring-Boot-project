package com.AEL.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AEL.bloodbank.dao.Blood_UnitsDAO;
import com.AEL.bloodbank.model.Blood_Units;

@RestController
@RequestMapping("/")
public class Blood_UnitsController {
	
	@Autowired
	Blood_UnitsDAO bloodUnitsDAO;
	
	@PostMapping("/bloodUnit")
	public Blood_Units createBloodUnit(@Validated @RequestBody Blood_Units bloodUnit) {
		System.out.println(bloodUnit);		
		return bloodUnitsDAO.save(bloodUnit);
	}
	
	@GetMapping("/bloodUnit")
	public List<Blood_Units> getAllUnits(){
		
		return bloodUnitsDAO.findall();
	
	}
	

}
