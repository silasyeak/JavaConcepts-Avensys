package isolate1;

import java.util.Scanner;

class BusinessMan{
	int p;
	int t;
	static float r; //static variable 
	float SI;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Amount:");
		p = scan.nextInt();
		System.out.println("Enter the time (in years):");
		t = scan.nextInt();
		r = 2f;
	}
	
	public void findSI() {
		SI = (p*t*r)/100;
	}
	public void display() {
		System.out.println("Simple Interest is " + SI);
	}
}

public class SimpleInterests extends Object{

	public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan();
		BusinessMan b2 = new BusinessMan();
		BusinessMan b3 = new BusinessMan();
		b1.acceptInput();
		b1.findSI();
		b1.display();
		System.out.println("---------------------------");
		b2.acceptInput();
		b2.findSI();
		b2.display();
		System.out.println("---------------------------");

		b3.acceptInput();
		b3.findSI();
		b3.display();
		System.out.println("---------------------------");


	}

}
