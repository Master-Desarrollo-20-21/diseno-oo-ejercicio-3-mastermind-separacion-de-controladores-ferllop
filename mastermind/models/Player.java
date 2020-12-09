package mastermind.models;

import java.util.ArrayList;

public class Player {

	private ArrayList<ProposedCombination> attempts;

	public Player() {
		attempts = new ArrayList<ProposedCombination>();
	}
	
	public void saveAttempt(ProposedCombination proposedCombination) {
		attempts.add(proposedCombination);
	}
	
	public ProposedCombination getAttempt(int index) {
		return attempts.get(index);
	}	
	
	public ProposedCombination getLastAttempt() {
		return attempts.get(attempts.size()-1);
	}	

	public ArrayList<ProposedCombination> getAttempts() {
		return attempts;
	}

	public int getAttemptsCount() {
		return attempts.size();
	}
}
