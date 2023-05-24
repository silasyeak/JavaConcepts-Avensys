package avensysPartTwo;


/* Constructor Chaining **/
class Object
{
	public Object()
	{
		// Intialise
	}
}
class StudentSuper extends Object
{
	private String name; 
	private int age;     
	private String city; 
	
	/*
	 * public Student()  // this has been assigned by compiler and its always zero parameterized
	 * {
	 * 	  super();
	 * }
	 */
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
}

public class superDefaults extends Object {
	
	public static void main(String[] args) {
		StudentSuper s = new StudentSuper();
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}