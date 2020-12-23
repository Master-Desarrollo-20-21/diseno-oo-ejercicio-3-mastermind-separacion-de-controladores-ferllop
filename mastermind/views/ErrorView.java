package mastermind.views;

import java.util.ArrayList;
import java.util.HashMap;

import mastermind.models.Color;
import mastermind.models.MastermindCombinationChecker;
import mastermind.types.Error;
import utils.ConsoleIO;

public class ErrorView {
	
	private HashMap<Error, String> errorMessages = new HashMap<>();
	
	public ErrorView() {
		errorMessages.put(Error.NOT_VALID_VALUES, Message.ERROR_NOT_VALID_VALUES.getFormattedMessage(new String[] {Color.getInitials()}));
		errorMessages.put(Error.NOT_VALID_LENGTH, Message.ERROR_NOT_VALID_LENGTH.getMessage());
		errorMessages.put(Error.DUPLICATED_VALUES, Message.ERROR_DUPLICATED_VALUES.getMessage());
	}

	public void interact(MastermindCombinationChecker combinationChecker) {
		if (combinationChecker.isValid()) {
			return;
		}
		ConsoleIO.getInstance().print(this.renderErrorMessage(combinationChecker));
	}

	private String renderErrorMessage(MastermindCombinationChecker combinationChecker) {
		ArrayList<String> errorMessage = new ArrayList<>();
		for (Error error : combinationChecker.getErrors()) {
			if(!error.isNull()) {
				errorMessage.add(errorMessages.get(error));				
			}
		}
		return String.join("\n", errorMessage);
	}
}
