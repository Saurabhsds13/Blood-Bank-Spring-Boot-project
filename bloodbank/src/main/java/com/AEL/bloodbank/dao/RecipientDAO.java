package com.AEL.bloodbank.dao;

import java.util.List;
import java.util.Optional;

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
	
	public  List<Recipient> findall() {
		return recipientRepository.findAll();
	}
	
	public void delete(Recipient recipient ) {
		recipientRepository.delete(recipient);;
	}
	public Optional<Recipient> findOne(Long recipentId) {
		// return null;
		return recipientRepository.findById(recipentId);
	}
}
