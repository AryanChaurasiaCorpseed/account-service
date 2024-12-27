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
	
	boolean isDeleted;
	
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
	boolean cgstSgstPrsent;
	boolean igstPrsent;

	String igst; //other state
	String cgst; // both are same state (cgst+sgst)
	String sgst; // both are same state (cgst+sgst)
	
	// BankDetails
	boolean isBankAccount;
	String accountHolderName;
	String accountNo;
	String ifscCode;
	String swiftCode;
	String bankName;
	String branch;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LedgerType getLedgerType() {
		return ledgerType;
	}

	public void setLedgerType(LedgerType ledgerType) {
		this.ledgerType = ledgerType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean deleted) {
		isDeleted = deleted;
	}

	public boolean isHsnSac() {
		return isHsnSac;
	}

	public void setHsnSac(boolean hsnSac) {
		isHsnSac = hsnSac;
	}

	public String getHsnSacDetails() {
		return hsnSacDetails;
	}

	public void setHsnSacDetails(String hsnSacDetails) {
		this.hsnSacDetails = hsnSacDetails;
	}

	public String getHsnSac() {
		return HsnSac;
	}

	public void setHsnSac(String hsnSac) {
		HsnSac = hsnSac;
	}

	public String getHsnDescription() {
		return hsnDescription;
	}

	public void setHsnDescription(String hsnDescription) {
		this.hsnDescription = hsnDescription;
	}

	public boolean isGstRateDetails() {
		return isGstRateDetails;
	}

	public void setGstRateDetails(boolean gstRateDetails) {
		isGstRateDetails = gstRateDetails;
	}

	public String getGstRateDetails() {
		return gstRateDetails;
	}

	public void setGstRateDetails(String gstRateDetails) {
		this.gstRateDetails = gstRateDetails;
	}

	public String getTaxabilityType() {
		return taxabilityType;
	}

	public void setTaxabilityType(String taxabilityType) {
		this.taxabilityType = taxabilityType;
	}

	public String getGstRates() {
		return gstRates;
	}

	public void setGstRates(String gstRates) {
		this.gstRates = gstRates;
	}

	public boolean isBankAccount() {
		return isBankAccount;
	}

	public void setBankAccount(boolean bankAccount) {
		isBankAccount = bankAccount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIgst() {
		return igst;
	}

	public String getCgst() {
		return cgst;
	}

	public String getSgst() {
		return sgst;
	}

	public void setIgst(String igst) {
		this.igst = igst;
	}

	public void setCgst(String cgst) {
		this.cgst = cgst;
	}

	public void setSgst(String sgst) {
		this.sgst = sgst;
	}

	public boolean isCgstSgstPrsent() {
		return cgstSgstPrsent;
	}

	public boolean isIgstPrsent() {
		return igstPrsent;
	}

	public void setCgstSgstPrsent(boolean cgstSgstPrsent) {
		this.cgstSgstPrsent = cgstSgstPrsent;
	}

	public void setIgstPrsent(boolean igstPrsent) {
		this.igstPrsent = igstPrsent;
	}
	
	
}
