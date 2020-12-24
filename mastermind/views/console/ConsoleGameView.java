package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.GameView;
import mastermind.views.Message;
import utils.ConsoleIO;

public class ConsoleGameView extends GameView {
	private Logic logic;
	private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView(Logic logic) {
		this.logic = logic;
		this.playView = new PlayView(logic);
		this.resumeView = new ResumeView();
	}
	
	@Override 
	protected void play() {
		this.playView.interact();
	}
	
	@Override 
	protected void start() {
		this.logic.start();
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
