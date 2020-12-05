package mastermind;

public class Position {
	
	private Color color;
	
	public Position(Color color) {
		this.color = color;		
	}
	
	public boolean hasSameColor(Position position) {
		return this.color == position.color;
	}
	
	public char getInitial() {
		return color.getLetter();
	}
}
