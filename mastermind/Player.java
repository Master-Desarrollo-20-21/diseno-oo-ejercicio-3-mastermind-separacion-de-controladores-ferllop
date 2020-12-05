package mastermind;

import java.util.ArrayList;

public class Player {

	ArrayList<ProposedCombination> proposedCombinations;

	public Player() {
		proposedCombinations = new ArrayList<ProposedCombination>();
	}

	public void proposeCombination(int validLength) {
		char[] validColorInitials = new char[Color.values().length];
		for (int i = 0; i < Color.values().length; i++) {
			validColorInitials[i] = Color.values()[i].getInitial();
		}
		ProposedCombination proposedCombination = new ProposedCombination(
			new ConsoleIO().getValidValue("Propose a combination", validColorInitials, validLength)
		);
		proposedCombinations.add(proposedCombination);
	}
}
