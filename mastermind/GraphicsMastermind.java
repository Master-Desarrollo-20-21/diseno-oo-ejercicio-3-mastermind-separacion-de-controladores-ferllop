package mastermind;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.StartController;
import mastermind.views.graphics.GraphicsGameView;

class GraphicsMastermind extends Mastermind{
	
	@Override
	protected GraphicsGameView createView(StartController startController, PlayController playController, AttemptController attemptController) {
		return new GraphicsGameView();
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
