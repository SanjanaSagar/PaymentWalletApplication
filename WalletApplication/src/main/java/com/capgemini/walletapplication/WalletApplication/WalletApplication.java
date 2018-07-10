package com.capgemini.walletapplication.WalletApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WalletApplication 
{
    
	
	public static void main(String[] args) {
		
		System.out.println("\t*****Welcome to XYZ E-Wallet******");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\tMenu\n1.Create Account\n2.Login\n3.Exit\n\n");
		
		int choice=0;
		
			try {
				choice = Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		switch (choice) {
		case 1:
			createAccount();
			break;
		case 2:
			login();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
		
		
	}
	public static void createAccount() {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\tEnter details\n");
		System.out.println("Enter first name:");
		try {
			String firstName=br.readLine();
			System.out.println("\nEnter last name:");
			String lastName=br.readLine();
			System.out.println("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void login() {
		
		
	}
}
