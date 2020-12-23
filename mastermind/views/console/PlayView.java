package mastermind.views.console;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.views.Message;
import utils.ConsoleIO;

public class PlayView {
	
	private AttemptView attemptView;
	private PlayController playController;
	
	public PlayView(PlayController playController, AttemptController attemptController) {
		this.playController = playController;
		attemptView = new AttemptView(attemptController);
	}

	public void interact() {	
		do {	
			this.attemptView.interact();
			ConsoleIO.getInstance().printEmptyLine();
		} while (!this.playController.isFinished());			
		ConsoleIO.getInstance().print(this.renderResultMessage());
	}	
	
	private String renderResultMessage() {
		if (this.playController.playerWins()) {
			return Message.YOU_WIN.getMessage();
		}			
		return Message.YOU_LOSE.getMessage();
	}
}
