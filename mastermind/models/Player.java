package mastermind.models;

import java.util.ArrayList;

import utils.ConsoleIO;

public class Player {

	private ArrayList<ProposedCombination> proposedCombinations;

	public Player() {
		proposedCombinations = new ArrayList<ProposedCombination>();
	}
	
	public void saveProposedCombination(ProposedCombination proposedCombination) {
		proposedCombinations.add(proposedCombination);
	}
		
	public int proposedCombinationsQuantity() {
		return proposedCombinations.size();
	}

	public ArrayList<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}
}
