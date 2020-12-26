package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.GameView;

public class ConsoleGameView extends GameView {
	private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView() {
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}
	
	@Override
	public void visit(StartController startController) {
		startController.start();
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);	
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
		
	}
}
