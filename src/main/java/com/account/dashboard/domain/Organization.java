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
@Getter
@Setter
@Data
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	Date joiningDate;
	boolean isDeleted ;
	
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
