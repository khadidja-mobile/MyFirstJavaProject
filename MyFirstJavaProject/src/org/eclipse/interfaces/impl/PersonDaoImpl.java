package org.eclipse.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.interfaces.IDao;
import org.eclipse.models.Person;
import org.eclipse.utils.MyConnection;

public class PersonDaoImpl implements IDao<Person> {

	private ArrayList listPersonne;
	private Person personne;

	// JDBC => Java DataBase Connectivity
	// API => Acc�s aux bd Java

	// Importer le Mysql driven .jar dans le buildpath

	@Override
	public Person save(Person personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				// PreparedStatement est utilis� pour ex�cuter des requ�tes sp�cifiques qui sont
				// cens�es s'ex�cuter de mani�re r�p�t�e
				// Cette requ�te peut �tre ex�cut�e plusieurs fois pour r�cup�rer les d�tails de
				// diff�rents personnes.

				// En utilisant PreparedStatement comme ci-dessous, la base de donn�es aide � la
				// pr�paration des requ�tes,
				// ce qui est plus rapide et plus s�curis�.

				PreparedStatement pst = c.prepareStatement("INSERT INTO person(nom, prenom) VALUES (?, ?)");
				// pst.setInt(1, person.getNum());
				pst.setString(1, personne.getNom());
				pst.setString(2, personne.getPrenom());

				// Envoie le PreparedStatement
				pst.executeUpdate();
				pst.close();

				return personne;

			} catch (SQLException ex) {

				JOptionPane.showMessageDialog(null, "probl�me avec save() " + ex.getMessage(), " Probl�me rencontr�",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

	@Override
	public boolean remove(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {

				PreparedStatement pst = c.prepareStatement("DELETE FROM person WHERE id = " + id);

				pst.executeUpdate();
				pst.close();

				return true;

			} catch (SQLException ex) {

				JOptionPane.showMessageDialog(null, "probl�me avec delete() " + ex.getMessage(), " Probl�me rencontr�",
						JOptionPane.ERROR_MESSAGE);
			}
		}

		return false;
	}

	@Override
	public Person update(Person personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {

				PreparedStatement pst = c.prepareStatement("UPDATE person SET nom = ?, prenom = ? WHERE id = ?;");
								
				//String nom = personne.getNom();
				//String prenom = personne.getPrenom();
				//int id = personne.getNum();
				
				// loop for read the content of the answer from BDD
				pst.setString(1, personne.getNom());
				pst.setString(2, personne.getPrenom());
				pst.setInt(3, personne.getNum());

				
				//this.save(personne);
				
				//int num = rs.getInt("id");
				// this.personne.setNum(id);
				//this.personne.setNom(nom);
				//this.personne.setPrenom(prenom);
				// Envoie le PreparedStatement
				pst.executeUpdate();
				pst.close();

				return personne;

			} catch (SQLException ex) {

				JOptionPane.showMessageDialog(null, "probl�me avec update() " + ex.getMessage(), " Probl�me rencontr�",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

	@Override
	public Person findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {

				PreparedStatement pst = c.prepareStatement("SELECT * FROM person WHERE id = " + id);
				ResultSet rs = pst.executeQuery();
				this.personne = new Person();
				if (rs.next()) { // loop for read the content of the answer from BDD
					int num = rs.getInt("id");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					this.personne.setNum(num);
					this.personne.setNom(nom);
					this.personne.setPrenom(prenom);
					return personne;
				}

			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "probl�me avec findById() " + ex.getMessage(),
						" Probl�me rencontr�", JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

	@Override
	public List<Person> getAll() {
		Connection c = MyConnection.getConnection();
		if (c != null) { // test if connection to BDD is not null
			try { // try/catch to BDD
				PreparedStatement pst = c.prepareStatement("SELECT * FROM person");
				ResultSet rs = pst.executeQuery();
				this.listPersonne = new ArrayList<>();
				while (rs.next()) { // loop for read the content of the answer from BDD
					int num = rs.getInt("id");
					String nom = rs.getString("nom");
					String prenom = rs.getString("prenom");
					this.listPersonne.add(new Person(num, nom, prenom));
				}
				return listPersonne;
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "probl�me avec recupAllEditor() " + ex.getMessage(),
						" Probl�me rencontr�", JOptionPane.ERROR_MESSAGE);
			}
		}
		return null;
	}

}
