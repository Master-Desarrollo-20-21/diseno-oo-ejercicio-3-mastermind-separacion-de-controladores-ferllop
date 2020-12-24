package mastermind.views;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllerVisitor;

public abstract class GameView implements ControllerVisitor{

	public void interact(Controller controller) {
		controller.accept(this);
	}
	
}
