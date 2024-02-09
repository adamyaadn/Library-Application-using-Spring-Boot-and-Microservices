package training.trg.book.exceptions;

public class NonExistentDataAccess extends RuntimeException {
	public String getMessage() {
		return "Employee doesn't exist.";
	}
}	
