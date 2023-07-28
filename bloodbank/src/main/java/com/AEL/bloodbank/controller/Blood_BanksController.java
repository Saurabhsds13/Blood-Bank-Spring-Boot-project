package com.AEL.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.AEL.bloodbank.dao.Blood_BanksDAO;
import com.AEL.bloodbank.model.Blood_Banks;


@RestController
@RequestMapping("/")
public class Blood_BanksController {
	
	@Autowired
	 Blood_BanksDAO blood_banksDAO;
	
	@PostMapping("/blood_banks")
	public Blood_Banks createBloodBank(@Validated @RequestBody Blood_Banks bb) {
		System.out.println("Blood Bank Created "+bb);
		return blood_banksDAO.save(bb);
	}
	
	@GetMapping("/getallbb")
	public List<Blood_Banks> findall() {
		System.out.println("Data retrive");
		return blood_banksDAO.findallbb();
	}
	
	@DeleteMapping("/deletebb/{bloodBankId}")
	public void deletebb(Blood_Banks bb) {
		System.out.println("Blood Bank Deleted : "+bb);
		blood_banksDAO.deletebb(bb);
	}
		
	
			
}
