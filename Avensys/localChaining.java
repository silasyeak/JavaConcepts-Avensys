package avensysPartTwo;
/* Local Chaining **/
class ObjectTwo
{
	public ObjectTwo()
	{
		// Intialise
	}
}
class StudentTwo extends ObjectTwo
{
	private String name; 
	private int age;     
	private String city; 
	
	public StudentTwo() 
	{
		//super();
	}
	
	public StudentTwo(String name, int age, String city)
	{
		this();
		this.name = name;
		this.age = age;
		this.city = city;	
	}
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

public class localChaining extends Object {
	
	public static void main(String[] args) {
		StudentTwo s = new StudentTwo("Siddu",23,"Singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}