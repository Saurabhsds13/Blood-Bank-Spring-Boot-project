package com.AEL.bloodbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  	
import org.springframework.web.bind.annotation.RestController;

import com.AEL.bloodbank.dao.StaffDAO;
import com.AEL.bloodbank.model.Staff;

@RestController
@RequestMapping("/")
public class StaffController {

	@Autowired
	StaffDAO staffdao;
	
	@PostMapping("/createStaff")
	public Staff createStaff(@Validated @RequestBody Staff staff) {
		return staffdao.save(staff);
	}
	
	@GetMapping("/getallStaff")
	public List<Staff> getallStaff() {
		
	return staffdao.getallStaff();
	}
}