package BankingApplication;

import java.util.Scanner;



public class BankAccount {
	static int balance;
	static int previousTransaction;
	static String customerName;
	static String customerId;
	
	
	BankAccount(String cusName, String cusId){
		customerName=cusName;
		customerId =cusId;
	}
	
	public void deposit(int amount) {
		if(amount !=0) {
		balance+= amount;
		previousTransaction = amount;
		}
	}
	public void withdraw(long amount2) {
		if(amount2!=0) {
			balance-=amount2;
			previousTransaction = (int) -amount2;
		}
	}
	public void getPrevious_Transaction() {
		if(previousTransaction>0) {
			System.out.println("DEPOSITED: "+previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("WITHDRAWN: "+previousTransaction);
		}
		else {
			System.out.println("no Transaction occured");
		}
	}
	public void show() {
		char option ='\0';
		Scanner scan = new Scanner(System.in);
		System.out.println("****WELCOME TO ATM****");
		System.out.println("thank you for visiting: "+customerName);
		System.out.println("your Id is : "+customerId);
		System.out.println("\n");
		System.out.println("PRESS A. To check your balance");
		System.out.println("PRESS B. To Deposit into Account");
		System.out.println("PRESS C. To Withdraw your balance");
		System.out.println("PRESS D. To check your previous transaction");
		System.out.println("PRESS E. To Exit");
		
		do {
			System.out.println("*****************************************");
			System.out.println("Enter an option");
			System.out.println("*****************************************");
			option = scan.nextLine().charAt(0);
			
		
			switch(option){
			case 'A':
				System.out.println("-----------------------");
				System.out.println("Current Balence = "+balance);
				System.out.println("-----------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-----------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("-----------------------");
				long amount = scan.nextLong();
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-----------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("-----------------------");
				long amount2 = scan.nextLong();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("-----------------------");
			    getPrevious_Transaction();
				System.out.println("-----------------------");
				System.out.println("\n");
				break;
		
		  case 'E':
			System.out.println("-----------------------");
			System.out.println("****THANK YOU FOR USING OUR SERVICES****");
			System.out.println("-----------------------");
			System.out.println("\n");
			break;
			
			default: 
				System.out.println("Invalid option...! please Enter the correct option..!!");
		}
		}
		while(option != 'E');
		   System.out.println("****THANK YOU FOR USING OUR SERVICES****");
		}	
				
}



			
			
			
		
	
