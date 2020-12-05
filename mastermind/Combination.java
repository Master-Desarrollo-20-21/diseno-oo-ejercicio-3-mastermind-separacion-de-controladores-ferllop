package mastermind;

public abstract class Combination {
	
	protected final int COMBINATION_LENGTH = 4;
	protected Position[] combination;
	
	public String getHiddenString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < combination.length; i++) {
			result.append("x");
		}		
		return result.toString();
	}
	
	public String getUnhiddenString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < combination.length; i++) {
			result.append(combination[i].getInitial());
		}		
		return result.toString();
	}	
}
