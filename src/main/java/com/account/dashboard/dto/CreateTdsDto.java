package com.account.dashboard.dto;

import lombok.Data;

//@Data
public class CreateTdsDto {
	
	String organization;
	String totalPaymentAmount;
	String tdsType; // payable,reciveable
	int tdsPrecent;
	Long projectId;
	String paymentRegisterId;
	String tdsAmount;
	
	public String getOrganization() {
		return organization;
	}
	public String getTotalPaymentAmount() {
		return totalPaymentAmount;
	}
	public int getTdsPrecent() {
		return tdsPrecent;
	}
	public Long getProjectId() {
		return projectId;
	}
	public String getPaymentRegisterId() {
		return paymentRegisterId;
	}
	public String getTdsAmount() {
		return tdsAmount;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public void setTotalPaymentAmount(String totalPaymentAmount) {
		this.totalPaymentAmount = totalPaymentAmount;
	}
	public void setTdsPrecent(int tdsPrecent) {
		this.tdsPrecent = tdsPrecent;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public void setPaymentRegisterId(String paymentRegisterId) {
		this.paymentRegisterId = paymentRegisterId;
	}
	public void setTdsAmount(String tdsAmount) {
		this.tdsAmount = tdsAmount;
	}
	public String getTdsType() {
		return tdsType;
	}
	public void setTdsType(String tdsType) {
		this.tdsType = tdsType;
	}
	
	
}
