package com.AEL.bloodbank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AEL.bloodbank.model.Staff;
import com.AEL.bloodbank.repository.StaffRepository;

@Service
public class StaffDAO {

	@Autowired
	StaffRepository staffrepository;
	
	public Staff save(Staff staff) {
		return staffrepository.save(staff);
	}
	
	public List<Staff> getallStaff() {
		return staffrepository.findAll();
		}
}
