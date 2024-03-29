package com.AEL.bloodbank.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transactions {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Transaction_Id")
	private int transactionId;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "donor_id")
    private Donor donor;
	

	@JoinColumn(name="recipient_Id")
	@ManyToOne(cascade=CascadeType.ALL)
	private Recipient recipient;
	
	
	@JoinColumn(name="blood_unit_Id")
	@ManyToOne(cascade=CascadeType.ALL)
	private Blood_Units blood_units;
	
	@Column(name="transaction_date")
	private Date transactionDate;
	
	@Column(name="Quantity")
	private int quantity;
	
	@Column(name="Transaction_Type")
	private String transactionType;
	
	
	//getters and setters
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Donor getDonorId() {
		return donor;
	}
	public void setDonorId(Donor donor) {
		this.donor = donor;
	}
	public Recipient getRecipientId() {
		return recipient;
	}
	public void setRecipientId(Recipient recipient) {
		this.recipient = recipient;
	}
	public Blood_Units getBloodUnitId() {
		return blood_units;
	}
	public void setBloodUnitId(Blood_Units blood_units) {
		this.blood_units = blood_units;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getQuantityl() {
		return quantity;
	}
	public void setQuantityl(int quantityl) {
		this.quantity = quantityl;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	
	
	
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	public Recipient getRecipient() {
		return recipient;
	}
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	public Blood_Units getBlood_units() {
		return blood_units;
	}
	public void setBlood_units(Blood_Units blood_units) {
		this.blood_units = blood_units;
	}
	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", donor=" + donor + ", recipient=" + recipient
				+ ", blood_units=" + blood_units + ", transactionDate=" + transactionDate + ", quantityl=" + quantity
				+ ", transactionType=" + transactionType + "]";
	}
	public Transactions(int transactionId, Donor donor, Recipient recipient, Blood_Units blood_units,
			Date transactionDate, int quantity, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.donor = donor;
		this.recipient = recipient;
		this.blood_units = blood_units;
		this.transactionDate = transactionDate;
		this.quantity = quantity;
		this.transactionType = transactionType;
	}
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
