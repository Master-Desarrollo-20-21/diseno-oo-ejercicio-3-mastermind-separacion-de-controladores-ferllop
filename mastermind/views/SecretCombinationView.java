package mastermind.views;

import mastermind.models.Game;
import utils.ConsoleIO;

public class SecretCombinationView {
	
	public void write() {
		String result = "";		
		for (int i = 0; i < Game.COMBINATION_LENGTH; i++) {
			result += "x";
		}		
		ConsoleIO.getInstance().print(result);
	}
}
