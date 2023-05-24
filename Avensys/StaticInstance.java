package isolate1;
class Demo extends Object{
	static int a,b,c;
	//since m, n and o are instance variables, they are commented out
	//because they can't be accessed by static methods.
	
	//static variables
	static {
		a=100;
		b=200;
		c=300;
		//m=1000;
		//n=2000;
		//o=3000;
	}
	static void displayOne() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(m);
		//System.out.println(n);
		//System.out.println(o);
	}
	
	
	//instance variables
	int m,n,o;
	{
		m = 10; a = 400;
		n = 20; b = 500;
		o = 30; c = 600;
	}
	
	void displayTwo() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}

public class StaticInstance {

	public static void main(String[] args) {
		System.out.println("Static method for displayOne:");
		Demo.displayOne();
		
		System.out.println("\nInstance method for displayTwo:");
		Demo d = new Demo();
		d.displayTwo();
		

	}

}
