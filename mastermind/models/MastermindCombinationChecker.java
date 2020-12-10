package mastermind.models;

import utils.CombinationChecker;

public class MastermindCombinationChecker extends CombinationChecker<String>{

	public MastermindCombinationChecker(String combination) {
		super(combination.split(""));
	}
	
	public boolean isValid() {
		return this.hasValidLength() 
				&& this.hasValidValues()
				&& !this.hasDuplicates();
	}
	
	public boolean hasValidLength() {
		return this.hasValidLength(Game.COMBINATION_LENGTH);
	}
	
	public boolean hasValidValues() {
		return this.hasValidValues(Color.getInitials().split(""));
	}
}
