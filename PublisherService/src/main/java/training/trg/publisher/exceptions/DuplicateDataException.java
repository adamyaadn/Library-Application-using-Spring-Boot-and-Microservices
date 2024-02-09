package training.trg.publisher.exceptions;

public class DuplicateDataException extends RuntimeException {
	public String getMessage() {
		return "Employee already exists.";
	}
}
