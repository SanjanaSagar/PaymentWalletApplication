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
		
		assertEquals(true, validate.validUsername(details.getUsername()));
		assertNotEquals(false, validate.validUsername(details.getUsername()));
		
	}

	public void testValidPassword() {
		
		details.setPassword("Onyxx12345");
		
		assertEquals(true, validate.validPassword(details.getPassword()));
		assertNotEquals(false, validate.validUsername(details.getPassword()));
		
	}

	public void testValidAge() {
		
		details.setCustomer(customer);
		details.getCustomer().setAge(22);
		
		assertEquals(true, validate.validAge(details.getCustomer().getAge()));
		assertNotEquals(false,validate.validAge(details.getCustomer().getAge()) );
		
	}

	public void testValidMobileNo() {
		
		details.setCustomer(customer);
		details.getCustomer().setMobileNo("9052023205");
		
		assertEquals(true, validate.validMobileNo(details.getCustomer().getMobileNo()));
		assertNotEquals(false, validate.validMobileNo(details.getCustomer().getMobileNo()));
		
	}

	public void testValidEmail() {
		
		details.setCustomer(customer);
		details.getCustomer().setEmail("sanjana@gmail.com");
		
		assertEquals(true, validate.validEmail(details.getCustomer().getEmail()));
		assertNotEquals(false,validate.validEmail(details.getCustomer().getEmail()) );
	}

	public void testValidAadhar() {
		
		details.setCustomer(customer);
		details.getCustomer().setAadhar(Long.parseLong("123456789012"));
		
		assertEquals(true, validate.validAadhar(details.getCustomer().getAadhar()));
		assertNotEquals(false, validate.validAadhar(details.getCustomer().getAadhar()));
		
		
	}

	public void testValidloc() {
		
		details.setCustomer(customer);
		details.getCustomer().setLocation("Telangana");
		
		assertEquals(true, validate.validloc(details.getCustomer().getLocation()));
		assertNotEquals(false, validate.validloc(details.getCustomer().getLocation()));
	}

	public void testValidBranch() {
	
		details.setBranch("Gachibowli");
		
		assertEquals(true, validate.validBranch(details.getBranch()));
		assertNotEquals(false, validate.validBranch(details.getBranch()));
	}

	public void testValidType() {
		
		details.setAccType("savings");
		
		assertEquals(true, validate.validType(details.getAccType()));
		assertNotEquals(false, validate.validType(details.getAccType()));
		
	}

}
