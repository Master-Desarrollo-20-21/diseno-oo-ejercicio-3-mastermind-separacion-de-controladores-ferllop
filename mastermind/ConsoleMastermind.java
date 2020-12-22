package mastermind;

import mastermind.models.Game;
import mastermind.views.console.ConsoleGameView;

class ConsoleMastermind extends Mastermind {
	
	@Override
	protected ConsoleGameView createView(Game game) {
		return new ConsoleGameView(game);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
	
}
