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
@Data
public class LedgerType {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;

	String name;

	boolean isSubLeadger;

	boolean isDebitCredit;

	boolean isUsedForCalculation;

	boolean isParent;

	@ManyToOne
	LedgerType ledgerType; 
	
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
	
	
	//Bank Details
	
	boolean isBankAccount;
	String accountHolderName;
	String accountNo;
	String ifscCode;
	String swiftCode;
	String bankName;
	String branch;
	
	boolean isDeleted;
	









}
