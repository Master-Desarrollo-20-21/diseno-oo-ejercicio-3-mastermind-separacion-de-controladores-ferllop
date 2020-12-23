package mastermind.views;

public abstract class GameView {

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
