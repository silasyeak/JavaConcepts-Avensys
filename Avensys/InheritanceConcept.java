package isolate1;

//inheritance is when one class acquires the property of another class 

//class inheritance{
//	int a = 10;
//	int b = 20;
//	public void greet() {
//		System.out.println("hello Team!");
//	}
//}
//
//class inheritance2 extends inheritance{
//	
//}
//
//public class InheritanceConcept extends Object {
//
//	public static void main(String[] args) {
//		inheritance i1 = new inheritance();
//		i1.greet();
//		System.out.println(i1.a);
//		inheritance2 i2 = new inheritance2();
//		i2.greet();
//		System.out.println(i2.a);
//
//	}
//
//}

//Rule 1: Private members will not participate in inheritance
//class DemoOne
//{
//	private int a =10;
//	int b =20;
//	
//	public void greet()
//	{
//		System.out.println("Hello Team!!");
//	}
//}
//class DemoTwo extends DemoOne
//{
//	
//}
//public class InheritanceConcept extends Object {
//	public static void main(String[] args) {
//		
//		DemoOne d1 = new DemoOne();
//		d1.greet();
//		System.out.println(d1.a);
//		DemoTwo d2 = new DemoTwo();
//		d2.greet();
//		System.out.println(d2.b); // second object is getting issue while accessing a variable
//	}
//}

//Rule 2: Constructors will not participate in inheritance
class DemoOne extends Object
{
	int a =10;
	int b =20;
	
	public void greet()
	{
		System.out.println("Hello Team!!");
	}
	
	public DemoOne()
	{
		super();
		System.out.println("DemoOne class's constructor");
	}
}
class DemoTwo extends DemoOne
{	
	public DemoTwo()
	{
		super(); // but still you can call parent class constructor using super()
		System.out.println("DemoTwo class's constructor");
	}
}
public class InheritanceConcept extends Object {
	public static void main(String[] args) {
		DemoTwo d2 = new DemoTwo();
		d2.greet();
		System.out.println(d2.a);
	
	}
}
