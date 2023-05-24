package avensysPartTwo;

class FanEncapsulation{
	private int windSpeed;
	
	public void setWindSpeed(int x) {
		if(x>0) {
			windSpeed = x;
		}
		else {
			System.out.println("invalid wind speed");
		}
	}
	public int getWindSpeed() {
		return windSpeed;
	}
}

public class fanClass {

	public static void main(String[] args) {
		FanEncapsulation input = new FanEncapsulation();
		input.setWindSpeed(50);
		int fanSpeed = input.getWindSpeed();
		System.out.println("the wind speed is " + fanSpeed);

	}

}
