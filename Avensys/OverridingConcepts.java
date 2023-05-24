package isolate1;
class Teacher
{
	void markAttendance()
	{
		System.out.println("Teacher is marking attendance");
	}
	void teach()
	{
		System.out.println("Teacher is teaching");
	}
}
class PhysicsTeacher extends Teacher
{
	void teach() // Overridden Method
	{
		System.out.println("Physics teacher is teaching physics");
	}
	void labExpPhy() // Specialized Method
	{
		System.out.println("Physics teacher is doing experiment in lab");
	}
}
class BiologyTeacher extends Teacher
{
	void teach() // Overridden Method
	{
		System.out.println("Biology teacher is teaching biology");
	}
	void labExpBio() // Specialized Method
	{
		System.out.println("Biology teacher is doing experiment in lab");
	}
}
public class OverridingConcepts extends Object {
	
	public static void main(String[] args) {
		
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.markAttendance();
		pt.teach();
		pt.labExpPhy();
		BiologyTeacher bt = new BiologyTeacher();
		bt.markAttendance();
		bt.teach();
		bt.labExpBio();
	
	}
}