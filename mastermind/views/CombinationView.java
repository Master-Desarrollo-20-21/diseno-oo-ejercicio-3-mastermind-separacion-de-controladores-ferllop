package mastermind.views;

import mastermind.models.Combination;
import utils.ConsoleIO;

public class CombinationView{
	Combination combination;
	
	public CombinationView(Combination combination) {
		this.combination = combination;
	}
	
	public void print(char symbol) {
		ConsoleIO.getInstance().print(combination.toString(symbol));
	}
	
	public void print() {		
		ConsoleIO.getInstance().print(combination.toString());
	}

}
