package mastermind.views;

import mastermind.models.Color;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import utils.ConsoleIO;

public class PlayView extends View {
	
	public PlayView(Game game) {
		super(game);
	}

	@Override
	public void interact() {	
		AttemptView attemptView = new AttemptView(game);
		do {	
			this.printAttempts();
			this.printSecretCombinationUnhidden();
			this.printResults();
			attemptView.interact();
			this.printLine();
		} while (!this.game.isFinished());			
		this.printResultMessage();			
	}	
	
	private void printSecretCombinationHidden(char symbol) {
		ConsoleIO.getInstance().print(this.game.getSecretCombination().toString(symbol));
	}
	
	private void printSecretCombinationUnhidden() {		
		ConsoleIO.getInstance().print(this.game.getSecretCombination().toString());
	}	
	
	private void printAttempts() {
		ConsoleIO.getInstance().printAttempts(this.game.getProposedCombinationsCount());
	}

	private void printResults() {
		for (ProposedCombination proposedCombination : this.game.getProposedCombinations()) {
			int blacks = proposedCombination.countBlacks(this.game.getSecretCombination());
			int whites = proposedCombination.countWhites(this.game.getSecretCombination());
			ConsoleIO.getInstance().printProposalResult(proposedCombination, blacks, whites);
		}
	}
	
	private void printResultMessage() {
		String message;
		if (this.game.playerWins()) {
			message = "You've won!!!";
		}		
		message = "You've lost!!!";	
		ConsoleIO.getInstance().print(message);
	}
	
	private void printLine() {
		ConsoleIO.getInstance().print("");
	}

}
