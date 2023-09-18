import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many users we want to add
		System.out.print("Enter number of students to enroll: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		Student[] students = new Student[size];
		
		//Create a number of new students
		
		for(int i = 0; i < size; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println("");
			System.out.println(students[i].showInfo());
		}
		

	}

}
