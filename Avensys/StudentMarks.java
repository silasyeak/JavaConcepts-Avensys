package isolate1;

import java.util.Scanner;

class StudentVariables{
	String name;
	int age;
	int marks;
	static String collegeName = "Some School";
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Student's Name:");
		name = scan.next();
		System.out.println("Enter the student's age");
		age = scan.nextInt();
		System.out.println("Enter the student's marks");
		marks = scan.nextInt();
		
		
	}
	
	
	public void display() {
		System.out.println(name + ", aged: " + age + " from " + collegeName + " scored " + marks );
	}
	
	
}

public class StudentMarks extends Object {

	public static void main(String[] args) {
		StudentVariables s1 = new StudentVariables();
		StudentVariables s2 = new StudentVariables();
		StudentVariables s3 = new StudentVariables();
		s1.acceptInput();
		s1.display();
		System.out.println("---------------------------");
		s2.acceptInput();
		s2.display();
		System.out.println("---------------------------");

		s3.acceptInput();
		s3.display();
		System.out.println("---------------------------");


	}

}
