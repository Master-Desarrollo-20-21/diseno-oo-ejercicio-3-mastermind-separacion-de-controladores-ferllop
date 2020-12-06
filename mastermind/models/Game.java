package mastermind.models;

import java.util.ArrayList;

public class Game {
	
	private Player player;	
	private SecretCombination secretCombination;
	int allowedTotalAttempts;
	
	public Game(int allowedTotalAttempts) {
		this.allowedTotalAttempts = allowedTotalAttempts;
		this.initialize();
	}

	public void initialize() {
		this.secretCombination = new SecretCombination();
		this.player = new Player();
	}
	
	private boolean totalAttemptsSurpassed(int allowedTotalAttempts) {
		if (player.proposedCombinationsQuantity() >= allowedTotalAttempts) {
			return true;
		}		
		return false;
	}
	
	private boolean allBlacksInProposedCombination(ProposedCombination proposedCombination) {
		if (proposedCombination.countBlacks(secretCombination) == secretCombination.COMBINATION_LENGTH) {
			return true;
		};		
		return false;
	}
	
	private ProposedCombination getLastProposedCombination() {
		return player.getProposedCombinations().get(player.proposedCombinationsQuantity()-1);
	}	

	public SecretCombination getSecretCombination() {
		return secretCombination;
	}

	public Player getPlayer() {
		return player;
	}
	
	public ArrayList<ProposedCombination> getProposedCombinations() {
		return player.getProposedCombinations();
	}

	public boolean isFinished() {
		return this.totalAttemptsSurpassed(allowedTotalAttempts) || 
				this.playerWins();
	}
	
	public boolean playerWins() {
		return this.allBlacksInProposedCombination(this.getLastProposedCombination());
	}
	
}
