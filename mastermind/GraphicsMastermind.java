package mastermind;

import mastermind.views.graphics.GraphicsGameView;

class GraphicsMastermind extends Mastermind{
	
	@Override
	protected GraphicsGameView createView() {
		return new GraphicsGameView();
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
