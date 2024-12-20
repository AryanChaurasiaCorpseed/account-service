package com.account.dashboard.dto;

import lombok.Data;

@Data
public class LedgerDto {



	String name;

	long  ledgerTypeId;

	String email;

	String address;
	String state;	
	String country;	
	String pin;


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


	
	


}
