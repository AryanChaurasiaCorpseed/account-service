package com.account.dashboard.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class ManageSales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	Long projectId;
	Long clientId;
	String estimateNo;
	@ManyToOne
	User createdBy;
	@ManyToOne
	User updatedBy;
    @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="manage_sales_amount",joinColumns = {@JoinColumn(name="manage_sales_id",referencedColumnName="id",nullable=true)},
			inverseJoinColumns = {@JoinColumn(name="manage_sales_amount_id"
					+ "",referencedColumnName = "id",nullable=true,unique=false)})
    private List<Amount>manageSalesAmount;

	long  govermentfees;
	String govermentCode;
	String govermentGst;
	long professionalFees;
	String professionalCode;
	String profesionalGst;
	long serviceCharge;
	String serviceCode;
	String serviceGst;
	long otherFees;
	long totalAmount;
	long paidAmount;
	
	String otherCode;
	String otherGst;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public String getEstimateNo() {
		return estimateNo;
	}
	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public User getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}
	public List<Amount> getManageSalesAmount() {
		return manageSalesAmount;
	}
	public void setManageSalesAmount(List<Amount> manageSalesAmount) {
		this.manageSalesAmount = manageSalesAmount;
	}
	public long getGovermentfees() {
		return govermentfees;
	}
	public void setGovermentfees(long govermentfees) {
		this.govermentfees = govermentfees;
	}
	public String getGovermentCode() {
		return govermentCode;
	}
	public void setGovermentCode(String govermentCode) {
		this.govermentCode = govermentCode;
	}
	public String getGovermentGst() {
		return govermentGst;
	}
	public void setGovermentGst(String govermentGst) {
		this.govermentGst = govermentGst;
	}
	public long getProfessionalFees() {
		return professionalFees;
	}
	public void setProfessionalFees(long professionalFees) {
		this.professionalFees = professionalFees;
	}
	public String getProfessionalCode() {
		return professionalCode;
	}
	public void setProfessionalCode(String professionalCode) {
		this.professionalCode = professionalCode;
	}
	public String getProfesionalGst() {
		return profesionalGst;
	}
	public void setProfesionalGst(String profesionalGst) {
		this.profesionalGst = profesionalGst;
	}
	public long getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(long serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceGst() {
		return serviceGst;
	}
	public void setServiceGst(String serviceGst) {
		this.serviceGst = serviceGst;
	}
	public long getOtherFees() {
		return otherFees;
	}
	public void setOtherFees(long otherFees) {
		this.otherFees = otherFees;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public long getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(long paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getOtherCode() {
		return otherCode;
	}
	public void setOtherCode(String otherCode) {
		this.otherCode = otherCode;
	}
	public String getOtherGst() {
		return otherGst;
	}
	public void setOtherGst(String otherGst) {
		this.otherGst = otherGst;
	}

}
