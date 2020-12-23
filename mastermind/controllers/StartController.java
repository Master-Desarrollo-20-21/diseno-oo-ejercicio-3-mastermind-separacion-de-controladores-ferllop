package mastermind.controllers;

import mastermind.models.Game;

public class StartController extends Controller {

	public StartController(Game game) {
		super(game);
	}
	
	public void start() {
		this.game.initialize();
	}
	
}
