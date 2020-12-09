package mastermind.models;

import java.util.ArrayList;

public class Game {
	
	private Player player;	
	private SecretCombination secretCombination;
	private final int ALLOWED_TOTAL_ATTEMPTS = 10;
	public static final int COMBINATION_LENGTH = 4;
	
	public Game() {
		this.initialize();
	}

	public void initialize() {
		this.player = new Player();
		this.secretCombination = new SecretCombination(COMBINATION_LENGTH);
	}
	
	public void saveAttempt(ProposedCombination proposedCombination) {
		player.saveAttempt(proposedCombination);
	}	
	
	public boolean isFinished() {
		return this.playerLoses() || this.playerWins();
	}
	
	public boolean playerWins() {
		return new Result(this.player.getLastAttempt(), secretCombination).getBlacks() == COMBINATION_LENGTH;
	}
	
	private boolean playerLoses() {
		return player.getAttemptsCount() >= ALLOWED_TOTAL_ATTEMPTS;
	}
	
	public int getAttemptsCount() {
		return player.getAttemptsCount();
	}	
	
	public ArrayList<Result> getResults(){
		ArrayList<Result> results = new ArrayList<>();
		for(ProposedCombination proposedCombination : player.getAttempts()) {
			results.add(this.getResult(proposedCombination));
		}
		return results;
	}
	
	public Result getResult(ProposedCombination proposedCombination) {
		return new Result(proposedCombination, secretCombination);
	}
}
