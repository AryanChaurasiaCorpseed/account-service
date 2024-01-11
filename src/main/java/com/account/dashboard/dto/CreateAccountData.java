package com.account.dashboard.dto;

import java.util.Date;
import java.util.List;



public class CreateAccountData {

	private String transactionType;
	private Long projectId;
	private Long createdById;
	private List<String> transactionId;
	private String serviceName;  // need to Discussion
	private long professionalFees;
	private long govFees;
	private long serviceCharge;
	private long othertherFees;
	private String UploadReceipt;
	private long totalAmount;
	private String remark;
	private Date paymentDate;
	private String estimateNo;
	private List<String>doc;

	
	private Long approvedById;
	private Date approveDate;
	
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getEstimateNo() {
		return estimateNo;
	}
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Long getCreatedById() {
		return createdById;
	}
	public void setCreatedById(Long createdById) {
		this.createdById = createdById;
	}
    
	public List<String> getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(List<String> transactionId) {
		this.transactionId = transactionId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
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
	
	public long getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(long serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public long getProfessionalFees() {
		return professionalFees;
	}
	public void setProfessionalFees(long professionalFees) {
		this.professionalFees = professionalFees;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
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
	public Long getApprovedById() {
		return approvedById;
	}
	public void setApprovedById(Long approvedById) {
		this.approvedById = approvedById;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	
	
}
