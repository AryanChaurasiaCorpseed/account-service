package com.account.dashboard.dto;

import java.util.Date;
import java.util.List;

public class CreateAmountDto {
	


	private Long leadId;
	private Long estimateId;

	private String billingQuantity;
	private String paymentType;


	private Long createdById;
	private String transactionId;
	private String serviceName;

	private String  govermentfees;
	private String govermentGst;

	private String professionalFees;
	private String profesionalGst;

	private String serviceCharge;
	private String serviceGst;

	private String otherFees;
	private String otherGst;

	private String UploadReceipt;
	private String totalAmount;
	private String remark;
	private Date paymentDate;
	private String estimateNo;
	private List<String>doc;

	String companyName;

	public Long getLeadId() {
		return leadId;
	}
	public Long getEstimateId() {
		return estimateId;
	}
	public String getBillingQuantity() {
		return billingQuantity;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public Long getCreatedById() {
		return createdById;
	}

	public String getServiceName() {
		return serviceName;
	}
	public String getGovermentfees() {
		return govermentfees;
	}
	public String getGovermentGst() {
		return govermentGst;
	}
	public String getProfessionalFees() {
		return professionalFees;
	}
	public String getProfesionalGst() {
		return profesionalGst;
	}
	public String getServiceCharge() {
		return serviceCharge;
	}
	public String getServiceGst() {
		return serviceGst;
	}
	public String getOtherFees() {
		return otherFees;
	}
	public String getOtherGst() {
		return otherGst;
	}
	public String getUploadReceipt() {
		return UploadReceipt;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public String getRemark() {
		return remark;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public String getEstimateNo() {
		return estimateNo;
	}
	public List<String> getDoc() {
		return doc;
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}
	public void setEstimateId(Long estimateId) {
		this.estimateId = estimateId;
	}
	public void setBillingQuantity(String billingQuantity) {
		this.billingQuantity = billingQuantity;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public void setCreatedById(Long createdById) {
		this.createdById = createdById;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public void setGovermentfees(String govermentfees) {
		this.govermentfees = govermentfees;
	}
	public void setGovermentGst(String govermentGst) {
		this.govermentGst = govermentGst;
	}
	public void setProfessionalFees(String professionalFees) {
		this.professionalFees = professionalFees;
	}
	public void setProfesionalGst(String profesionalGst) {
		this.profesionalGst = profesionalGst;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void setServiceGst(String serviceGst) {
		this.serviceGst = serviceGst;
	}
	public void setOtherFees(String otherFees) {
		this.otherFees = otherFees;
	}
	public void setOtherGst(String otherGst) {
		this.otherGst = otherGst;
	}
	public void setUploadReceipt(String uploadReceipt) {
		UploadReceipt = uploadReceipt;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}
	public void setDoc(List<String> doc) {
		this.doc = doc;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	



}
