package com.AEL.bloodbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
	
}
