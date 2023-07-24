package com.AEL.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.AEL.bloodbank.model.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long>{
	
			
		}

