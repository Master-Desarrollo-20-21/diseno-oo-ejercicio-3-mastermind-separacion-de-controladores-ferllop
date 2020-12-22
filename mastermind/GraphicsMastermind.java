package mastermind;

import mastermind.models.Game;
import mastermind.views.graphics.GraphicsGameView;

class GraphicsMastermind extends Mastermind{
	
	@Override
	protected GraphicsGameView createView(Game game) {
		return new GraphicsGameView(game);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
