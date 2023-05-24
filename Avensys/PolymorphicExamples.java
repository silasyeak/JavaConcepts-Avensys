package isolate2;


////Non Polymorphic version
//class Teacher
//{
//	public void teach()
//	{
//		System.out.println("Teacher is teaching");
//	}
//}
//class PhysicsTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Physics Teacher is teaching Physics");
//	}
//}
//class ChemistryTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Chemistry Teacher is teaching Chemistry");
//	}
//}
//class BiologyTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Biology Teacher is teaching Biology");
//	}
//}
//
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		PhysicsTeacher pt = new PhysicsTeacher(); //tight coupling
//		ChemistryTeacher ct = new ChemistryTeacher(); //tight coupling
//		BiologyTeacher bt = new BiologyTeacher(); //tight coupling
//		pt.teach(); // 1 : 1
//		ct.teach(); // 1 : 1
//		bt.teach(); // 1 : 1 
//	} 
//}

////Polymorphic version
//class Teacher
//{
//	public void teach()
//	{
//		System.out.println("Teacher is teaching");
//	}
//}
//class PhysicsTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Physics Teacher is teaching Physics");
//	}
//}
//class ChemistryTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Chemistry Teacher is teaching Chemistry");
//	}
//}
//class BiologyTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Biology Teacher is teaching Biology");
//	}
//}
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		PhysicsTeacher pt = new PhysicsTeacher(); 
//		ChemistryTeacher ct = new ChemistryTeacher();
//		BiologyTeacher bt = new BiologyTeacher(); 
//		Teacher ref;
//		ref = pt;
//		ref.teach();
//		ref = ct;
//		ref.teach();
//		ref = bt;
//		ref.teach();
//	}
//}


////Downcasting
//class Teacher
//{
//	public void teach()
//	{
//		System.out.println("Teacher is teaching");
//	}
//}
//class PhysicsTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Physics Teacher is teaching Physics");
//	}
//	public void doExp()
//	{
//		System.out.println("Physics teacher is doing expreiment");
//	}
//}
//class ChemistryTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Chemistry Teacher is teaching Chemistry");
//	}
//	public void doExp()
//	{
//		System.out.println("Chemistry teacher is doing expreiment");
//	}
//
//}
//class BiologyTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Biology Teacher is teaching Biology");
//	}
//	public void doExp()
//	{
//		System.out.println("Biology teacher is doing expreiment");
//	}
//
//}
//class PolymorphicExamples extends Object {
//	// Parent class ref can access only inherited and overridden methods of child class but not specialized method
//	public static void main(String[] args) {
//		PhysicsTeacher pt = new PhysicsTeacher(); 
//		ChemistryTeacher ct = new ChemistryTeacher();
//		BiologyTeacher bt = new BiologyTeacher(); 
//		Teacher ref;
//		ref = pt;
//		ref.teach();
//		((PhysicsTeacher)ref).doExp(); //down casting
//		ref = ct;
//		ref.teach();
//		((ChemistryTeacher)ref).doExp();
//		ref = bt;
//		ref.teach();
//		((BiologyTeacher)ref).doExp();
//	} 
//}

////Polymorphic version with no code compactness and flexibility
//class Teacher
//{
//	public void teach()
//	{
//		System.out.println("Teacher is teaching");
//	}
//	public void doExp()
//	{
//		System.out.println("Teacher is doing expreiment");
//	}
//}
//class PhysicsTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Physics Teacher is teaching Physics");
//	}
//	public void doExp()
//	{
//		System.out.println("Physics teacher is doing expreiment");
//	}
//}
//class ChemistryTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Chemistry Teacher is teaching Chemistry");
//	}
//	public void doExp()
//	{
//		System.out.println("Chemistry teacher is doing expreiment");
//	}
//
//}
//class BiologyTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Biology Teacher is teaching Biology");
//	}
//	public void doExp()
//	{
//		System.out.println("Biology teacher is doing expreiment");
//	}
//
//}
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		PhysicsTeacher pt = new PhysicsTeacher(); 
//		ChemistryTeacher ct = new ChemistryTeacher();
//		BiologyTeacher bt = new BiologyTeacher(); 
//		Teacher ref;
//		ref = pt;
//		ref.teach();
//		ref.doExp(); 
//		ref = ct;
//		ref.teach();
//		ref.doExp();
//		ref = bt;
//		ref.teach();
//		ref.doExp();
//	} 
//}


////Polymorphic version with code compactness and flexibility
//class Teacher
//{
//	public void teach()
//	{
//		System.out.println("Teacher is teaching");
//	}
//	public void doExp()
//	{
//		System.out.println("Teacher is doing expreiment");
//	}
//}
//class PhysicsTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Physics Teacher is teaching Physics");
//	}
//	public void doExp()
//	{
//		System.out.println("Physics teacher is doing expreiment");
//	}
//}
//class ChemistryTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Chemistry Teacher is teaching Chemistry");
//	}
//	public void doExp()
//	{
//		System.out.println("Chemistry teacher is doing expreiment");
//	}
//
//}
//class BiologyTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Biology Teacher is teaching Biology");
//	}
//	public void doExp()
//	{
//		System.out.println("Biology teacher is doing expreiment");
//	}
//
//}
//class College
//{
//	public void acceptTeacher(Teacher ref)
//	{
//		ref.teach();
//		ref.doExp();
//	}
//}
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		PhysicsTeacher pt = new PhysicsTeacher(); 
//		ChemistryTeacher ct = new ChemistryTeacher();
//		BiologyTeacher bt = new BiologyTeacher(); 
//		College c = new College();
//		c.acceptTeacher(pt);
//		c.acceptTeacher(ct);
//		c.acceptTeacher(bt);
//	} 
//}


////Abstraction -  providing the signature of the methods but not implementation
//abstract class Teacher // since we have abstract method in the class then the class should abstract
//{
//	abstract public void teach(); // By declaring the methods as abstract methods
//	
//	abstract public void doExp();
//
//}
//class PhysicsTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Physics Teacher is teaching Physics");
//	}
//	public void doExp()
//	{
//		System.out.println("Physics teacher is doing expreiment");
//	}
//}
//class ChemistryTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Chemistry Teacher is teaching Chemistry");
//	}
//	public void doExp()
//	{
//		System.out.println("Chemistry teacher is doing expreiment");
//	}
//
//}
//class BiologyTeacher extends Teacher
//{
//	public void teach()
//	{
//		System.out.println("Biology Teacher is teaching Biology");
//	}
//	public void doExp()
//	{
//		System.out.println("Biology teacher is doing expreiment");
//	}
//
//}
//class College
//{
//	public void acceptTeacher(Teacher ref)
//	{
//		ref.teach();
//		ref.doExp();
//	}
//}
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		PhysicsTeacher pt = new PhysicsTeacher(); 
//		ChemistryTeacher ct = new ChemistryTeacher();
//		BiologyTeacher bt = new BiologyTeacher(); 
//		College c = new College();
//		c.acceptTeacher(pt);
//		c.acceptTeacher(ct);
//		c.acceptTeacher(bt);
//	} 
//}

abstract class Bird // 2. An abstract Parent class can have abstract child class 5.[Pure abstract class]
{
	abstract public void fly(); //abstract
	abstract public void eat(); // abstract 
}
abstract class Eagle extends Bird // 1.An abstract class can have parent class Abstract 6.[Impure abstract class]
{
	//eat();  // abstract 
	public void fly() // non abstract
	{
		System.out.println("Eagles are flying at high altitude");
	}
}
abstract class Sparrow extends Bird
{
	public void fly()
	{
		System.out.println("Sparrows are flying at low altitude");
	}
}
class GoldenEagle extends Eagle // 3. An abstract class can have concrete class as child
{
	public void eat()
	{
		System.out.println("Golden eagle hunts fishes and eat");
	}
}
class SerpentEagle extends Eagle //4. A concrete class can have parent class as abstract
{
	public void eat()
	{
		System.out.println("Serpent eagle hunts snakes and eat");
	}
}
class VegSparrow extends Sparrow
{
	public void eat()
	{
		System.out.println("Veg Sparrow eats grains");
	}
}
class NonVegSparrow extends Sparrow
{
	public void eat()
	{
		System.out.println("Non Veg Sparrow eats Insects");
	}
}
class Sky
{
	public void acceptBirds(Bird ref)
	{
		ref.fly();
		ref.eat();
	}
}
class PolymorphicExamples extends Object {
	
	public static void main(String[] args) {
		
		GoldenEagle ge = new GoldenEagle();
		SerpentEagle se = new SerpentEagle();
		VegSparrow vs = new VegSparrow();
		NonVegSparrow nvs = new NonVegSparrow();
		Sky s = new Sky();
		s.acceptBirds(ge);
		s.acceptBirds(se);
		s.acceptBirds(vs);
		s.acceptBirds(nvs);
	
	} 
}

////Rule No 7 : You can not create object for abstract classes
//abstract class Bird 
//{
//	abstract public void fly(); 
//}
//class Eagle extends Bird
//{
//	public void fly() 
//	{
//		System.out.println("Eagles are flying at high altitude");
//	}
//}
//
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		Bird b = new Bird(); // error : Cannot instantiate the type Bird
//	} 
//}

////Rule No 8 : class Bird can be either abstract or final, not both bcz we can not achieve abstraction
//final abstract class Bird 
//{
//	abstract public void fly(); 
//}
//class Eagle extends Bird
//{
//	public void fly() 
//	{
//		System.out.println("Eagles are flying at high altitude");
//	}
//}
//
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		
//	} 
//}


//Rule No 9: when we dont want to create object for the classes declare them as abstract
//abstract class Bird 
//{
//	abstract public void fly(); 
//}
//abstract class Eagle extends Bird
//{
//	public void fly() 
//	{
//		System.out.println("Eagles are flying at high altitude");
//	}
//}
//
//class PolymorphicExamples extends Object {
//	
//	public static void main(String[] args) {
//		
//	} 
//}











