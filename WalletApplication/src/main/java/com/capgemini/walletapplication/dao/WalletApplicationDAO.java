package com.capgemini.walletapplication.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.capgemini.walletapplication.bean.WalletApplicationDetails;

public class WalletApplicationDAO implements WalletApplicationDAOInterface{
	 long transId;
	static WalletApplicationDetails temp=new WalletApplicationDetails();
	static List<WalletApplicationDetails> list=new ArrayList<WalletApplicationDetails>();
	static Map<Long,String> transactions=new HashMap<Long,String>();
	static List<Long> trans=new ArrayList<Long>();
	
	
	public int createAccount(WalletApplicationDetails details) {
		
		if(list.add(details)) {
			temp=details;
			return 1;
		}
		else
			return 0;
	}

	public boolean login(WalletApplicationDetails details) {
		
		Iterator<WalletApplicationDetails> it=list.iterator();
		while(it.hasNext()) {
			
			WalletApplicationDetails itDetails=it.next();
			if(details.getUsername().equals(itDetails.getUsername())) {
				temp=itDetails;
				return true;
			}
		}
		return false;
	}

	public double showBalance() {
		
		Iterator<WalletApplicationDetails> it=list.iterator();
		while(it.hasNext()) {
			
			WalletApplicationDetails itDetails=it.next();
			if(temp.getUsername().equals(itDetails.getUsername())) {
				
				double balance=itDetails.getBalance();
				return balance;
			}
				
		}
		return -1;
	}

	public int deposit(double amount) {
		
		
		
		Iterator<WalletApplicationDetails> it=list.iterator();
		while(it.hasNext()) {
			
			WalletApplicationDetails itDetails=it.next();
			
			if(temp.getUsername().equals(itDetails.getUsername())) {
				
				itDetails.setBalance(itDetails.getBalance()+amount);
				//set transaction 
				transId=(long)Math.random()*12345+678;
				trans.add(transId);
				itDetails.setTrans(trans);
				String s="\tDeposited "+Double.toString(amount)+" to "+Long.toString(itDetails.getAccNo());
				transactions.put(transId, s);
				return 1;
			}
			
		}
		return 0;
	}

	public int withdraw(double amount) {
		
		
		
		Iterator<WalletApplicationDetails> it=list.iterator();
		while(it.hasNext()) {
			
			WalletApplicationDetails itDetails=it.next();
			if(temp.getUsername().equals(itDetails.getUsername())) {
				
				itDetails.setBalance(itDetails.getBalance()-amount);
				//set transaction
				transId=(long)Math.random()*10000+999;
				trans.add(transId);
				itDetails.setTrans(trans);
				String s="\tWithdrew "+Double.toString(amount)+" from "+Long.toString(itDetails.getAccNo());
				transactions.put(transId, s);
				return 1;
			}
			
		}
		return 0;
	}

	public int fundTransfer(long toAccNo, double amount) {
		
		
		
		Iterator<WalletApplicationDetails> it=list.iterator();
		Iterator<WalletApplicationDetails> it1=list.iterator();
		while(it.hasNext()) {
			
			WalletApplicationDetails itDetails=it.next();
			if(temp.getUsername().equals(itDetails.getUsername())) {
				// debit from user account
				itDetails.setBalance(itDetails.getBalance()-amount);
				//credit to recipient if xyz bank account holder
				while(it1.hasNext()) {
					
					WalletApplicationDetails itDetails1=it1.next();
					if(itDetails1.getAccNo()==toAccNo) {
						
						itDetails1.setBalance(itDetails1.getBalance()+amount);	
						
					}
					
				}
				transId=(long)Math.random()*12345 + 234;
				trans.add(transId);
				itDetails.setTrans(trans);
				String s="\tTransfered "+Double.toString(amount)+" to "+Long.toString(toAccNo)+" from "+Long.toString(itDetails.getAccNo());
				transactions.put(transId, s);
				return 1;		
			}	
		}
		return 0;
	}

	public Map printTransaction() {
		
		return transactions;
	}

}
