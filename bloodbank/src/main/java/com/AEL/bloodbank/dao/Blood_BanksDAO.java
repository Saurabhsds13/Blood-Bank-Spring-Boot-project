package com.AEL.bloodbank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AEL.bloodbank.model.Blood_Banks;
import com.AEL.bloodbank.repository.Blood_BanksRepository;


@Service
public class Blood_BanksDAO {
	
	@Autowired
	Blood_BanksRepository blood_bankRepository;
	
	public Blood_Banks save(Blood_Banks bb) {
		
		return blood_bankRepository.save(bb);
	}
	
	public List<Blood_Banks> findallbb() {
		return blood_bankRepository.findAll();
	}
	
	public void deletebb(Blood_Banks bb) {
		blood_bankRepository.delete(bb);
	}
}
