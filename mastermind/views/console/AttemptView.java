package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.models.Attempt;
import mastermind.models.ProposedCombination;
import mastermind.views.Message;
import utils.ConsoleIO;

public class AttemptView {
	
	private ProposedCombinationView proposedCombinationView;
	private SecretCombinationView secretCombinationView;
	
	public AttemptView() {
		proposedCombinationView = new ProposedCombinationView();
		secretCombinationView = new SecretCombinationView();
	}
	
	public void interact(PlayController playController) {
		ConsoleIO.getInstance().print(
			Message.ATTEMPTS_COUNT.getFormattedMessage(new String[] {String.valueOf(playController.getAttemptsCount())}
		));
		this.secretCombinationView.write();
		this.printAttempts(playController);
		ProposedCombination proposedCombination = this.proposedCombinationView.read(Message.PROPOSE_COMBINATION.getMessage() + ": ");
		playController.saveAttempt(proposedCombination);
	}
	
	private void printAttempts(PlayController playController) {
		for (Attempt attempt : playController.getAttempts()) {
			String combination = this.proposedCombinationView.renderCombinationInitials(attempt.getProposedCombination());
			ConsoleIO.getInstance().print(Message.RESULT.getFormattedMessage(
				new String[]{combination, String.valueOf(attempt.getBlacks()), String.valueOf(attempt.getWhites())}
			));
		}
	}		
}
