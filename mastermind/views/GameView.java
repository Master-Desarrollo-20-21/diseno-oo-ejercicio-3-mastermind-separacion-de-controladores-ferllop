package mastermind.views;

import mastermind.models.Game;

public abstract class GameView extends View {
	
	public GameView(Game game) {
		super(game);
	}

	public void interact() {
		do {	
			start();
			play();
		} while (this.isResumed());	
		this.finish();	
	}

	protected abstract void play();

	protected abstract void start();

	protected abstract boolean isResumed();
	
	protected abstract void finish();	
	
}
