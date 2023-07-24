package com.AEL.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AEL.bloodbank.model.Recipient;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient,Long> {
		
		
}
