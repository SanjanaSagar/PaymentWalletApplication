package com.capgemini.walletapplication.bean;

import java.time.LocalDate;

import junit.framework.TestCase;

public class AccountDetailsTest extends TestCase {

	AccountDetails details =new AccountDetails();
	
	
	public void testGetFirstName() {
		
		details.setFirstName("Sanjana");
		assertEquals("Sanjana",details.getFirstName());
		assertTrue("Sanjana".equalsIgnoreCase(details.getFirstName()));
		assertNotNull(details);
		
	}

	public void testGetLastName() {
		
		details.setLastName("Sagar");
		assertEquals("Sagar",details.getLastName());
		assertTrue("Sagar".equalsIgnoreCase(details.getLastName()));
		assertNotNull(details);
	}

	public void testGetGender() {
		
		details.setGender("Male");
		assertFalse("female".equalsIgnoreCase(details.getGender()));
		
	}

	public void testGetAccNo() {
		
		details.setAccNo(100000);
		assertFalse(576483==details.getAccNo());
		assertTrue(100000==details.getAccNo());

		
	}

	public void testGetMobileNo() {
		
		details.setMobileNo("9052023205");
		assertFalse("9052168938".equalsIgnoreCase(details.getMobileNo()));
		assertTrue("9052023205".equalsIgnoreCase(details.getMobileNo()));
		
	}

	public void testGetDate() {
		
		assertNull(details.getDate());
		assertFalse(details.getDate()==LocalDate.now());
		details.setDate(LocalDate.now());
		assertEquals(LocalDate.now(),details.getDate() );
	}

	public void testGetEmail() {
		
		details.setEmail("sanjana@gmail.com");
		assertEquals("sanjana@gmail.com", details.getEmail());
		
	}

	public void testGetUsername() {
		
		details.setUsername("SanjanaSagar");
		assertEquals("SanjanaSagar", details.getUsername());
		
	}

	public void testGetPassword() {
		
		details.setPassword("qwerty99");
		assertEquals("qwerty99", details.getPassword());
	}

	public void testGetAmount() {
		
		details.setBalance(9000);
		assertFalse(8000==details.getBalance());
		assertTrue(9000==details.getBalance());
	}

}
