package com.account.dashboard.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

//@Data
@Entity
@Table
public class Amount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String transactionType;
	@ManyToOne
	User createdBy;
	List<String> transactionId;
	String serviceName;  // need to Discussion
	long professionalFees;
	long govFees;
	Long serviceCharge;
	long othertherFees;
	String UploadReceipt;
	long totalAmount;
	String remark;
	Date paymentDate;
	List<String>doc;
	@ManyToOne
	User approvedBy;
	Date approveDate;
	
	public List<String> getDoc() {
		return doc;
	}
	public void setDoc(List<String> doc) {
		this.doc = doc;
	}
	
	public long getGovFees() {
		return govFees;
	}
	public void setGovFees(long govFees) {
		this.govFees = govFees;
	}
	public Long getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(Long serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setTransactionId(List<String> transactionId) {
		this.transactionId = transactionId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public long getProfessionalFees() {
		return professionalFees;
	}
	public void setProfessionalFees(long professionalFees) {
		this.professionalFees = professionalFees;
	}
	public List<String> getTransactionId() {
		return transactionId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public long getOthertherFees() {
		return othertherFees;
	}
	public void setOthertherFees(long othertherFees) {
		this.othertherFees = othertherFees;
	}
	public String getUploadReceipt() {
		return UploadReceipt;
	}
	public void setUploadReceipt(String uploadReceipt) {
		UploadReceipt = uploadReceipt;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public User getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(User approvedBy) {
		this.approvedBy = approvedBy;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	
	

}
