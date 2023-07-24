package com.AEL.bloodbank.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.AEL.bloodbank.dao.DonorDAO;
import com.AEL.bloodbank.model.Donor;


@RestController
@RequestMapping("/")
public class DonorController {
	
	@Autowired
	DonorDAO donordao;
	
	
	//Register_donor
	@PostMapping("/donor")
	public Donor createDonor(@Validated  @RequestBody Donor Donor) {
		return donordao.save(Donor);
		}
	
	// Get All_Donor Names
	@GetMapping("/getAllDonor")
	public List<Donor> findAlldonor(){
		System.out.println("data retrive");
		return donordao.findAll();
	}	
	
	
	//Delete_Donor by donorID
	@DeleteMapping("/deleteDonor/{donorID}")
	
	
	public ResponseEntity<Donor> deleteDonor(@PathVariable(value="donorID") Long donorId) {
		
		Optional<Donor> Donor = donordao.findOne(donorId);

		donordao.delete(Donor.get());
		System.out.println("Donor deleted wiht id : "+ " " +donorId);
		return ResponseEntity.ok().build();
	}
	
	
	
	
	
	//Testing purpose
	@GetMapping("/hello")
	public String h() {
		System.out.println("API working.....!");
		return "Hello World";
	}
	
	
}