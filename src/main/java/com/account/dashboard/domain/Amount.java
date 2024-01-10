package com.account.dashboard.domain;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
public class Amount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String transactionType;
	@ManyToOne
	User createdBy;
	String transactionId;
	String serviceName;  // need to Discussion
	String professionalFees;
	String govFees;
	String serviceCharge;
	String othertherFees;
	String UploadReceipt;
	String totalAmount;
	String remark;
	Date paymentDate;
	@ManyToOne
	User approvedBy;
	Date approveDate;

}
