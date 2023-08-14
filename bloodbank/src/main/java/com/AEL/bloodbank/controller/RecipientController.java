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

import com.AEL.bloodbank.dao.RecipientDAO;
import com.AEL.bloodbank.model.Recipient;

@RestController
@RequestMapping("/")
public class RecipientController {

	@Autowired
	RecipientDAO recipientDAO;
	
	@PostMapping("/registerRecipient")
	public Recipient createRecipient(@Validated @RequestBody Recipient recipient) {
		System.out.println("Recipient Register....!");
		return recipientDAO.save(recipient);
	}
		
	@GetMapping("/getAllRecipient")
	public List<Recipient> getAllRecipient(){
		return recipientDAO.findall();
	}
	
	//Delete_Recipient by ID
	@DeleteMapping("/deleteRecipient/{recipentId}")
	public ResponseEntity<Recipient> deleteRecipient(@PathVariable(value="recipentId") Long recipentId) {
			
		Optional<Recipient> recipient = recipientDAO.findOne(recipentId);
			if(recipient.isPresent()) {
				recipientDAO.delete(recipient.get());
				
			}
		    System.out.println("Recipient deleted wiht id : "+ " " +recipentId);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/findById/{recipientId}")
	public Optional<Recipient> findById(@PathVariable(value="recipientId") Long recipientId) {
		
		return recipientDAO.findOne(recipientId);
		
	}
	
	
}
