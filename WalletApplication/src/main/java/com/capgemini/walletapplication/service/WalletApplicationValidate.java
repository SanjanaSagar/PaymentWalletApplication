package com.capgemini.walletapplication.service;

public class WalletApplicationValidate {

	
	public boolean validFirstName(String firstName) {
		
		if(!firstName.isEmpty())
			return true;
		else
			return false;
		
	}
	public boolean validLastName(String lastName) {
		
		if(!lastName.isEmpty())
			return true;
		else
			return false;
		
	}
	public boolean validGender(String gender) {
		
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")  )
			return true;
		else
			return false;
		
	}
	public boolean validUsername(String username) {
		
		if(!username.isEmpty())
			return true;
		else
			return false;
		
		
	}
	public boolean validPassword(String password) {
		
		if(!password.isEmpty() && password.length()>=8)
			return true;
		else
			return false;
		
	}
	public boolean validAge(int age) {
		
		if(age>=18)
			return true;
		else
			return false;
	}
	public boolean validMobileNo(String mobileNo) {
		
		if(mobileNo.length()==10)
			return true;
		else
			return false;
		
	}
	public boolean validEmail(String email) {
		
		if(!email.isEmpty())
			return true;
		else
			return false;
	}
	
	
	
}
