package hello.livre.exceptions;

public class BirthDateException extends Exception {
	
	public String getMessage() {
		
		return "La date de naissance ne peut �tre sup�rieure � la date du jour";
	}
}
