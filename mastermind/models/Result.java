package mastermind.models;

public class Result {
	
	private final ProposedCombination proposedCombination;
	private final SecretCombination secretCombination;
	
	public Result(ProposedCombination proposedCombination, SecretCombination secretCombination) {
		this.proposedCombination = proposedCombination;
		this.secretCombination = secretCombination;
	}

	public int getBlacks() {
		int blacks = 0;
		for (int i = 0; i < secretCombination.getSize(); i++) {
			if (secretCombination.getColor(i) == proposedCombination.getColor(i)) {
				blacks++;
			}
		}
		return blacks;
	}

	public int getWhites() {
		int whites = 0;
		for (int i = 0; i < secretCombination.getSize(); i++) {
			if (proposedCombination.contains(secretCombination.getColor(i))) {
				whites++;
			}
		}
		return whites - this.getBlacks();
	}

	public ProposedCombination getProposedCombination() {
		return proposedCombination;
	}
}
