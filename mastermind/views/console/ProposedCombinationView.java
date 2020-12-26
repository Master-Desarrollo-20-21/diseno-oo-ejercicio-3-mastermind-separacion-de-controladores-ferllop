package mastermind.views.console;

import mastermind.models.Color;
import mastermind.models.MastermindCombinationChecker;
import mastermind.models.ProposedCombination;
import mastermind.views.ErrorView;
import utils.ConsoleIO;

public class ProposedCombinationView {	
	
	private ErrorView errorView;
	
	public ProposedCombinationView() {
		errorView = new ErrorView();
	}
		
	public String renderCombinationInitials(ProposedCombination proposedCombination) {
		return Color.getInitials(proposedCombination.getColors());
	}
	
	public ProposedCombination read(String title) {
		String proposedCombination = "";
		MastermindCombinationChecker combinationChecker;
		do {
			proposedCombination = ConsoleIO.getInstance().getString(title);
			combinationChecker = ProposedCombination.getChecker(proposedCombination);
			this.errorView.interact(combinationChecker);			
		} while (!combinationChecker.isValid());
		return new ProposedCombination(proposedCombination);
	}				
}
