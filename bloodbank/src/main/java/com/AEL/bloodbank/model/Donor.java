package com.AEL.bloodbank.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="donor")
public class Donor {

	@Id  //Primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //  Auto increment the id value
	@Column(name="donor_id") // Column name in database
	private int donorId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email_id")
	private String emailID;
	
	@Column(name="phone_no")
	private String phoneNo;
	
//	@PrimaryKeyJoinColumn(name="Blood_Unit_ID")
//	@JoinColumn(name="Blood_Unit_ID")
//	@OneToOne(mappedBy = "donor",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
//	private Blood_Units blood_units;
	
	
	 @OneToMany(mappedBy = "donor",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	   private List<Blood_Units> bloodUnits;
	
	@Column(name="date_of_birth")
	private Date dateofBirth;
	private String address;
	private String city;
	private String state;
	
	@Column(name="zip_code")
	private int zipCode;
	
	@Column(name="last_donation_date")
	private Date lastdonationDate;

	
	// Getters and Setters
	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
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

	public List<Blood_Units> getBloodType() {
		return bloodUnits;
	}

	public void setBloodType(List<Blood_Units> bloodType) {
		this.bloodUnits = bloodType;
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

	public Date getLastdonationDate() {
		return lastdonationDate;
	}

	public void setLastdonationDate(Date lastdonationDate) {
		this.lastdonationDate = lastdonationDate;
	}

	
	//To String Method
	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID="
				+ emailID + ", phoneNo=" + phoneNo + ", bloodType=" + bloodUnits + ", dateofBirth=" + dateofBirth
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", lastdonationDate=" + lastdonationDate + "]";
	}

	
	//Constructor
	public Donor(int donorId, String firstName, String lastName, String emailID, String phoneNo, List<Blood_Units> bloodUnits,
			Date dateofBirth, String address, String city, String state, int zipCode, Date lastdonationDate) {
		super();
		this.donorId = donorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.phoneNo = phoneNo;
		this.bloodUnits = bloodUnits;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.lastdonationDate = lastdonationDate;
	}


}
	
	
	
	
	
	
	
	
	


