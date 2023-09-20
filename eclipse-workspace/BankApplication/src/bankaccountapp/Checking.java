package bankaccountapp;

public class Checking extends Account {
	
	//List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	
	public Checking(String name, String pPSN, double initalDeposit) {
		super(name, pPSN, initalDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	//List any methods specific to the checking account
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10,12));
		debitCardPin = (int) (Math.random() * Math.pow(10,2));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
		"\n Debit Card Number: " + debitCardNumber + 
		"\n Debit Card Pin: " + debitCardPin);

		
	}

}
