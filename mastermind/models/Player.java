package mastermind.models;

import java.util.ArrayList;

public class Player {

	private ArrayList<Attempt> attempts;

	public Player() {
		attempts = new ArrayList<Attempt>();
	}
	
	public void saveAttempt(Attempt attempt) {
		attempts.add(attempt);
	}
	
	public Attempt getAttempt(int index) {
		return attempts.get(index);
	}	
	
	public Attempt getLastAttempt() {
		return attempts.get(attempts.size()-1);
	}	

	public ArrayList<Attempt> getAttempts() {
		return attempts;
	}

	public int getAttemptsCount() {
		return attempts.size();
	}
}
