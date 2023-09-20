package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		//Read a CSV File then create new accounts based on that data.
	
		String file = "C:\\Users\\Glenn\\Desktop\\NewBankAccounts.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String pPSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initialDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, pPSN, initialDeposit));
			}else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, pPSN, initialDeposit));
			}else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for(Account acc : accounts) {
			System.out.println("\n*************************");
			acc.showInfo();
		}

	}

}
