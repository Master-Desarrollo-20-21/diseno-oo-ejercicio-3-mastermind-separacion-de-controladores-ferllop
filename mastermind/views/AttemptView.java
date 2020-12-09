package mastermind.views;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import utils.ConsoleIO;

public class AttemptView extends View {
	
	private ProposedCombinationView proposedCombinationView;
	private SecretCombinationView secretCombinationView;
	private ResultView resultView;
	
	public AttemptView(Game game) {
		super(game);
		proposedCombinationView = new ProposedCombinationView();
		secretCombinationView = new SecretCombinationView();
		resultView = new ResultView();
	}
	
	@Override
	public void interact() {
		ConsoleIO.getInstance().print(this.game.getAttemptsCount() + " attempt(s):");
		this.secretCombinationView.write();
		this.printPreviousResults();
		ProposedCombination proposedCombination = this.proposedCombinationView.read(Message.PROPOSE_COMBINATION.getMessage() + ": ");
		this.game.saveAttempt(proposedCombination);
	}
	
	private void printPreviousResults() {
		for (Result result : this.game.getResults()) {
			ConsoleIO.getInstance().print(resultView.render(result));
		}
	}	
}
