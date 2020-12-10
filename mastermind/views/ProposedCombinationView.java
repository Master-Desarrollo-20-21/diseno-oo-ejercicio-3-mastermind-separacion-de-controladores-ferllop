package mastermind.views;

import mastermind.models.Color;
import mastermind.models.MastermindCombinationChecker;
import mastermind.models.ProposedCombination;
import utils.ConsoleIO;

public class ProposedCombinationView {	
	
	private MastermindCombinationChecker combinationChecker;
	
	public String renderCombinationInitials(ProposedCombination proposedCombination) {
		return Color.getInitials(proposedCombination.getColors());
	}
	
	public ProposedCombination read(String title) {
		String proposedCombination = "";
		String errorMessage = "";
		do {
			proposedCombination = ConsoleIO.getInstance().getString(title);
			combinationChecker = new MastermindCombinationChecker(proposedCombination);
			errorMessage = this.renderErrorMessage(proposedCombination);
			if (!errorMessage.isEmpty()) {
				ConsoleIO.getInstance().print(errorMessage);
			}
		} while (!combinationChecker.isValid());
		return new ProposedCombination(proposedCombination);
	}
	
	public String renderErrorMessage(String combination) {
		String errorMessage = "";
		MastermindCombinationChecker combinationChecker = new MastermindCombinationChecker(combination);
		if(!combinationChecker.hasValidLength()) {
			errorMessage += Message.NO_VALID_LENGTH.getMessage() + "\n";
		}		
		if(!combinationChecker.hasValidValues()) {
			errorMessage += Message.NO_VALID_VALUES.getMessage() + ": " + Color.getInitials() + "\n";
		}		
		if(combinationChecker.hasDuplicates()) {
			errorMessage += Message.NO_DUPLICATED_COLORS.getMessage();
		}
		return errorMessage.trim();
	}
	
				
}
