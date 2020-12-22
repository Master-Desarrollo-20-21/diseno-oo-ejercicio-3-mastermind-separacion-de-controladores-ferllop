package mastermind.views.console;

import mastermind.models.Game;
import mastermind.views.GameView;
import mastermind.views.Message;
import utils.ConsoleIO;

public class ConsoleGameView extends GameView {
	
	private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView(Game game) {
		super(game);
		this.playView = new PlayView(game);
		this.resumeView = new ResumeView();
	}

	
	@Override 
	protected void play() {
		this.playView.interact();
	}
	
	@Override 
	protected void start() {
		this.game.initialize();
	}
	
	@Override 
	protected boolean isResumed() {
		return this.resumeView.read(Message.PLAY_AGAIN.getMessage() + ": ");
	}

	@Override
	protected void finish() {
			ConsoleIO.getInstance().print(Message.END.getMessage());
	}

}
