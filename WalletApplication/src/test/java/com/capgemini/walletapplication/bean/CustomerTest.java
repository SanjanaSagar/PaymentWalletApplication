package com.capgemini.walletapplication.bean;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

	Customer cust=new Customer();
	
	public void testGetFirstName() {
		
		assertNotNull(cust);
		cust.setFirstName("Sanjana");
		
		
	}

	public void testGetLastName() {
		fail("Not yet implemented");
	}

	public void testGetGender() {
		fail("Not yet implemented");
	}

	public void testGetAge() {
		fail("Not yet implemented");
	}

	public void testGetMobileNo() {
		fail("Not yet implemented");
	}

	public void testGetEmail() {
		fail("Not yet implemented");
	}

	public void testGetLocation() {
		fail("Not yet implemented");
	}

	public void testGetAadhar() {
		fail("Not yet implemented");
	}

}
