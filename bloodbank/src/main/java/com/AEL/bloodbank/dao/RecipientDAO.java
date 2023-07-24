package com.AEL.bloodbank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AEL.bloodbank.model.Recipient;
import com.AEL.bloodbank.repository.RecipientRepository;

@Service
public class RecipientDAO {

	@Autowired
	RecipientRepository recipientRepository;
	
	public Recipient save(Recipient recipient) {
		return recipientRepository.save(recipient);
	}
	

	
}
