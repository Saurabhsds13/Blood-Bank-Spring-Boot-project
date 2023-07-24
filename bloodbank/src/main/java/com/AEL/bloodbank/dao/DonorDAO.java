package com.AEL.bloodbank.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AEL.bloodbank.model.Donor;
import com.AEL.bloodbank.repository.DonorRepository;

	@Service
	public class DonorDAO {
		@Autowired 
		DonorRepository donorrepository;
		
		public Donor save(Donor donor) {
			return donorrepository.save(donor);
		}
		public List<Donor> findAll(){
			return donorrepository.findAll();
		}
		public void delete(Donor donor ) {
			 donorrepository.delete(donor);;
		}
		public Optional<Donor> findOne(Long donorId) {
			// return null;
			return donorrepository.findById(donorId);
		}
	}

