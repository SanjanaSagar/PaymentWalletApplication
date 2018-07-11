package com.capgemini.walletapplication.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletApplicationDetails {

	private String firstName;
	private String lastName;
	private String gender;
	private long accNo;
	private int age;
	private String mobileNo;
	
	@Override
	public String toString() {
		return "WalletApplicationDetails [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", accNo=" + accNo + ", age=" + age + ", mobileNo=" + mobileNo + ", date=" + date + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", balance=" + balance + "]";
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
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*public long getTransId() {
		return transId;
	}

	public void setTransId(long transId) {
		this.transId = transId;
		
	}*/
	
	public List<Long> getTrans() {
		return trans;
	}
	public void setTrans(List<Long> trans) {
		
		this.trans = trans;
		
	}

	/*public Map<Long,String> getTrans() {
		return trans;
	}

	public void setTrans(Map<Long,String> trans) {
		this.trans = trans;
	}*/

	LocalDate date;
	private String email;
	private String username;
	private String password;
	private double balance;
	//private long transId;
	private List<Long> trans=new ArrayList<Long>();
	
}
