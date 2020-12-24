package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.Logic;
import mastermind.views.GameView;

public abstract class Mastermind {

	Logic logic;
	GameView gameView;

	public Mastermind() {
		logic = new Logic();
		gameView = this.createView();
	}

	protected abstract GameView createView();

	public void play() {
		Controller controller;
		do {
			controller = this.logic.getController();
			this.gameView.interact(controller);
		} while (controller != null);
	}
}
