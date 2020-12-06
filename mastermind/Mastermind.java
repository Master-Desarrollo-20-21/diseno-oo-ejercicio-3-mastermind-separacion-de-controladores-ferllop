package mastermind;

import mastermind.models.Game;
import mastermind.views.GameView;

class Mastermind {
	public final int ALLOWED_TOTAL_ATTEMPTS = 10;
	
	Game game;
	GameView gameView;
	
	public Mastermind() {
		game = new Game(ALLOWED_TOTAL_ATTEMPTS);
		gameView = new GameView(game);
	}
	
	public void play() {		
		this.gameView.interact();
	}	

	public static void main(String[] args) {
		new Mastermind().play();
	}
}
