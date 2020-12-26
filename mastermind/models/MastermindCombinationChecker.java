package mastermind.models;

import utils.CombinationChecker;

import java.util.ArrayList;

import mastermind.types.Error;

public class MastermindCombinationChecker extends CombinationChecker<String>{
	
	public MastermindCombinationChecker(String combination) {
		super(combination.split(""));
	}
	
	private Error checkValidColors() {
		return this.checkValidValues(Color.getInitials().split(""));
	}

	@Override
	public ArrayList<Error> getErrors() {
		ArrayList<Error> errors = new ArrayList<>();
		errors.add(this.checkValidLength(Game.COMBINATION_LENGTH));
		errors.add(this.checkValidColors()); 
		errors.add(this.checkDuplicates());
		return errors;
	}
	
}
