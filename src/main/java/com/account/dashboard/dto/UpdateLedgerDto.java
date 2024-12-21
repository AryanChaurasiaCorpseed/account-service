package com.account.dashboard.dto;


public class UpdateLedgerDto {
    
	long id;

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
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getLedgerTypeId() {
		return ledgerTypeId;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPin() {
		return pin;
	}
	public boolean isHsnSac() {
		return isHsnSac;
	}
	public String getHsnSacDetails() {
		return hsnSacDetails;
	}
	public String getHsnSac() {
		return HsnSac;
	}
	public String getHsnDescription() {
		return hsnDescription;
	}
	public boolean isGstRateDetails() {
		return isGstRateDetails;
	}
	public String getGstRateDetails() {
		return gstRateDetails;
	}
	public String getTaxabilityType() {
		return taxabilityType;
	}
	public String getGstRates() {
		return gstRates;
	}
	public boolean isBankAccount() {
		return isBankAccount;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public String getSwiftCode() {
		return swiftCode;
	}
	public String getBankName() {
		return bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLedgerTypeId(long ledgerTypeId) {
		this.ledgerTypeId = ledgerTypeId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setHsnSac(boolean isHsnSac) {
		this.isHsnSac = isHsnSac;
	}
	public void setHsnSacDetails(String hsnSacDetails) {
		this.hsnSacDetails = hsnSacDetails;
	}
	public void setHsnSac(String hsnSac) {
		HsnSac = hsnSac;
	}
	public void setHsnDescription(String hsnDescription) {
		this.hsnDescription = hsnDescription;
	}
	public void setGstRateDetails(boolean isGstRateDetails) {
		this.isGstRateDetails = isGstRateDetails;
	}
	public void setGstRateDetails(String gstRateDetails) {
		this.gstRateDetails = gstRateDetails;
	}
	public void setTaxabilityType(String taxabilityType) {
		this.taxabilityType = taxabilityType;
	}
	public void setGstRates(String gstRates) {
		this.gstRates = gstRates;
	}
	public void setBankAccount(boolean isBankAccount) {
		this.isBankAccount = isBankAccount;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
}
