package mastermind.controllers;

import java.util.ArrayList;

import mastermind.models.Attempt;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;

public class Logic {
	Game game;
	StartController startController;
	PlayController playController;
	AttemptController attemptController;
	
	public Logic() {
		game = new Game();
		startController = new StartController(game);
		playController = new PlayController(game);
		attemptController = new AttemptController(game);
	}

	public void start() {
		this.startController.start();	
	}

	public boolean isFinished() {
		return this.playController.isFinished();
	}

	public boolean playerWins() {
		return this.playController.playerWins();
	}

	public void saveAttempt(ProposedCombination proposedCombination) {
		this.attemptController.saveAttempt(proposedCombination);
	}

	public ArrayList<Attempt> getAttempts() {
		return this.attemptController.getAttempts();
	}

	public int getAttemptsCount() {
		return this.attemptController.getAttemptsCount();
	}

}
