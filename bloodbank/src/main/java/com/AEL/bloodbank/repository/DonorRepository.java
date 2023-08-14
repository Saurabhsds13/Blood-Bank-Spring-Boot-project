package com.AEL.bloodbank.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.AEL.bloodbank.model.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long>{
	
	@Query(value = "SELECT *  FROM donor WHERE email_id = :email_id", nativeQuery = true)
	Donor findOneByEmail(String email_id);
	
	
//	@Query(value = "SELECT * FROM donor WHERE city = :city", nativeQuery = true)
//	List<Donor> getDonorByLocation(String location);
		}