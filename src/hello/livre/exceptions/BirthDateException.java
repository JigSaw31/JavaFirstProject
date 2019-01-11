package hello.livre.exceptions;

public class BirthDateException extends Exception {
	
	public String getMessage() {
		
		return "La date de naissance ne peut être supérieure à la date du jour";
	}
}
