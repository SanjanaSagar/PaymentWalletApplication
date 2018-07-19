package com.capgemini.walletapplication.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.walletapplication.bean.AccountDetails;
import com.capgemini.walletapplication.service.WalletApplicationService;

import junit.framework.TestCase;

public class WalletApplicationDAOTest extends TestCase {

	  AccountDetails details=new AccountDetails();
	  
	 WalletApplicationService service=new WalletApplicationService();
	
	public void testCreateAccount() {
		assertEquals(1,service.createAccount(details) );
		assertNotNull(details);
		
	}

	public void testLogin() {
		
		assertEquals(1, service.login(details));
		
	}

	public void testShowBalance() {
		
		
		assertEquals(40000,40000);
		details.setBalance(1000);
		assertEquals(1000.0, service.showBalance());
		
	}

	public void testDeposit() {

		assertEquals(0,service.deposit(2000));
		assertTrue(true);
		assertNull(details);
		
	}

	public void testWithdraw() {
		
		assertEquals(0,service.withdraw(3000));
		assertTrue(true);
		assertNull(details);
		
	}

	public void testFundTransfer() {
		
		assertEquals(0,service.fundTransfer(182738829, 783783783));
		assertNull(details);
	}

}
