package org.eclipse.models;

import org.eclipse.exceptions.AdresseException;
import org.eclipse.exceptions.IncorrectCodePostalException;
import org.eclipse.exceptions.IncorrectStreetNameException;

public class Adresse {

	private String rue;
	private String codePostal;
	private String ville;
	
	public Adresse(String rue, String codePostal, String ville) throws AdresseException {
		super();
		if(!rue.equals(rue.toUpperCase()) || codePostal.length() != 5 )
			throw new AdresseException(rue, codePostal);
//		if(!rue.equals(rue.toUpperCase()))
//			throw new IncorrectStreetNameException(rue);
//		if(codePostal.length() != 5)
//			throw new IncorrectCodePostalException(codePostal);
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	

	public Adresse() {
		super();
	}
	

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) throws AdresseException {
		if(!rue.equals(rue.toUpperCase()))
			throw new AdresseException(rue, codePostal);
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) throws AdresseException {
		if(codePostal.length() != 5)
			throw new AdresseException(rue, codePostal);
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	
	
}
