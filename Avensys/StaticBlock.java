package isolate1;

public class StaticBlock extends Object {
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("Static Method!!!");
	}
}