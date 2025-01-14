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
	
	boolean tdsPercent;
	int tdsPresent;

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
	
	private String totalAmount;
	private String remark;
	private Date paymentDate;
	private String estimateNo;
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
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public boolean isTdsPercent() {
		return tdsPercent;
	}
	public int getTdsPresent() {
		return tdsPresent;
	}
	
	public void setTdsPercent(boolean tdsPercent) {
		this.tdsPercent = tdsPercent;
	}
	public void setTdsPresent(int tdsPresent) {
		this.tdsPresent = tdsPresent;
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
	
    
	
	
    
    
}
