package gamerevision;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		//if you pick one, you just call either/or
		var game = new MarioGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
		

	}

}
