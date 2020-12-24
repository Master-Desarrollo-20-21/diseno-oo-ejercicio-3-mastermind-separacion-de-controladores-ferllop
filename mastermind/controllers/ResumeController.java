package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ResumeController extends Controller {

	public ResumeController(Game game, State state) {
		super(game, state);
	}

	public void reset() {
		this.game.initialize();
		this.state.reset();		
	}
}
