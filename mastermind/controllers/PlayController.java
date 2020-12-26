package mastermind.controllers;

import java.util.ArrayList;

import mastermind.models.Attempt;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.State;

public class PlayController extends Controller {
	
	private AttemptController attemptController;
	
	public PlayController(Game game, State state) {
		super(game, state);
		attemptController = new AttemptController(game);
	}
	
	public boolean isFinished() {
		if (this.game.isFinished()) {
			this.state.next();
			return true;
		}
		return false;
	}

	public boolean playerWins() {
		return this.game.playerWins();
	}
	
	public void saveAttempt(ProposedCombination proposedCombination) {
		this.attemptController.saveAttempt(proposedCombination);
	}
	
	public int getAttemptsCount() {
		return this.attemptController.getAttemptsCount();
	}
	
	public ArrayList<Attempt> getAttempts(){
		return this.attemptController.getAttempts();		
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}	
	
}
