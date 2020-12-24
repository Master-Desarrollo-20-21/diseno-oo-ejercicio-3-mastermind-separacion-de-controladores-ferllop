package mastermind.views.console;

import mastermind.controllers.Controller;
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
	public void interact(Controller controller) {
		if (controller instanceof StartController) {
			((StartController) controller).start();
		} else if (controller instanceof PlayController) {
			this.playView.interact((PlayController) controller);			
		} else if (controller instanceof ResumeController) {
			this.resumeView.interact((ResumeController) controller);
		}
	}
}
