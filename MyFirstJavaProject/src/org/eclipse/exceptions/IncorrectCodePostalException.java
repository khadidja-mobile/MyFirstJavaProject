package org.eclipse.exceptions;

public class IncorrectCodePostalException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectCodePostalException(String cp) {
		System.out.println("Le code postal " + cp + "doit contenir 5 chiffres");
	}
	

}
