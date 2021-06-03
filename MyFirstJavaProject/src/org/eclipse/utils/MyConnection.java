package org.eclipse.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MyConnection {
	
	private static String ADRESSE = "jdbc:mysql://localhost:3306/formation_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private static String USER = "root";
	private static String PASSWORD = "root";
	private static Connection CONN;
	
	public static Connection getConnection() { 
		try {
			CONN = DriverManager.getConnection(ADRESSE, USER, PASSWORD);
			return CONN;
			
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Connexion à la BDD impossible");
		}
		return null;
	}

}
