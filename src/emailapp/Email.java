package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordlength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.ie";
	
	
	//constructor for first and last name.
	
	public Email(String first, String last) {
		this.firstName = first;
		this.lastName = last;
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordlength);
		System.out.println("Your new password is: " + this.password);
		
		//combine elements to generate email
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	//Ask for the department
	
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ".Department Codes:\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) {
			return "sales";
		}else if (departmentChoice == 2) {
			return "dev";
		}else if (departmentChoice == 3) {
			return "acct";
		}else {
			return "";
		}
	}
	
	//Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPabcdefghijklmnopqrstuvwxyz0123456789!£%";
		char[] password = new char[length];
		
		for(int i =0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
//			System.out.println(rand);
//			System.out.println(passwordSet.charAt(rand));
		}
		
		return new String(password);
	}
	
	//SETTERS
	
	//Set mailbox capacity
	
	public void sertMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	
	public void setAlternateEmail(String email) {
		this.alternateEmail = email;
	}
	
	//Change password
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//GETTERS
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	//show info of person
	
	
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}

}
