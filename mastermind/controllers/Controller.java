package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public abstract class Controller {
	protected Game game;
	protected State state;

	public Controller(Game game, State state) {
		this.game = game;
		this.state = state;
	}
	
	public void next() {
		this.state.next();
	}
	
}
