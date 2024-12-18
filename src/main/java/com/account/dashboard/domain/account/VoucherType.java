package com.account.dashboard.domain.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class VoucherType {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Long id;
	
	String name;
	boolean isDeleted;
	
}
