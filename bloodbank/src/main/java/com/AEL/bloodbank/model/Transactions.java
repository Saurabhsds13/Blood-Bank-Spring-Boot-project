package com.AEL.bloodbank.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Transactions {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Transaction_Id")
	private int transactionId;
	
	@PrimaryKeyJoinColumn(name="Donor_Id")
	@JoinColumn(name="donor_Id")
	@OneToOne
	private Donor donorId;
	
	@PrimaryKeyJoinColumn(name="Recipient_Id")
	@JoinColumn(name="recipient_Id")
	@OneToOne
	private Recipient recipientId;
	
	@PrimaryKeyJoinColumn(name="Blood_Unit_Id")
	@JoinColumn(name="blood_unit_Id")
	@OneToOne
	private Blood_Units bloodUnitId;
	
	@Column(name="Transaction_Date")
	private Date transactionDate;
	
	@Column(name="Quantity")
	private int quantityl;
	@Column(name="Transaction_Type")
	private String transactionType;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Donor getDonorId() {
		return donorId;
	}
	public void setDonorId(Donor donorId) {
		this.donorId = donorId;
	}
	public Recipient getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(Recipient recipientId) {
		this.recipientId = recipientId;
	}
	public Blood_Units getBloodUnitId() {
		return bloodUnitId;
	}
	public void setBloodUnitId(Blood_Units bloodUnitId) {
		this.bloodUnitId = bloodUnitId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getQuantityl() {
		return quantityl;
	}
	public void setQuantityl(int quantityl) {
		this.quantityl = quantityl;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", donorId=" + donorId + ", recipientId=" + recipientId
				+ ", bloodUnitId=" + bloodUnitId + ", transactionDate=" + transactionDate + ", quantityl=" + quantityl
				+ ", transactionType=" + transactionType + "]";
	}
	
	
	
}
