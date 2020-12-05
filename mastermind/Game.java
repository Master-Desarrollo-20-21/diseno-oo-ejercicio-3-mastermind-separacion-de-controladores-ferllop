package mastermind;

public class Game {
	
	private Player player;	
	private SecretCombination secretCombination;
	
	public Game() {
		this.secretCombination = new SecretCombination();
		this.player = new Player();
	}

	public void play(int allowedTotalAttempts) {
		do {
			this.printAttempts();
			this.printSecretCombinationUnhidden();
			this.printResults();
			player.proposeCombination(secretCombination.COMBINATION_LENGTH);
		} while (
			!this.totalAttemptsSurpassed(allowedTotalAttempts) && 
			!this.allBlacksInProposedCombination(this.getLastProposedCombination()) 
		);		
	}	
	
	private boolean totalAttemptsSurpassed(int allowedTotalAttempts) {
		if (player.proposedCombinations.size() >= allowedTotalAttempts) {
			new ConsoleIO().print("You've lost!!!");
			return true;
		}		
		return false;
	}
	
	private boolean allBlacksInProposedCombination(ProposedCombination proposedCombination) {
		if (proposedCombination.countBlacks(secretCombination) == secretCombination.COMBINATION_LENGTH) {
			new ConsoleIO().print("You've won!!!");
			return true;
		};		
		return false;
	}
	
	private ProposedCombination getLastProposedCombination() {
		return player.proposedCombinations.get(player.proposedCombinations.size()-1);
	}

	public boolean resume() {
		String answer;
		do {
			 answer = new ConsoleIO().getValidValue("¿Quieres volver a jugar? (s/n)", new char[] {'s', 'n'});			
		} while (!answer.equals("s") && !answer.equals("n") );	
		return answer.equals("s");
	}
	
	public void printSecretCombinationUnhidden() {
		new ConsoleIO().print(secretCombination.getUnhiddenString());
	}
	
	public void printSecretCombinationHidden() {		
		new ConsoleIO().print(secretCombination.getHiddenString());
	}	
	
	public void printAttempts() {
		new ConsoleIO().printAttempts(player.proposedCombinations.size()+1);
	}

	public void printResults() {
		ConsoleIO console = new ConsoleIO();
		for (ProposedCombination proposedCombination : player.proposedCombinations) {
			int blacks = proposedCombination.countBlacks(secretCombination);
			int whites = proposedCombination.countWhites(secretCombination);
			console.printProposalResult(proposedCombination, blacks, whites);
		}
	}
}
