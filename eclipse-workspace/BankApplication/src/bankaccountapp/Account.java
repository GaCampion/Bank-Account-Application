package bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate {
	
	//List common properties for savings and checking accounts
	private String name;
	private String pPSN;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	
	public Account(String name, String pPSN, double initalDeposit) {
		this.name = name;
		this.pPSN = pPSN;
		balance = initalDeposit;
		
		//Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		//account rate from savings/checking
		setRate();
	}
	
	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfpPSN = pPSN.substring(pPSN.length() -2, pPSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfpPSN + uniqueID + randomNumber;
	}
	
	public void compund() {
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	//List common methods
	
	public void showInfo() {
		System.out.println("NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance +
				"\nRate: " + rate + "%");
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void deposit(double amount) {
		
		balance += amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	
	}
	
	public void withdraw(double amount) {
		
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	
	}
	
	public void transfer(String toWhere, double amount) {
		
		balance -= amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
		printBalance();
	
	}

}
