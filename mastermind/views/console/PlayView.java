package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Message;
import utils.ConsoleIO;

public class PlayView {
	
	private AttemptView attemptView;
	
	public PlayView() {
		attemptView = new AttemptView();
	}

	public void interact(PlayController playController) {	
		do {	
			this.attemptView.interact(playController);
			ConsoleIO.getInstance().printEmptyLine();
		} while (!playController.isFinished());			
		ConsoleIO.getInstance().print(this.renderResultMessage(playController));
	}	
	
	private String renderResultMessage(PlayController playController) {
		if (playController.playerWins()) {
			return Message.YOU_WIN.getMessage();
		}			
		return Message.YOU_LOSE.getMessage();
	}
}
