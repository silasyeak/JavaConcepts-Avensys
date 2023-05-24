package isolate2;

abstract class Animals{
	abstract public void hunt();
	abstract public void communicate();
}

abstract class Lions extends Animals{
	public void hunt() {
		System.out.println("Lion is chasing after some Zebras");
	}
}
abstract class Human extends Animals{
	public void hunt() {
		System.out.println("Humans are factory farming, and the rest pay for the it");
	}
}

abstract class Fox extends Animals{
	public void hunt() {
		System.out.println("Fox hunts in packs");
	}
}

class MaleLion extends Lions{
	public void communicate() {
		System.out.println("Male lions communicate by roaring loudly");
	}
}

class MaleHuman extends Human{
	public void communicate() {
		System.out.println("Male humans communicate by using their words, most of the time");
	}
}

class MaleFox extends Fox{
	public void communicate() {
		System.out.println("Male Foxes communicate by making the sound Ring-ding-ding-ding");
	}
}

class AnimalActions{
	public void acceptActions(Animals ref){
		ref.hunt();
		ref.communicate();
	}
}


public class LionHumanAbstract extends Object {

	public static void main(String[] args) {
		MaleFox mf = new MaleFox();
		MaleHuman mh = new MaleHuman();
		MaleLion ml = new MaleLion();
		AnimalActions aa = new AnimalActions();
		
		aa.acceptActions(mh);
		System.out.println("--------------");
		aa.acceptActions(ml);
		System.out.println("--------------");
		aa.acceptActions(mf);

	}

}
