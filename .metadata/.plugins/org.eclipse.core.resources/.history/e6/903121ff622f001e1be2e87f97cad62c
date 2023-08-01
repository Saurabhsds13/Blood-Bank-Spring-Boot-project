package com.AEL.bloodbank.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AEL.bloodbank.model.Blood_Units;
import com.AEL.bloodbank.repository.Blood_UnitsRepository;

@Service
public class Blood_UnitsDAO {

	@Autowired
	Blood_UnitsRepository bloodunitsRepository;
	
	
	public Blood_Units save(Blood_Units bloodUnit) {
		System.out.println(bloodUnit);
		return bloodunitsRepository.save(bloodUnit);
	}
	
	public List<Blood_Units> findall()
	{
		return bloodunitsRepository.findAll();
		
	}
	
	public void deletebloodunit(Blood_Units blood_units){
		 bloodunitsRepository.delete(blood_units);
	}
	
	public Optional<Blood_Units> findOne(Long bloodUnitID) {
		// return null;
		return bloodunitsRepository.findById(bloodUnitID);
	}
}
