package mastermind.types;

public enum Error {
	NOT_VALID_LENGTH,
	NOT_VALID_VALUES,
	DUPLICATED_VALUES,
	NULL;
	
	public boolean isNull() {
		return this == Error.NULL;
	}
}
