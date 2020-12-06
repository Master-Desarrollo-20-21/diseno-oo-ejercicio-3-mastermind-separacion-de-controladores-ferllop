package mastermind.models;

public abstract class Combination {
	
	protected final int COMBINATION_LENGTH = 4;
	protected Position[] combination;
	
	
	public String toString(char symbol) {
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < combination.length; i++) {
			result.append(symbol);
		}		
		return result.toString();
	}
	
	public int getSize() {
		return combination.length;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < combination.length; i++) {
			result.append(combination[i].getInitial());
		}		
		return result.toString();
	}	
}
