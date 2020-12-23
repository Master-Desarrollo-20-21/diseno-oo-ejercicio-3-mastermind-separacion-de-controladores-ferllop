package mastermind.views.console;

import mastermind.controllers.AttemptController;
import mastermind.models.Attempt;
import mastermind.models.ProposedCombination;
import mastermind.views.Message;
import utils.ConsoleIO;

public class AttemptView {
	
	AttemptController attemptController;
	private ProposedCombinationView proposedCombinationView;
	private SecretCombinationView secretCombinationView;
	
	public AttemptView(AttemptController attemptController) {
		this.attemptController = attemptController;
		proposedCombinationView = new ProposedCombinationView();
		secretCombinationView = new SecretCombinationView();
	}
	
	public void interact() {
		ConsoleIO.getInstance().print(
			Message.ATTEMPTS_COUNT.getFormattedMessage(new String[] {String.valueOf(this.attemptController.getAttemptsCount())}
		));
		this.secretCombinationView.write();
		this.printAttempts();
		ProposedCombination proposedCombination = this.proposedCombinationView.read(Message.PROPOSE_COMBINATION.getMessage() + ": ");
		this.attemptController.saveAttempt(proposedCombination);
	}
	
	private void printAttempts() {
		for (Attempt attempt : this.attemptController.getAttempts()) {
			String combination = this.proposedCombinationView.renderCombinationInitials(attempt.getProposedCombination());
			ConsoleIO.getInstance().print(Message.RESULT.getFormattedMessage(
				new String[]{combination, String.valueOf(attempt.getBlacks()), String.valueOf(attempt.getWhites())}
			));
		}
	}		
}
