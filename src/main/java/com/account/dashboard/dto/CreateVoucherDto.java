package com.account.dashboard.dto;

import java.util.Date;


import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.domain.account.VoucherType;

import jakarta.persistence.ManyToOne;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateVoucherDto {

		
	String companyName;
	
	long ledgerId;
	
	long ledgerTypeId;
	
	long voucherTypeId;
	
	boolean isCreditDebit;
	
	String creditAmount ;
	String debitAmount;
	Date createDate;
	
	String paymentType;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public long getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(long ledgerId) {
		this.ledgerId = ledgerId;
	}

	public long getLedgerTypeId() {
		return ledgerTypeId;
	}

	public void setLedgerTypeId(long ledgerTypeId) {
		this.ledgerTypeId = ledgerTypeId;
	}

	public long getVoucherTypeId() {
		return voucherTypeId;
	}

	public void setVoucherTypeId(long voucherTypeId) {
		this.voucherTypeId = voucherTypeId;
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

	
	
}
