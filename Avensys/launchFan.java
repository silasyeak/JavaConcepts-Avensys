package com.java.programs;

class Fan{
	String color;
	String brand;
	int numOfWings;

	void rotate() {
		System.out.println("Fan is rotating");
	}
	void stop() {
		System.out.println("Fan stopped rotating");
	}
	void blowAir() {
		System.out.println("Air is blowing");
	}
	
}

class launchFan {
	public static void main(String [] args) {
		Fan Dyson = new Fan();
		Fan Prism = new Fan();
		Fan Kichler = new Fan();
		
		Dyson.rotate();
		Prism.stop();
		Kichler.blowAir();
		
	}
}

