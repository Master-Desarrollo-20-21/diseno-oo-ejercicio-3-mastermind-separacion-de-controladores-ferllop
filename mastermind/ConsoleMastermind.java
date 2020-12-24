package mastermind;

import mastermind.controllers.Logic;
import mastermind.views.console.ConsoleGameView;

class ConsoleMastermind extends Mastermind {
	
	@Override
	protected ConsoleGameView createView(Logic logic) {
		return new ConsoleGameView(logic);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
	
}
