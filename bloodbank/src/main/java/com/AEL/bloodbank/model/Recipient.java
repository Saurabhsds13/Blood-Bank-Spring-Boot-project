package com.AEL.bloodbank.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="recipient")
public class Recipient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="recipent_id")
	int recipentId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="email_id")
	String emailID;
	
	@Column(name="phone_no")
	String phoneNo;
	
	@Column(name="blood_type")
	String bloodType;
	
	@Column(name="date_of_birth")
	Date dateofBirth;
	String address;
	String city;
	String state;
	
	@Column(name="zip_code")
	int zipCode;

	
	// Getters and setters
	public int getRecipentId() {
		return recipentId;
	}

	public void setRecipentId(int recipentId) {
		this.recipentId = recipentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	//To String Method
	
	@Override
	public String toString() {
		return "Recipient [recipentId=" + recipentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailID=" + emailID + ", phoneNo=" + phoneNo + ", bloodType=" + bloodType + ", dateofBirth="
				+ dateofBirth + ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ "]";
	}

	//Constructor
	public Recipient(int recipentId, String firstName, String lastName, String emailID, String phoneNo,
			String bloodType, Date dateofBirth, String address, String city, String state, int zipCode) {
		super();
		this.recipentId = recipentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.phoneNo = phoneNo;
		this.bloodType = bloodType;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	
}