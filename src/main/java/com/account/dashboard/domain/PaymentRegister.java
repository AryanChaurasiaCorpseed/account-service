package com.account.dashboard.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
//@Getter
//@Setter
//@Data
public class PaymentRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;
	
	private Long leadId;
	private Long estimateId;
	
	private String billingQuantity;//partial ,full ,milestone
	private String paymentType;//Sales,
	

	
	String registerBy;

	private Long createdById;
	private String transactionId;
	private String serviceName;

	private double  govermentfees;
	private double govermentGst;
	private int govermentGstPercent;

	private double professionalFees;
	private double profesionalGst;
	private int professionalGstPercent;
	
	boolean tdsPresent;
	private double tdsAmount;
	private int tdsPercent;

	private double serviceCharge;
	private double serviceGst;
	private int serviceGstPercent;
	
    private double otherFees;
    private double otherGst;
    private int otherGstPercent;
    
	private double totalAmount;
	private String remark;
	private Date paymentDate;
	private String estimateNo;
	String status;
//	private List<FileData> UploadReceipt;
	
	int docPersent;
	int filingPersent;
	int liasoningPersent;
	int certificatePersent;

	String companyName;
	String updateDate;
	private Long approvedById;
	private Date approveDate;
	public Long getId() {
		return id;
	}
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
	public double getProfessionalFees() {
		return professionalFees;
	}
	public double getProfesionalGst() {
		return profesionalGst;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public double getServiceGst() {
		return serviceGst;
	}
	public double getOtherFees() {
		return otherFees;
	}
	public double getOtherGst() {
		return otherGst;
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
	public String getCompanyName() {
		return companyName;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public Long getApprovedById() {
		return approvedById;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setId(Long id) {
		this.id = id;
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
	public void setProfessionalFees(double professionalFees) {
		this.professionalFees = professionalFees;
	}
	public void setProfesionalGst(double profesionalGst) {
		this.profesionalGst = profesionalGst;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void setServiceGst(double serviceGst) {
		this.serviceGst = serviceGst;
	}
	public void setOtherFees(double otherFees) {
		this.otherFees = otherFees;
	}
	public void setOtherGst(double otherGst) {
		this.otherGst = otherGst;
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
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public void setApprovedById(Long approvedById) {
		this.approvedById = approvedById;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getGovermentGstPercent() {
		return govermentGstPercent;
	}
	public int getProfessionalGstPercent() {
		return professionalGstPercent;
	}
	public int getServiceGstPercent() {
		return serviceGstPercent;
	}
	public int getOtherGstPercent() {
		return otherGstPercent;
	}
	public void setGovermentGstPercent(int govermentGstPercent) {
		this.govermentGstPercent = govermentGstPercent;
	}
	public void setProfessionalGstPercent(int professionalGstPercent) {
		this.professionalGstPercent = professionalGstPercent;
	}
	public void setServiceGstPercent(int serviceGstPercent) {
		this.serviceGstPercent = serviceGstPercent;
	}
	public void setOtherGstPercent(int otherGstPercent) {
		this.otherGstPercent = otherGstPercent;
	}
	public boolean isTdsPresent() {
		return tdsPresent;
	}
	public int getTdsPercent() {
		return tdsPercent;
	}
	public void setTdsPresent(boolean tdsPresent) {
		this.tdsPresent = tdsPresent;
	}
	public void setTdsPercent(int tdsPercent) {
		this.tdsPercent = tdsPercent;
	}
	public double getTdsAmount() {
		return tdsAmount;
	}
	public void setTdsAmount(double tdsAmount) {
		this.tdsAmount = tdsAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
    
}
