package com.account.dashboard.dto;

import java.util.Date;
import java.util.List;

public class CreateAmountDto {
	


	private Long leadId;
	private Long estimateId;

	private String billingQuantity;
	private String paymentType;
    
	private String registerBy;

	private Long createdById;
	private String transactionId;
	private String serviceName;

	private double  govermentfees;
	private double govermentGst;
	private int govermentGstPercent;
	
	private double professionalFees;
	private double profesionalGst;
	private int profesionalGstPercent;

	private double serviceCharge;
	private double serviceGst;
	private int serviceGstPercent;

	private double otherFees;
	private double otherGst;
	private int otherGstPercent;

	int docPersent;
	int filingPersent;
	int liasoningPersent;
	int certificatePersent;


	private String UploadReceipt;
	private double totalAmount;
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

	public String getRegisterBy() {
		return registerBy;
	}

	public Long getCreatedById() {
		return createdById;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public double getGovermentfees() {
		return govermentfees;
	}

	public double getGovermentGst() {
		return govermentGst;
	}

	public int getGovermentGstPercent() {
		return govermentGstPercent;
	}

	public double getProfessionalFees() {
		return professionalFees;
	}

	public double getProfesionalGst() {
		return profesionalGst;
	}

	public int getProfesionalGstPercent() {
		return profesionalGstPercent;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public double getServiceGst() {
		return serviceGst;
	}

	public int getServiceGstPercent() {
		return serviceGstPercent;
	}

	public double getOtherFees() {
		return otherFees;
	}

	public double getOtherGst() {
		return otherGst;
	}

	public int getOtherGstPercent() {
		return otherGstPercent;
	}

	public int getDocPersent() {
		return docPersent;
	}

	public int getFilingPersent() {
		return filingPersent;
	}

	public int getLiasoningPersent() {
		return liasoningPersent;
	}

	public int getCertificatePersent() {
		return certificatePersent;
	}

	public String getUploadReceipt() {
		return UploadReceipt;
	}

	public double getTotalAmount() {
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

	public void setRegisterBy(String registerBy) {
		this.registerBy = registerBy;
	}

	public void setCreatedById(Long createdById) {
		this.createdById = createdById;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public void setGovermentfees(double govermentfees) {
		this.govermentfees = govermentfees;
	}

	public void setGovermentGst(double govermentGst) {
		this.govermentGst = govermentGst;
	}

	public void setGovermentGstPercent(int govermentGstPercent) {
		this.govermentGstPercent = govermentGstPercent;
	}

	public void setProfessionalFees(double professionalFees) {
		this.professionalFees = professionalFees;
	}

	public void setProfesionalGst(double profesionalGst) {
		this.profesionalGst = profesionalGst;
	}

	public void setProfesionalGstPercent(int profesionalGstPercent) {
		this.profesionalGstPercent = profesionalGstPercent;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public void setServiceGst(double serviceGst) {
		this.serviceGst = serviceGst;
	}

	public void setServiceGstPercent(int serviceGstPercent) {
		this.serviceGstPercent = serviceGstPercent;
	}

	public void setOtherFees(double otherFees) {
		this.otherFees = otherFees;
	}

	public void setOtherGst(double otherGst) {
		this.otherGst = otherGst;
	}

	public void setOtherGstPercent(int otherGstPercent) {
		this.otherGstPercent = otherGstPercent;
	}

	public void setDocPersent(int docPersent) {
		this.docPersent = docPersent;
	}

	public void setFilingPersent(int filingPersent) {
		this.filingPersent = filingPersent;
	}

	public void setLiasoningPersent(int liasoningPersent) {
		this.liasoningPersent = liasoningPersent;
	}

	public void setCertificatePersent(int certificatePersent) {
		this.certificatePersent = certificatePersent;
	}

	public void setUploadReceipt(String uploadReceipt) {
		UploadReceipt = uploadReceipt;
	}

	public void setTotalAmount(double totalAmount) {
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

    
	
}
