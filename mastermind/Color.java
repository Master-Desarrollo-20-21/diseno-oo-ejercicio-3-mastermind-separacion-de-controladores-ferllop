package mastermind;

enum Color {
	RED('r'),
	BLUE('b'),
	YELLOW('y'),
	GREEN('g'),
	ORANGE('o'),
	PURPLE('p');
	
	private char initial;
	
	private Color(char initial) {
		this.initial = initial;
	}
	
	public char getInitial() {
		return initial;		
	}
	
	public static Color valueOf(char initial) {
        for (Color color : values()) {
            if (color.initial == initial) {
                return color;
            }
        }
        return null;
    }
}
