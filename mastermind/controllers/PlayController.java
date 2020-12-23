package mastermind.controllers;

import mastermind.models.Game;

public class PlayController extends Controller {
	
	public PlayController(Game game) {
		super(game);
	}

	public boolean isFinished() {
		return this.game.isFinished();
	}

	public boolean playerWins() {
		return this.game.playerWins();
	}
	
}
