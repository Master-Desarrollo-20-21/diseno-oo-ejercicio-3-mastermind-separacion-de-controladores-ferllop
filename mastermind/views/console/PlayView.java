package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import utils.ConsoleIO;

public class PlayView {
	
	private AttemptView attemptView;
	private Logic logic;
	
	public PlayView(Logic logic) {
		this.logic = logic;
		attemptView = new AttemptView(logic);
	}

	public void interact() {	
		do {	
			this.attemptView.interact();
			ConsoleIO.getInstance().printEmptyLine();
		} while (!this.logic.isFinished());			
		ConsoleIO.getInstance().print(this.renderResultMessage());
	}	
	
	private String renderResultMessage() {
		if (this.logic.playerWins()) {
			return Message.YOU_WIN.getMessage();
		}			
		return Message.YOU_LOSE.getMessage();
	}
}
