package isolate2;

import java.util.Scanner;

interface SimpleInterest{
	public void acceptInput();
	public void findSI();
	public void display();
}
class BusinessMan1 implements SimpleInterest{
	int p;
	float r; 
	int t;
	float simpleInterest;
	
	public void acceptInput() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Businessman 1:");
		System.out.println("What is your principal?");
		p = scan.nextInt();
		System.out.println("What is the interest rate?");
		r = scan.nextFloat();
		System.out.println("How many years are you going to take to pay it back?");
		t = scan.nextInt();
	}
	public void findSI() {
		simpleInterest = p*r*t;
	}
	
	public void display() {
		System.out.printf("Simple Interest: $" + "%.2f", simpleInterest);
		System.out.println("\n");
	}
}
class BusinessMan2 implements SimpleInterest{
	int p;
	float r; 
	int t;
	float simpleInterest;
	
	public void acceptInput() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Businessman 2:");
		System.out.println("What is your principal?");
		p = scan.nextInt();
		System.out.println("What is the interest rate?");
		r = scan.nextFloat();
		System.out.println("How many years are you going to take to pay it back?");
		t = scan.nextInt();
	}
	public void findSI() {
		simpleInterest = p*r*t;
	}
	
	public void display() {
		System.out.printf("Simple Interest: $" + "%.2f", simpleInterest);
		System.out.println("\n");
	}
}
class BusinessMan3 implements SimpleInterest{
	int p;
	float r; 
	int t;
	float simpleInterest;
	
	public void acceptInput() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Businessman 3:");
		System.out.println("What is your principal?");
		p = scan.nextInt();
		System.out.println("What is the interest rate?");
		r = scan.nextFloat();
		System.out.println("How many years are you going to take to pay it back?");
		t = scan.nextInt();
	}
	public void findSI() {
		simpleInterest = p*r*t;
	}
	
	public void display() {
		System.out.printf("Simple Interest: $" + "%.2f", simpleInterest);
		System.out.println();
	}
}

class MathIsMathing{
	public void receiveCalculator(SimpleInterest ref) {
		ref.acceptInput();
		ref.findSI();
		ref.display();
	
}
}
class SimpleInterestInterface extends Object {

	public static void main(String[] args) {
		BusinessMan1 bm1 = new BusinessMan1();
		BusinessMan2 bm2 = new BusinessMan2();
		BusinessMan3 bm3 = new BusinessMan3();
		MathIsMathing mim = new MathIsMathing();
		mim.receiveCalculator(bm1);
		mim.receiveCalculator(bm2);
		mim.receiveCalculator(bm3);
	}
}

