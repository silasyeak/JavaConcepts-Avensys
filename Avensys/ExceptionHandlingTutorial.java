package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
////without Exception handlers
//class ExceptionHandlingTutorial
//{
//	public static void main(String[] args) {
//		
//		System.out.println("Connection Established");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the Numerator");
//		int a = scan.nextInt();
//		System.out.println("Enter the Denominator");
//		int b = scan.nextInt();
//		int c = a/b;
//		System.out.println("Result is :" + c);
//		System.out.println("Connection is Closed");
//	}
//}

//Handling the Exceptions
//class ExceptionHandlingTutorial
//{
//	public static void main(String[] args) {
//		try 
//		{
//			System.out.println("Connection Established");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the Numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter the Denominator");
//			int b = scan.nextInt();
//			int c = a/b;
//			System.out.println("Result is :" + c);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Some Problem Occured");
//		}
//		System.out.println("Connection is Closed");
//	}
//}

////Advantage of Specific and multiple catch blocks
//class ExceptionHandlingTutorial
//{
//	public static void main(String[] args) {
//		try {
//			System.out.println("Connection Established");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the Numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter the Denominator");
//			int b = scan.nextInt();
//			int c = a/b;
//			System.out.println("Result is :" + c);
//			System.out.println("Enter the array length");
//			int len = scan.nextInt();
//			int arr[] = new int[len];
//			System.out.println("Enter the element which you wish to store in array");
//			int ele = scan.nextInt();
//			System.out.println("Enter the position");
//			int pos = scan.nextInt();
//			arr[pos] = ele;
//			System.out.println("The element " + ele + " is present in " + pos + " position");
//		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println("Hey user !! Dont give zero Denominator");
//		}
//		catch(NegativeArraySizeException ne)
//		{
//			System.out.println("Hey user !! Dont pass negative value to the size");
//		}
//		catch(InputMismatchException ie)
//		{
//			System.out.println("Hey user !! Dont pass invalid inputs");
//		}
//		catch(ArrayIndexOutOfBoundsException aie)
//		{
//			System.out.println("Hey user !! don't pass invalid position");
//		}
//		//Geniric Catch Block
//		catch(Exception e)
//		{
//			System.out.println("Some Problem Occured");
//		}
//			System.out.println("Connection is Closed");
//	}
//}

////Propagation of exceptions
//
//class DemoOne
//{
//	public void alpha()
//	{
//		System.out.println("Connection 3 Estd");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the Numerator");
//		int a = scan.nextInt();
//		System.out.println("Enter the Denominator");
//		int b = scan.nextInt();
//		int c = a/b;
//		System.out.println("Result is :" + c);
//		System.out.println("Connection 3 is Closed");
//	}
//}
//class DemoTwo
//{
//	public void beta()
//	{
//		System.out.println("Connection 2 is Estd");
//		DemoOne d1 = new DemoOne();
//		d1.alpha();
//		System.out.println("Connection 2 is closed");
//	}
//}
//class DemoThree
//{
//	public void gamma()
//	{
//		System.out.println("Connection 1 is Estd");
//		DemoTwo d2 = new DemoTwo();
//		d2.beta();
//		System.out.println("Connection 1 is closed");
//	}
//}
//class ExceptionHandlingTutorial
//{
//	public static void main(String[] args) {
//		System.out.println("Main Connection is Estd");
//		DemoThree d3 = new DemoThree();
//		d3.gamma();
//		System.out.println("Main Connection is closed");
//	}
//
//}

////finding logical error
//class DemoOne
//{
//	public void alpha()
//	{
//		try {
//		System.out.println("Connection 3 Estd");
//		alpha();
//		}
//		catch(Error e)
//		{
//			System.out.println("Dont keep alpha method in loop");
//		}
//		System.out.println("Connection 3 is Closed");
//	}
//}
//class ExceptionHandlingTutorial
//{
//	public static void main(String[] args) {
//		System.out.println("Main Connection is Estd");
//		DemoOne d1 = new DemoOne();
//		d1.alpha();
//		System.out.println("Main Connection is closed");
//	}
//
//}

////print stack trace
//class DemoOne{
//	public void alpha() {
//		try {
//			System.out.println("Connection 1 is Established");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter the denominator");
//			int b = scan.nextInt();
//			int c = a/b;
//			System.out.println(c);
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			
//		}
//		System.out.println("Connection 1 is closed");
//		
//	}
//}
//class ExceptionHandlingTutorial{
//	public static void main(String[] args) {
//		DemoOne d1 = new DemoOne();
//		d1.alpha();
//	}
//}
//

////Second way: Re throwing the Exception
//class ATM
//{
//	public void alpha()
//	{
//		try
//		{
//			System.out.println("Connection 1 is Estd in ATM");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter the Denominator");
//			int b = scan.nextInt();
//			int c = a/b;
//			System.out.println(c);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Some Problem Occured");
//			throw e;
//		}
//		//finally makes sure that everything is closed up
//		finally
//		{
//			System.out.println("Connection 1 is closed in ATM");
//		}
//	}
//}
//class Bank
//{
//	public static void main(String[] args) {
//		System.out.println("Main Connection is Estd");
//		ATM a = new ATM();
//		try {
//			a.alpha();
//		} catch (Exception e) {
//			System.out.println("Exception handled in main method as well");
//		}
//		System.out.println("Main Connection is closed");
//	}
//
//}
//
//class ExceptionHandlingTutorial{
//public static void main(String[] args) {
//	Bank b1 = new Bank();
//	b1.main(args);
//}
//}

////Second way: Ducking the Exception
//class ATM
//{
//	public void alpha()throws Exception
//	{
//		try
//		{
//			System.out.println("Connection 1 is Estd in ATM");
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter the numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter the Denominator");
//			int b = scan.nextInt();
//			int c = a/b;
//			System.out.println(c);
//		}
//		//no catch --> ducking the exception
//		finally
//		{
//			System.out.println("Connection 1 is closed in ATM");
//		}
//	}
//}
//class Bank
//{
//	public static void main(String[] args)  {
//		System.out.println("Main Connection is Estd");
//		ATM a = new ATM();
//		try {
//			a.alpha();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Main Connection is closed");
//	}
//
//}
//
//
//class ExceptionHandlingTutorial{
//public static void main(String[] args) {
//	Bank b1 = new Bank();
//	b1.main(args);
//}
//}


////Liskov's Substitution Principle 
//
//class DemoOne
//{
//	public void greet()throws ArithmeticException
//	{
//		System.out.println("Hello Team!!");
//	}
//}
//class DemoTwo extends DemoOne
//{
//	public void greet()throws ClassNotFoundException //not is-a
//	{
//		System.out.println("Hello Team From Someone!!");
//	}
//}
//class ExceptionHandlingTutorial
//{
//	public static void main(String[] args)  {
//		System.out.println("Main Connection is Estd");
//		System.out.println("Main Connection is closed");
//	}
//
//}

class InValidInputException extends Exception
{
	public String getMessage()
	{
		return "InValid Input!! We are blocking your card, Please reach out to the bank";
	}
}
class ATM
{
	int accNo = 1111;
	int passWord = 9999;
	int ac;
	int pw;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account number");
		ac = scan.nextInt();
		System.out.println("Enter the password");
		pw = scan.nextInt();
	}
	
	public void verify() throws InValidInputException 
	{
		if(accNo == ac && passWord == pw)
		{
			System.out.println("Hey Valid User !! Please Collect Your Money");
		}
		else
		{
			InValidInputException ie = new InValidInputException();
			throw ie;
		}
	}
}
class Bank
{
	public void intiate()
	{
		ATM atm = new ATM();
		try {
			atm.acceptInput();
			atm.verify();
		} catch (InValidInputException e) {
			System.out.println("You have left out only 2 chances");
			try {
				atm.acceptInput();
				atm.verify();
			} catch (InValidInputException e2) {
				System.out.println("You have left out only 1 chance");
				try {
					atm.acceptInput();
					atm.verify();
				} catch (InValidInputException e3) {
					System.out.println("You have reached maximum attempt you can contact your bank");
				}
			}
		}
	}
}
class ExceptionHandlingTutorial
{
	public static void main(String[] args)  {
		Bank b = new Bank();
		b.intiate();
	}

}