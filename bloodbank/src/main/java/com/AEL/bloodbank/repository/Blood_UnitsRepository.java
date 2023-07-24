package com.AEL.bloodbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AEL.bloodbank.model.Blood_Units;

@Repository
public interface Blood_UnitsRepository extends JpaRepository<Blood_Units, Long> {

}
