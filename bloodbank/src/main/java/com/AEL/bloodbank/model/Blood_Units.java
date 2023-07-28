package com.AEL.bloodbank.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Blood_Units")
public class Blood_Units {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Blood_Unit_ID")
	private int bloodUnitID;
	
	
//	@Column(name="donor_id")
//	@OneToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
//	@JoinColumn(name="donor_Id")
//	private Donor donor;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "donor_id")
    private Donor donor;
	
//	@Column(name="blood_bank_id")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="blood_bank_Id")	
	private Blood_Banks blood_banks;
	
	@ManyToOne
	@JoinColumn(name = "recipient_id")
	private Recipient recipient;
	    
	@OneToMany(mappedBy = "bloodUnit")
	private List<Transactions> transactions;
	
	@Column(name="blood_type")
	private String bloodType;
	@Column(name="collection_date")
	private Date collectionDate;
	@Column(name="expiration_date")
	private Date expirationDate;
	
	private String status;
	
	public int getBloodUnitID() {
		return bloodUnitID;
	}
	public void setBloodUnitID(int bloodUnitID) {
		this.bloodUnitID = bloodUnitID;
	}
	public Donor getDonorId() {
		return donor;
	}
	public void setDonorId(Donor donor) {
		this.donor = donor;
	}
	public Blood_Banks getBloodBankId() {
		return blood_banks;
	}
	public void setBloodBankId(Blood_Banks blood_banks) {
		this.blood_banks = blood_banks;
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
	


	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	public Blood_Banks getBlood_banks() {
		return blood_banks;
	}
	public void setBlood_banks(Blood_Banks blood_banks) {
		this.blood_banks = blood_banks;
	}
	public Recipient getRecipient() {
		return recipient;
	}
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	public List<Transactions> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Blood_Units [bloodUnitID=" + bloodUnitID + ", donor=" + donor + ", blood_banks=" + blood_banks
				+ ", recipient=" + recipient + ", transactions=" + transactions + ", bloodType=" + bloodType
				+ ", collectionDate=" + collectionDate + ", expirationDate=" + expirationDate + ", status=" + status
				+ "]";
	}
	
	public Blood_Units(int bloodUnitID, Donor donor, Blood_Banks blood_banks, Recipient recipient,
			List<Transactions> transactions, String bloodType, Date collectionDate, Date expirationDate,
			String status) {
		super();
		this.bloodUnitID = bloodUnitID;
		this.donor = donor;
		this.blood_banks = blood_banks;
		this.recipient = recipient;
		this.transactions = transactions;
		this.bloodType = bloodType;
		this.collectionDate = collectionDate;
		this.expirationDate = expirationDate;
		this.status = status;
	}
	
	
	
	
	
	
}
