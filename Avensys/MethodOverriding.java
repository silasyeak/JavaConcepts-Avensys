package isolate1;

// Rule 1 in Method Overriding - access specifiers should be same but you can change
// the access specifiers but from child it child it chould be increasing the visibilty
//class Parent
//{
//	protected void greet()
//	{
//		System.out.println("Hello Team from Parent");
//	}
//}
//class Child extends Parent
//{
//	public void greet()
//	{
//		System.out.println("Hello Team from Child"); // Method overriding
//	}
//}
//public class MethodOverriding extends Object {
//	
//	public static void main(String[] args) {
//		
//		Child c = new Child();
//		c.greet();
//	} 
//}

//Rule 2 in Method Overriding - Return types should be same in both parent and child class methods
//
//class Parent
//{
//	public void greet()
//	{
//		System.out.println("Hello Team from Parent");
//	}
//}
//class Child extends Parent
//{
//	public int greet()
//	{
//		System.out.println("Hello Team from Child"); // Method overriding
//		return 1;
//	}
//}
//public class MethodOverriding extends Object {
//	
//	public static void main(String[] args) {
//		
//		Child c = new Child();
//		c.greet();
//	} 
//}

//Rule 3 in Method Overriding - Final methods can not be overridden 


//class Parent
//{
//	final void greet()
//	{
//		System.out.println("Hello Team from Parent");
//	}
//}
//class Child extends Parent
//{
//	public void greet()
//	{
//		System.out.println("Hello Team from Child"); // Method overriding
//	}
//}
//public class MethodOverriding extends Object {
//	
//	public static void main(String[] args) {
//		
//		Child c = new Child();
//		c.greet();
//	} 
//}
//


////Rule 4 in Method Overriding - Overriding is still possible when we have different Co-varient Return types
//
//class Animal
//{
//	
//}
//class Tiger extends Animal
//{
//	
//}
//class Parent
//{
//	public Animal objectCreation()
//	{
//		Animal a = new Animal();
//		return a;
//	}
//}
//class Child extends Parent
//{
//	public Tiger objectCreation()
//	{
//		Tiger t = new Tiger();
//		return t;
//	}
//}
//public class MethodOverriding extends Object {
//	
//	public static void main(String[] args) {
//		
//		Child c = new Child();
//	} 
//}


class Demo1 extends Object{
	int a;
	int b;
	public Demo1() {
		a = 10;
		b = 20;
	}
	public Demo1(int a, int b) {
		this.a = a;
		this.b = b;
	}

class Demo2 extends Demo1{
	public Demo2() {
		super();
		a = 100;
		b = 200;
	}
	public Demo2(int a, int b) {
		this.a = a;
		this.b = b;

	}
}

class MethodOverriding extends Object{
	public static void main(String[] args) {
		Demo2 d2 = new Demo2(1000,2000);
		System.out.println(d2.a);
		System.out.println(d2.b);
	}
}
	
	
}







