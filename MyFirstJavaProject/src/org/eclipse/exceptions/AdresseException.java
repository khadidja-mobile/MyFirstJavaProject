package org.eclipse.exceptions;

public class AdresseException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdresseException(String nom, String cp) {
		//if(!nom.isEmpty() & cp.isEmpty()) 
			System.out.println("Le nom " + nom + " de la rue doit être en majuscule");
		//if(!cp.isEmpty() & nom.isEmpty()) 
			System.out.println("Le code postal " + cp + " doit contenir 5 chiffres");
	}

}
