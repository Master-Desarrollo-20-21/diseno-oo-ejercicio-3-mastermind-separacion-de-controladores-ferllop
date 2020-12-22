package mastermind;

import mastermind.models.Game;
import mastermind.views.console.ConsoleGameView;

class ConsoleMastermind {
	
	Game game;
	ConsoleGameView gameView;
	
	public ConsoleMastermind() {
		game = new Game();
		gameView = new ConsoleGameView(game);
	}
	
	public void play() {		
		this.gameView.interact();
	}	

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
