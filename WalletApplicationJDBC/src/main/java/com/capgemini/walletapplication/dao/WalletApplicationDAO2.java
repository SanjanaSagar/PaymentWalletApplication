package com.capgemini.walletapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.capgemini.walletapplication.bean.AccountDetails;
import com.capgemini.walletapplication.util.DBUtil;

public class WalletApplicationDAO2 implements WalletApplicationDAOInterface{
	 
	static Connection connect;	
	static double balance;
	static long aadhar,accNo;
	
	
	
	public int createAccount(AccountDetails details) {
		
	int x=0,y=0;
	try {
		
		connect=DBUtil.getConnection();
		
		String insertCustomer="insert into customer values(?,?,?,?,?,?)";
		java.sql.PreparedStatement pstmtC=connect.prepareStatement(insertCustomer);
		
		pstmtC.setLong(1, details.getCustomer().getAadhar());
		pstmtC.setString(2, details.getCustomer().getFirstName());
		pstmtC.setString(3, details.getCustomer().getGender());
		pstmtC.setInt(4, details.getCustomer().getAge());
		pstmtC.setString(5, details.getCustomer().getMobileNo());
		pstmtC.setString(6, details.getCustomer().getEmail());
		
		 x=pstmtC.executeUpdate();
		
		String insertAcc="insert into accountdetails values(?,?,?,?,?,?,curdate(),?)";
		java.sql.PreparedStatement pstmtA=connect.prepareStatement(insertAcc);
		
		pstmtA.setLong(1, details.getCustomer().getAadhar());
		pstmtA.setLong(2, details.getAccNo());
		pstmtA.setString(3, details.getUsername());
		pstmtA.setString(4, details.getPassword());
		pstmtA.setDouble(5, details.getBalance());
		pstmtA.setString(6, details.getAccType());
		pstmtA.setString(7, details.getBranch());
		
		y=pstmtA.executeUpdate();
		
		
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		
		try {
			
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	if(x==1 && y==1) {
		
		return 1;	
	}
	return 0;
	
	}

	public boolean login(AccountDetails details) {
		
		int x=0;
		try {
			
			connect=DBUtil.getConnection();
			
			String loginQ="select * from accountdetails where username='"+details.getUsername()+"' AND password='"+details.getPassword()+"'";
			java.sql.PreparedStatement stmtL=connect.prepareStatement(loginQ);
			ResultSet resultLogin=stmtL.executeQuery();
			
			if(resultLogin.next()) {
				x=1;
			aadhar=resultLogin.getLong(1);
			balance=resultLogin.getLong(5);
			accNo=resultLogin.getLong(2);
			
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(connect.isClosed());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(x==1)
			return true;
		else
			return false;
		
	}

	public double showBalance() {
					
			return balance;
			
	}

	public int deposit(double amount) {
		
	
		
		try {
			
				String depositQ="update accountdetails set balance="+(balance+amount)+" where aadhar="+aadhar;
				balance+=amount;
				java.sql.PreparedStatement deposit=connect.prepareStatement(depositQ);
				
				if(deposit.executeUpdate()==1) {
					
					String transaction="Deposited :"+Double.toString(amount)+" to "+accNo;
					String insertTrans="insert into transactions values("+aadhar+",'"+transaction+"')";
					java.sql.PreparedStatement trans=connect.prepareStatement(insertTrans);
					
					trans.executeUpdate();
					return 1;
					
				}	
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}

	public int withdraw(double amount) {
		
		try {
			
				
				String withdrawQ="update accountdetails set balance="+(balance-amount)+" where aadhar="+aadhar;
				balance-=amount;
				java.sql.PreparedStatement deposit=connect.prepareStatement(withdrawQ);
				
				if(deposit.executeUpdate()==1) {
					
				
					String transaction="Withdrew :"+Double.toString(amount)+" from "+Long.toString(accNo);
					String insertTrans="insert into transactions values("+aadhar+",'"+transaction+"')";
					java.sql.PreparedStatement trans=connect.prepareStatement(insertTrans);
					
					trans.executeUpdate();
					
					return 1;
					
				}	
				

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return 0;
		
		
	}

	

	public int fundTransfer(long toAccNo, double amount) {
		
		try {
			
			String toAccQ="select * from accountdetails where accNo="+toAccNo;
			java.sql.PreparedStatement toAcc=connect.prepareStatement(toAccQ);
			ResultSet tempTrans=toAcc.executeQuery();
			
			if(tempTrans.next()) {
				
				String withdrawQ="update accountdetails set balance="+(balance-amount)+" where aadhar="+aadhar;
				balance-=amount;
				java.sql.PreparedStatement deposit=connect.prepareStatement(withdrawQ);
				
				if(deposit.executeUpdate()==1) {
					
					String transaction="Transfered :"+Double.toString(amount)+" to "+Long.toString(toAccNo);
					String insertTrans="insert into transactions values("+aadhar+",'"+transaction+"')";
					java.sql.PreparedStatement trans=connect.prepareStatement(insertTrans);
					
					trans.executeUpdate();				
				}				
				
				double bal=tempTrans.getDouble(5)+amount;
				String depositQ="update accountdetails set balance="+bal+" where aadhar="+tempTrans.getLong(1);
				java.sql.PreparedStatement deposit1=connect.prepareStatement(depositQ);
				
				if(deposit1.executeUpdate()==1) {
					
					String transaction="Recieved :"+Double.toString(amount)+" from "+Long.toString(accNo);
					String insertTrans="insert into transactions values("+tempTrans.getLong(1)+",'"+transaction+"') ";
					java.sql.PreparedStatement trans=connect.prepareStatement(insertTrans);
					
					trans.executeUpdate();
					return 1;
				}	
			
			}
			else
				return 0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return 0;
	}

	public void printTransaction() {
	
		
		try {
				
				String printQ="select TransactionInfo from transactions where aadhar="+aadhar;
				java.sql.PreparedStatement print=connect.prepareStatement(printQ);
				
				ResultSet transaction=print.executeQuery();
				 while(transaction.next()) {
					 
					 System.out.println(transaction.getString(1));
				  
				 }
	
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
		try {
			
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
