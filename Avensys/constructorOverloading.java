package isolate1;

//Constructor overloading

class Fan extends Object{
	private String brand;
	private int maxWindSpeed;
	private int cost;
	
	public Fan() {
		//super
	}
	
	public Fan(String brand, int maxWindSpeed, int cost) {
		this();
		this.brand = brand;
		this.maxWindSpeed = maxWindSpeed;
		this.cost = cost;
	}
	
	public Fan(String brand, int maxWindSpeed) {
		this("Dyson", 10, 400);
		this.brand = brand;
		this.maxWindSpeed = maxWindSpeed;
	}
	
	public Fan(String brand) {
		this("Fanco", 7, 200);
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getMaxWindSpeed() {
		return maxWindSpeed;
	}
	public int getCost() {
		return cost;
	}
	
}


public class constructorOverloading {

	public static void main(String[] args) {
		Fan f = new Fan("Fanatic");
		System.out.println("Brand:"+f.getBrand());
		System.out.println("Max Wind Speed:"+ f.getMaxWindSpeed());
		System.out.println("Cost of fan:"+f.getCost());

	}

}
