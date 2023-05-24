package avensysPartTwo;

class Student extends Object
{
	private String name; //instance variables x,y,z = local variables
	private int age;	 //instance variables
	private String city; //instance variables
	
	//if you feed a local variable to an instance variable, compiler can't tell the difference.
	//for example if you feed name = name; 
	public Student(String name, int age, String city)
	{
		super(); //this calls the parent class, this is called constructor chaining
		this.name = name;
		this.age = age;
		this.city  = city;
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

public class studentEncapsulation {
	
	public static void main(String[] args) {
		Student s = new Student("Silas",27,"Singapore");
		//s.setData("Siddu", 23, "Singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}