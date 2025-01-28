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
//@Getter
//@Setter
//@Data
public class Ledger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;
	
	String name;
	@ManyToOne
	LedgerType ledgerType;
	
	String source;//sales
	Long estimateId;
	Long companyId;
	
	
	String email;
	
	String address;	
	String state;	
	String country;	
	String pin;	
	Date createDate;
	
	boolean isDeleted;
	
	//hsn details
    boolean hsnSacPrsent;
	String hsnSacDetails;
	String HsnSac;
	String hsnDescription;


	// gst rate details
	boolean gstRateDetailPresent;
	String gstRateDetails;
	String taxabilityType;
	String gstRates;
	boolean cgstSgstPresent;
	boolean igstPresent;

	String igst; //other state
	String cgst; // both are same state (cgst+sgst)
	String sgst; // both are same state (cgst+sgst)
	
	// BankDetails
	boolean bankAccountPrsent;
	String accountHolderName;
	String accountNo;
	String ifscCode;
	String swiftCode;
	String bankName;
	String branch;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LedgerType getLedgerType() {
		return ledgerType;
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
	public Date getCreateDate() {
		return createDate;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public boolean isHsnSacPrsent() {
		return hsnSacPrsent;
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
	public boolean isGstRateDetailPresent() {
		return gstRateDetailPresent;
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
	public boolean isCgstSgstPresent() {
		return cgstSgstPresent;
	}
	public boolean isIgstPresent() {
		return igstPresent;
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
	public boolean isBankAccountPrsent() {
		return bankAccountPrsent;
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
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLedgerType(LedgerType ledgerType) {
		this.ledgerType = ledgerType;
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
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public void setHsnSacPrsent(boolean hsnSacPrsent) {
		this.hsnSacPrsent = hsnSacPrsent;
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
	public void setGstRateDetailPresent(boolean gstRateDetailPresent) {
		this.gstRateDetailPresent = gstRateDetailPresent;
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
	public void setCgstSgstPresent(boolean cgstSgstPresent) {
		this.cgstSgstPresent = cgstSgstPresent;
	}
	public void setIgstPresent(boolean igstPresent) {
		this.igstPresent = igstPresent;
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
	public void setBankAccountPrsent(boolean bankAccountPrsent) {
		this.bankAccountPrsent = bankAccountPrsent;
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
	public String getSource() {
		return source;
	}
	public Long getEstimateId() {
		return estimateId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setEstimateId(Long estimateId) {
		this.estimateId = estimateId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	
	
	
	
}
