package com.capgemini.walletapplication.dao;

import com.capgemini.walletapplication.bean.WalletApplicationDetails;

public interface WalletApplicationDAOInterface {

	public int createAccount(WalletApplicationDetails details);
	
	public boolean login(WalletApplicationDetails details);
	
	public double showBalance();
	
	public int deposit(double amount);
	
	public int withdraw(double amount);
	
	public int fundTransfer(long toAccNo,double amount);
	
}
