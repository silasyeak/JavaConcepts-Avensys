package isolate1;
/*WHY we need Static and non static Method*/
//class Student
//{
//	void heartBeat()
//	{
//		// specific method
//	}
//	
//	void bloodPressure()
//	{
//		// specific method
//	}
//	
//	static void displayClassTimings()
//	{
//		// generic methods
//	}
//}
//public class StaticNonStaticMethod extends Object {
//	public static void main(String[] args) {
//		
//	}
//}
/*WHY we need Static and non static Method*/
//class Student
//{	
//	static void displayClassTimings()
//	{
//		System.out.println("For All Students Classes will be held from 9:30am to 1:30pm");
//	}
//}
//public class StaticNonStaticMethod extends Object {
//	public static void main(String[] args) {
//		Student.displayClassTimings(); // call without creation object or instance
//	}
//}

//public class StaticNonStaticMethod extends Object {
//	
//	static
//	{
//		System.out.println("This");
//	}
//	static
//	{
//		System.out.println("Java");
//	}
//	static
//	{
//		System.out.println("Class");
//	}
//	static
//	{
//		System.out.println("Is");
//	}
//	public static void main(String[] args) {
//		System.out.println("Best");
//	}
//}



public class StaticNonStaticMethod extends Object {
	
	{
		System.out.println("This");
	}
	
	{
		System.out.println("Java");
	}
	
	{
		System.out.println("Class");
	}
	
	{
		System.out.println("Is");
	}
	public static void main(String[] args) {
		System.out.println("Best");
		StaticNonStaticMethod launch = new StaticNonStaticMethod();
	}
}