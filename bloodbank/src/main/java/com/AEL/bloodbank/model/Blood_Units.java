package com.AEL.bloodbank.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Blood_Units")
public class Blood_Units {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Blood_Unit_ID")
	private int bloodUnitID;
	
	
//	@Column(name="donor_id")
	@ManyToOne
	@JoinColumn(name="donor_Id")
	private Donor donorId;
	
//	@Column(name="blood_bank_id")
	@ManyToOne
	@JoinColumn(name="blood_bank_Id")
	private Blood_Banks bloodBankId;
	
	
	@Column(name="blood_type")
	private String bloodType;
	@Column(name="collection_date")
	private Date collectionDate;
	@Column(name="expiration_date")
	private Date expirationDate;
	
	
	public int getBloodUnitID() {
		return bloodUnitID;
	}
	public void setBloodUnitID(int bloodUnitID) {
		this.bloodUnitID = bloodUnitID;
	}
	public Donor getDonorId() {
		return donorId;
	}
	public void setDonorId(Donor donorId) {
		this.donorId = donorId;
	}
	public Blood_Banks getBloodBankId() {
		return bloodBankId;
	}
	public void setBloodBankId(Blood_Banks bloodBankId) {
		this.bloodBankId = bloodBankId;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public Date getCollectionDate() {
		return collectionDate;
	}
	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status;


	@Override
	public String toString() {
		return "Blood_Units [bloodUnitID=" + bloodUnitID + ", donorId=" + donorId + ", bloodBankId=" + bloodBankId
				+ ", bloodType=" + bloodType + ", collectionDate=" + collectionDate + ", expirationDate="
				+ expirationDate + ", status=" + status + "]";
	}
	public Blood_Units(int bloodUnitID, Donor donorId, Blood_Banks bloodBankId, String bloodType, Date collectionDate,
			Date expirationDate, String status) {
		super();
		this.bloodUnitID = bloodUnitID;
		this.donorId = donorId;
		this.bloodBankId = bloodBankId;
		this.bloodType = bloodType;
		this.collectionDate = collectionDate;
		this.expirationDate = expirationDate;
		this.status = status;
	}
	
	
	
	
	
}
