package isolate2;

class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger is eating");
	}
	
	public void sleep() {
		System.out.println("Tiger is sleeping");
	}
}
class Lion extends Animal{
	public void eat() {
		System.out.println("Lion is eating");
	}
	
	public void sleep() {
		System.out.println("Lion is sleeping");
	}
}


class Dog extends Animal{
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}

//this is the class that refers to the big parent class

class Zoo{
	public void pickAnimal(Animal ref) {
		ref.eat();
		ref.sleep();
	}
}


public class animalPolymorphism {

	public static void main(String[] args) {
		Tiger tr = new Tiger();
		Lion ln = new Lion();
		Dog dg = new Dog();
		Zoo z = new Zoo();
		z.pickAnimal(tr);;
		z.pickAnimal(ln);;
		z.pickAnimal(dg);;

	}

}
