package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.Message;
import utils.ConsoleIO;

public class ResumeView {	
	
	public void interact(ResumeController resumeController) {
		if(this.isResumed()) {
			resumeController.reset();
		}
			resumeController.next();
	}
	
	private boolean isResumed() {
		return this.read(Message.PLAY_AGAIN.getMessage() + ": ").equals("s");
	}

	private String read(String title) {
		String answer;
		do {
			 answer = ConsoleIO.getInstance().getString(title).toLowerCase();			
		} while (!answer.equals("s") && !answer.equals("n") );	
		return answer;
	}
}
