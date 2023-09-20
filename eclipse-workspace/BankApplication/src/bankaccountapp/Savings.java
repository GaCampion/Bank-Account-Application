package bankaccountapp;

public class Savings extends Account {
	
	//List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxPin;
	
	//Constructor to initialize savings account properties
	public Savings(String name, String pPSN, double initalDeposit) {
		super(name, pPSN, initalDeposit);
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() -.25;
	}
	//List any methods specific to the savings account
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
		safetyDepositBoxPin = (int) (Math.random() * Math.pow(10,4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Savings Account Features" + 
		"\n Safety Deposit Box ID: " + safetyDepositBoxID + 
		"\n Safety Deposit Box Key: " + safetyDepositBoxPin);

		
	}

}
