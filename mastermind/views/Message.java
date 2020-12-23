package mastermind.views;

public enum Message {
	PROPOSE_COMBINATION("Propose a combination"),
	YOU_WIN("You've won!!!"),
	YOU_LOSE("You've lost!!!"),
	PLAY_AGAIN("¿Quieres volver a jugar? (s/n)"),
	END("BYE BYE"),
	ATTEMPTS_COUNT("%s attempt(s):"),
	RESULT("%s --> %s blacks and %s whites"),
	ERROR_DUPLICATED_VALUES("Can't be duplicated colors"),
	ERROR_NOT_VALID_VALUES("Wrong colors, they must be: %s"),
	ERROR_NOT_VALID_LENGTH("Wrong proposed combination length");
	
	private String message;
	
	private Message(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public String getFormattedMessage(String[] values) {
		return String.format(this.getMessage(), (Object[]) values);
	}
}
