package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import mastermind.types.Error;

public abstract class CombinationChecker<T> {
	
	private T[] combination;
	
	public CombinationChecker(T[] combination) {
		this.combination = combination;
	}
	
	public Error checkValidLength(int validLength) {
		if (combination.length != validLength) {
			return Error.NOT_VALID_LENGTH;
		}
		return Error.NULL;
	}

	public Error checkValidValues(T[] validValues) {
		for (T value : combination) {
			if (!Arrays.asList(validValues).contains(value)) {
				return Error.NOT_VALID_VALUES;
			}
		}
		return Error.NULL;
	}

	public Error checkDuplicates() {
		HashSet<T> list = new HashSet<T>(Arrays.asList(combination));
		if (list.size() != combination.length) {
			return Error.DUPLICATED_VALUES;
		}
		return Error.NULL;
	}
	
	public boolean isValid() {
		for(Error error : this.getErrors()) {
			if (!error.isNull()) {
				return false;
			}
		}		
		return true;
	}
	
	public abstract ArrayList<Error> getErrors();
}