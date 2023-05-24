package isolate2;
import java.util.Scanner;


interface Calculator
{
	 public void mul(); // 1. Interfaces are introduced to achieve standardization
	 public void div();
}
class MyCalc1 implements Calculator // 2.One interface can have any number of implementations
{
	public void mul() 
	{
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println(c);
	}
	public void div()
	{
		int a = 10;
		int b = 2;
		int c = a/b;
		System.out.println(c);
	}
}
class MyCalc2 implements Calculator
{
	public void mul()
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a*b;
		System.out.println(c);
	}
	public void div()
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
	}
}
class MyCalc3 implements Calculator
{
	public void mul()
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a==0 || b==0)
		{
			int c = 0;
		}
		else 
		{
			int c = a*b;
			System.out.println(c);
		}
	}
	public void div()
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(b!=0)
		{
			int c = a/b;
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	
}
class Math
{
	public void acceptCalculator(Calculator ref)// 3. An interface type reference can be created but objects cannot be created
	{
		ref.mul();//4.using interface reference upcasting, loose coupling hence polymorphism
		ref.div();//5.inherited and overridden can be accessed by interface type reference 
	}
}
class JavaInterfaces extends Object {
	
	public static void main(String[] args) {
		MyCalc1 mc1 = new MyCalc1();
		MyCalc2 mc2 = new MyCalc2();
		MyCalc3 mc3 = new MyCalc3();
		Math m = new Math();
		m.acceptCalculator(mc1);
		m.acceptCalculator(mc2);
		m.acceptCalculator(mc3);
	} 
}
//
//import java.util.Scanner;
//
//interface Calculator
//{
//	 public void mul(); 
//	 public void div();
//}
//class MyCalc1 implements Calculator
//{
//	public void mul() 
//	{
//		int a = 10;
//		int b = 20;
//		int c = a*b;
//		System.out.println(c);
//	}
//	public void div()
//	{
//		int a = 10;
//		int b = 2;
//		int c = a/b;
//		System.out.println(c);
//	}
//	public void add()
//	{
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println(c);
//	}
//}
//class Math
//{
//	public void acceptCalculator(Calculator ref)
//	{
//		ref.mul();
//		ref.div();
//		((MyCalc1) ref).add(); // 6. Parent type reference can access child class specialized methods after down casting
//	}
//}
//class JavaInterfaces extends Object {
//	
//	public static void main(String[] args) {
//		MyCalc1 mc1 = new MyCalc1();
//		Math m = new Math();
//		m.acceptCalculator(mc1);
//	} 
//}


////7. Multiple inheritance is possible using interface in java
//interface Calculator1
//{
//	 public void mul(); 
//	 public void div();
//}
//interface Calculator2
//{
//	public void add();
//	public void sub();
//}
//class MyCalc1 implements Calculator1,Calculator2
//{
//	public void mul() 
//	{
//		int a = 10;
//		int b = 20;
//		int c = a*b;
//		System.out.println(c);
//	}
//	public void div()
//	{
//		int a = 10;
//		int b = 2;
//		int c = a/b;
//		System.out.println(c);
//	}
//	public void add()
//	{
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println(c);
//	}
//	public void sub()
//	{
//
//		int a = 10;
//		int b = 20;
//		int c = a-b;
//		System.out.println(c);
//	}
//}
//class JavaInterfaces extends Object {
//	
//	public static void main(String[] args) {
//		MyCalc1 mc1 = new MyCalc1();
//		mc1.mul();
//		mc1.div();
//		mc1.add();
//		mc1.sub();
//	} 
//}
//
////8. One interface can not implement another interface
//interface Calculator1
//{
//	 public void mul(); 
//	 public void div();
//}
//interface Calculator2 implements Calculator1
//{
//	public void add();
//	public void sub();
//}
//

////9. One interface can extends another interface
//interface Calculator1
//{
//	 public void mul(); 
//	 public void div();
//}
//interface Calculator2 extends Calculator1
//{
//	public void add();
//	public void sub();
//}


////10. After implementing interface we can provide partial implementation but the class has not been declared as abstract
//interface Calculator1
//{
//	 public void mul(); 
//	 public void div();
//}
//abstract class MyCalc implements Calculator1
//{
//	public void mul()
//	{
//		
//	}
//}
////11.An interface can be empty in java , // marker interface or tagged interface or Indicator interface
//interface Calculator1
//{
//	 
//}
//class Demo implements Calculator1
//{
//	
//}

////12. A class can extends and implements at same time but it should always first extends then implements
//interface Calculator1
//{
//	 
//}
//class Calculator2
//{
//	
//}
//class Demo extends Calculator2 implements Calculator1
//{
//	
//}

////13: every variable within interface is by default final and static, and methods are abstract 
//interface Calculator1
//{
//	 int count = 0;
//	 public void add();
//	 public void sub();
//}
//
///* After Compilation*/
//
//interface Calculator1
//{
//	public final static int count = 0;
//	public abstract void add();
//	public abstract void sub();
//}


////After JDK 1.8 : we can create static and default methods within interface
//interface GovernmentBank
//{
//	 public void createAccount();
//	 public void applyLoan();
//	 public void withDrawCash();
//	 
//	 static void minAmount()
//	 {
//		 System.out.println("You should credit less than 0");
//	 }
//	 
//	 default void maxAmount()
//	 {
//		 System.out.println("You should credit more than 2000000");
//	 }
//}

