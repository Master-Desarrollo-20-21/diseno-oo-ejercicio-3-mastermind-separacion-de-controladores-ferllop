package mastermind;

import mastermind.views.console.ConsoleGameView;

class ConsoleMastermind extends Mastermind {
	
	@Override
	protected ConsoleGameView createView() {
		return new ConsoleGameView();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
	
}
