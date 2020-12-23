package mastermind;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.StartController;
import mastermind.models.Game;
import mastermind.views.GameView;

public abstract class Mastermind {
		
		Game game;
		StartController startController;
		PlayController playController;
		AttemptController attemptController;
		GameView gameView;
		
		public Mastermind() {
			game = new Game();
			startController = new StartController(game);
			playController = new PlayController(game);
			attemptController = new AttemptController(game);
			gameView = this.createView(startController, playController, attemptController);
		}
		
		protected abstract GameView createView(StartController startController, PlayController playController, AttemptController attemptController);
		
		public void play() {		
			this.gameView.interact();
	}
}
