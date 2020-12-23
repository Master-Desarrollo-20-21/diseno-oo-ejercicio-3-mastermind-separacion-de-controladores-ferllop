package mastermind.views.console;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.StartController;
import mastermind.views.GameView;
import mastermind.views.Message;
import utils.ConsoleIO;

public class ConsoleGameView extends GameView {
	
	private StartController startController;
	private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView(StartController startController, PlayController playController, AttemptController attemptController) {
		this.startController = startController;
		this.playView = new PlayView(playController, attemptController);
		this.resumeView = new ResumeView();
	}
	
	@Override 
	protected void play() {
		this.playView.interact();
	}
	
	@Override 
	protected void start() {
		this.startController.start();
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
