package mastermind;

import mastermind.controllers.Logic;
import mastermind.views.GameView;

public abstract class Mastermind {
		
		Logic logic;
		GameView gameView;
		
		public Mastermind() {
			logic = new Logic();
			gameView = this.createView(logic);
		}
		
		protected abstract GameView createView(Logic logic);
		
		public void play() {		
			this.gameView.interact();
	}
}
