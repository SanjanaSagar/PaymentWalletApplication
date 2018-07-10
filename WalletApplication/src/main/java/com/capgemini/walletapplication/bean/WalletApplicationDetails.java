package com.capgemini.walletapplication.bean;

import java.time.LocalDate;

public class WalletApplicationDetails {

	private String firstName;
	private String lastName;
	private String gender;
	private long accNo;
	

	@Override
	public String toString() {
		return "WalletApplicationDetails [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", accNo=" + accNo + ", mobileNo=" + mobileNo + ", date=" + date + ", email=" + email + ", username="
				+ username + ", password=" + password + ", amount=" + amount + "]";
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	private String mobileNo;
	LocalDate date;
	private String email;
	private String username;
	private String password;
	private double amount;
	
}
