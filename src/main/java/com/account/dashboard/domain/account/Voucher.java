package com.account.dashboard.domain.account;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class Voucher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;
	
	String companyName;
	
	@ManyToOne
	Ledger ledger;
	
	@ManyToOne
	LedgerType ledgerType;
	
	@ManyToOne
	VoucherType voucherType;
	
	@ManyToOne
	Ledger product;
	
	boolean isCreditDebit;	
	String creditAmount ;
	String debitAmount;
	Date createDate;
	String paymentType;
	boolean isDeleted;
	
	// out side state
	boolean isIGST;
	String igst;
	
	boolean isCGSTSGST;
	String cgst;
	String sgst;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Ledger getLedger() {
		return ledger;
	}

	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}

	public LedgerType getLedgerType() {
		return ledgerType;
	}

	public void setLedgerType(LedgerType ledgerType) {
		this.ledgerType = ledgerType;
	}

	public VoucherType getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(VoucherType voucherType) {
		this.voucherType = voucherType;
	}

	public boolean isCreditDebit() {
		return isCreditDebit;
	}

	public void setCreditDebit(boolean isCreditDebit) {
		this.isCreditDebit = isCreditDebit;
	}

	public String getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isIGST() {
		return isIGST;
	}

	public String getIgst() {
		return igst;
	}

	public boolean isCGSTSGST() {
		return isCGSTSGST;
	}

	public String getCgst() {
		return cgst;
	}

	public String getSgst() {
		return sgst;
	}

	public void setIGST(boolean isIGST) {
		this.isIGST = isIGST;
	}

	public void setIgst(String igst) {
		this.igst = igst;
	}

	public void setCGSTSGST(boolean isCGSTSGST) {
		this.isCGSTSGST = isCGSTSGST;
	}

	public void setCgst(String cgst) {
		this.cgst = cgst;
	}

	public void setSgst(String sgst) {
		this.sgst = sgst;
	}
	
	
	
	
	
}
