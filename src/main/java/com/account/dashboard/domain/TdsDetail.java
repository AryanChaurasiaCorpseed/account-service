package com.account.dashboard.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity
public class TdsDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;
	
	String organization;
	String totalPaymentAmount;
	int tdsPrecent;
	Long projectId;
	String paymentRegisterId;
	String tdsAmount;
	
	public Long getId() {
		return id;
	}
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
	public void setId(Long id) {
		this.id = id;
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
	
	
	
}
