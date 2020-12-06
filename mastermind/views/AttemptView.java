package mastermind.views;

import mastermind.models.Color;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import utils.ConsoleIO;

public class AttemptView extends View {

	public AttemptView(Game game) {
		super(game);
	}
	
	@Override
	public void interact() {
		ProposedCombination combination = this.proposeCombination(this.game.getSecretCombination().getSize());
		this.game.saveProposedCombination(combination);
	}
	
	private ProposedCombination proposeCombination(int validLength) {
		char[] validColorInitials = new char[Color.values().length];
		for (int i = 0; i < Color.values().length; i++) {
			validColorInitials[i] = Color.values()[i].getLetter();
		}
		ProposedCombination proposedCombination = new ProposedCombination(
				ConsoleIO.getInstance().getValidValue("Propose a combination", validColorInitials, validLength)
		);
		return proposedCombination;
	}
}
