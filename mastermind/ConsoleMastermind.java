package mastermind;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.StartController;
import mastermind.views.console.ConsoleGameView;

class ConsoleMastermind extends Mastermind {
	
	@Override
	protected ConsoleGameView createView(StartController startController, PlayController playController, AttemptController attemptController) {
		return new ConsoleGameView(startController, playController, attemptController);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
	
}
