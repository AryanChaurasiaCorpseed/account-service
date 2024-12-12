package com.account.dashboard.dto;



public class LedgerDto {


	
	String name;
	
    Long ledgerTypeId;
	
	String email;
	
	String address;
	
	String state;
	
	String country;
	
	String pin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLedgerTypeId() {
		return ledgerTypeId;
	}

	public void setLedgerTypeId(Long ledgerTypeId) {
		this.ledgerTypeId = ledgerTypeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
