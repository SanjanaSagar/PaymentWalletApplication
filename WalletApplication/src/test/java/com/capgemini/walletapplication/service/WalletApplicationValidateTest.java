package com.capgemini.walletapplication.service;

import static org.junit.Assert.assertNotEquals;

import com.capgemini.walletapplication.bean.AccountDetails;
import com.capgemini.walletapplication.bean.Customer;

import junit.framework.TestCase;

public class WalletApplicationValidateTest extends TestCase {

	AccountDetails details=new AccountDetails();
	Customer customer=new Customer();
	WalletApplicationValidate validate=new WalletApplicationValidate();
	public void testValidFirstName() {
		//customer.setFirstName("sanju");
		details.setCustomer(customer);
	
		details.getCustomer().setFirstName("Bhaskar");
	
		assertEquals(true, validate.validFirstName(details.getCustomer().getFirstName()));
		assertNotEquals(false, validate.validFirstName(details.getCustomer().getFirstName()));
	
		
	}

	public void testValidLastName() {
		
		details.setCustomer(customer);
		details.getCustomer().setLastName("Roy");
		
		assertEquals(true, validate.validLastName(details.getCustomer().getLastName()));
		assertNotEquals(false, validate.validLastName(details.getCustomer().getLastName()));
		
	}

	public void testValidGender() {
		
		details.setCustomer(customer);
		details.getCustomer().setGender("male");
		
		assertEquals(true, validate.validGender(details.getCustomer().getGender()));
		assertNotEquals(false, validate.validGender(details.getCustomer().getGender()));
		
	}

	public void testValidUsername() {
		
		details.setUsername("Rishitha");
		
		assertEquals(true, details.getUsername());
		//assertNotEquals(false, details.getUsername());
		
	}

	public void testValidPassword() {
		
		details.setPassword("Onyxx12345");
		
		assertEquals(true, details.getPassword());
		//assertNotEquals(false, details.getPassword());
		
	}

	public void testValidAge() {
		
		details.setCustomer(customer);
		details.getCustomer().setAge(22);
		
		assertEquals(true, details.getCustomer().getAge());
		//assertNotEquals(false, details.getCustomer().getAge());
		
	}

	public void testValidMobileNo() {
		
		details.setCustomer(customer);
		
	}

	public void testValidEmail() {
		fail("Not yet implemented");
	}

	public void testValidAadhar() {
		fail("Not yet implemented");
	}

	public void testValidloc() {
		fail("Not yet implemented");
	}

	public void testValidBranch() {
		fail("Not yet implemented");
	}

	public void testValidType() {
		fail("Not yet implemented");
	}

}
