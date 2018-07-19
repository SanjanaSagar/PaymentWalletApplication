package com.capgemini.walletapplication.bean;

import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

	Customer cust=new Customer();
	
	public void testGetFirstName() {
		
		assertNotNull(cust);
		cust.setFirstName("Sanjana");
		
		assertEquals("Sanjana", cust.getFirstName());
		assertTrue(cust.getFirstName().equals("Sanjana"));
		
	}


	public void testGetGender() {
		
		cust.setGender("male");
		
		assertEquals("male", cust.getGender());
		assertTrue(cust.getGender().equals("male"));
		
		
	}

	public void testGetAge() {
		
		cust.setAge(20);
		
		assertEquals(20, cust.getAge());
		assertNotEquals(21, cust.getAge());
		
		
	}

	public void testGetMobileNo() {
		
		cust.setMobileNo("9052023205");
		
		assertEquals("9052023205", cust.getMobileNo());
		assertNotEquals("9052168938", cust.getMobileNo());
		
		
	}

	public void testGetEmail() {
		
		cust.setEmail("sanjana@gmail.com");
		
		assertEquals("sanjana@gmail.com", cust.getEmail());
		assertNotEquals("geeta@gmail.com", cust.getEmail());
		
		
	}



	public void testGetAadhar() {
		
		cust.setAadhar(Long.parseLong("123456789012"));
		
		assertEquals(Long.parseLong("123456789012"), cust.getAadhar());
		assertNotEquals(Long.parseLong("234567890123"), cust.getAadhar());
		
	}

}
