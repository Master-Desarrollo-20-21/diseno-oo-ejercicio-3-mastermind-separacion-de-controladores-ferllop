package mastermind;

import mastermind.models.Game;
import mastermind.views.graphics.GraphicsGameView;

class GraphicsMastermind {
	
	Game game;
	GraphicsGameView gameView;
	
	public GraphicsMastermind() {
		game = new Game();
		gameView = new GraphicsGameView(game);
	}
	
	public void play() {		
		this.gameView.interact();
	}	

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}
