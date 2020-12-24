package mastermind;

import mastermind.controllers.Logic;
import mastermind.views.graphics.GraphicsGameView;

class GraphicsMastermind extends Mastermind{
	
	@Override
	protected GraphicsGameView createView(Logic logic) {
		return new GraphicsGameView();
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
