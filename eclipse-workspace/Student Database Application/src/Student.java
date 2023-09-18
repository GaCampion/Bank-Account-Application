import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int year;
	private String courses;
	private int studentID;
	private double tuitionBalance;
	private static double costOfCourse = 600;
	private static int id = 1000;
	
	//constructor prompts user to enter name and year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.firstName = scanner.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = scanner.nextLine();
		
		System.out.print("1 - 1st year\n2 - 2nd Year\n3 - 3rd Year\n4 - 4th Year\n5 - 5th Year\n6 - 6th Year\nEnter student class level: ");
		this.year = scanner.nextInt();
		
		this.courses = "";
		
		setStudentID();
		
		
	}
	
	//Generate and ID
	
	private void setStudentID() {
		//year + ID
		id++;
		this.studentID = (year * 10000) + id;
	}
	
	//Enroll in courses
	
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
		
			String course = scanner.nextLine();
		
			if(course.equals("Q")) {
				System.out.println("Thank you for providing your student information.");
				break;
			}else {
				courses = courses + "\n " + course;
				tuitionBalance += costOfCourse;
			}
		} while(true);
	}
	
	//view balance
	
	public void viewBalance() {
		System.out.println("Your balance is: £" + tuitionBalance);
	}
	
	//Pay tuition
	
	public void payTuition() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How much would you like to pay? ");
		double payment = scanner.nextDouble();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of £" + payment);
		viewBalance();
	}
	
	//Show status of student
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nYear: " + year + "\nStudent ID: " + studentID + "\nCourses Enrolled: " + courses + "\nBalance: £" + tuitionBalance;
	}
	
		
}

