package mastermind;

import mastermind.models.Game;
import mastermind.views.GameView;

public abstract class Mastermind {
		
		Game game;
		GameView gameView;
		
		public Mastermind() {
			game = new Game();
			gameView = this.createView(game);
		}
		
		protected abstract GameView createView(Game game);
		
		public void play() {		
			this.gameView.interact();
	}
}
