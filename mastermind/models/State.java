package mastermind.models;

public class State {
	private StateValues stateValue;
	
	public State() {
		this.reset();
	}
	
	public StateValues getStateValue() {
		return stateValue;
	}
	
	public void next() {
		stateValue = StateValues.values()[stateValue.ordinal() + 1];
	}

	public void reset() {
		stateValue = StateValues.INITIAL;		
	}	
	
}
