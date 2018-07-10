package com.capgemini.walletapplication.service;

import com.capgemini.walletapplication.bean.WalletApplicationDetails;

public interface WalletApplicationServiceInterface {

	
	public int createAccount(WalletApplicationDetails details);
	
	public boolean login(WalletApplicationDetails details);
	
	public double showBalance();
	
	public int deposit(double amount);
	
	public int withdraw(double amount);
	
	public int fundTransfer(long toAccNo,double amount);
	
	//public WalletApplicationDetails printTransaction(long tid);
	
	
}
