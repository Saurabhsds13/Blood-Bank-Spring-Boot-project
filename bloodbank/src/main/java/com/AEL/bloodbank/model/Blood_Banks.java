package com.AEL.bloodbank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Blood_Banks")
public class Blood_Banks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="blood_bank_id")
	private int bloodBankId;
	
	private String name;
	private String email;
	
	@Column(name="phone_no")
	private String phoneNO;
	
	private String address;
	private String city;
	
	@Column(name="zip_code")
	private int zipCode;

	public int getBloodBankId() {
		return bloodBankId;
	}

	public void setBloodBankId(int bloodBankId) {
		this.bloodBankId = bloodBankId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Blood_Banks [bloodBankId=" + bloodBankId + ", name=" + name + ", email=" + email + ", phoneNO="
				+ phoneNO + ", address=" + address + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
	
}