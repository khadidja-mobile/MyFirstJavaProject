package org.eclipse.exceptions;

public class IncorrectStreetNameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectStreetNameException(String nom) {
		System.out.println("Le nom " +nom+ "de la rue doit être en majuscule");
	}

}
