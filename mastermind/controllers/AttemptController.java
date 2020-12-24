package mastermind.controllers;

import java.util.ArrayList;

import mastermind.models.Attempt;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;

public class AttemptController {
	
	Game game;

	public AttemptController(Game game) {
		this.game = game;
	}
	
	public void saveAttempt(ProposedCombination proposedCombination) {
		this.game.saveAttempt(proposedCombination);
	}
	
	public int getAttemptsCount() {
		return this.game.getAttemptsCount();
	}
	
	public ArrayList<Attempt> getAttempts(){
		return this.game.getAttempts();		
	}	

}
