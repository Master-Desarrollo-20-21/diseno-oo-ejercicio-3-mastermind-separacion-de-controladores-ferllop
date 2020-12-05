package mastermind;

public class Position {
	
	private int location;
	private Color color;
	
	public Position(int location, Color color) {
		this.location = location;
		this.color = color;		
	}
	
	public boolean hasSameColor(Position position) {
		return this.color == position.color;
	}
	
	public boolean hasSamePosition(Position position) {
		return this.location == position.location;
	}
	
	public char getInitial() {
		return color.getInitial();
	}
}
