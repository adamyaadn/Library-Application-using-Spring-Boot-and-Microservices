package training.trg.author.exceptions;

public class DuplicateDataException extends RuntimeException {
	public String getMessage() {
		return "Employee already exists.";
	}
}
