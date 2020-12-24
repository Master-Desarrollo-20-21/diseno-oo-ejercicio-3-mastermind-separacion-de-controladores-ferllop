package mastermind.controllers;

import java.util.HashMap;
import mastermind.models.Game;
import mastermind.models.State;
import mastermind.models.StateValues;

public class Logic {
	Game game;
	State state;
	private HashMap<StateValues, Controller> controllers;
	
	public Logic() {
		game = new Game();
		state = new State();
		controllers = new HashMap<>();
		controllers.put(StateValues.INITIAL, new StartController(game, state));
		controllers.put(StateValues.IN_GAME, new PlayController(game, state));
		controllers.put(StateValues.RESUME, new ResumeController(game, state));
		controllers.put(StateValues.EXIT, null);
	}

	public Controller getController() {
		return this.controllers.get(this.state.getStateValue());
	}

}
