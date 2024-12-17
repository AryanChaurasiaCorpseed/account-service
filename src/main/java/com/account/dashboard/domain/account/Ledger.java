package com.account.dashboard.domain.account;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@Data
public class Ledger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;
	
	String name;
	@ManyToOne
	LedgerType ledgerType;
	
	String email;
	
	String address;
	
	String state;
	
	String country;
	
	String pin;
	
	Date createDate;
	   
	
	//hsn details
    boolean isHsnSac;
	String hsnSacDetails;
	String HsnSac;
	String hsnDescription;


	// gst rate details
	boolean isGstRateDetails;
	String gstRateDetails;
	String taxabilityType;
	String gstRates;
	
	// BankDetails
	boolean isBankAccount;
	String accountHolderName;
	String accountNo;
	String ifscCode;
	String swiftCode;
	String bankName;
	String branch;
	

	
	   
	
}
