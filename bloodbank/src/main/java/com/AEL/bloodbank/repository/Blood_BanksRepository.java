package com.AEL.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.AEL.bloodbank.model.Blood_Banks;



	
@Repository
public interface Blood_BanksRepository extends JpaRepository<Blood_Banks, Long>{
		
	
}
