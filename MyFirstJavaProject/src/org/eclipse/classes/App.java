package org.eclipse.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.eclipse.exceptions.AdresseException;
import org.eclipse.exceptions.IncorrectCodePostalException;
import org.eclipse.exceptions.IncorrectStreetNameException;
import org.eclipse.interfaces.impl.PersonDaoImpl;
import org.eclipse.models.Adresse;
import org.eclipse.models.Person;

public class App {

	// En java, chaque instruction se termine par un ; !!!
	// Il faut préciser obligatoirement le type de chaque variable
	// Une variable peut avoir des valeurs différentes mais ne pourra changer de
	// type

	// public indique que le main est accessible à partir d'autres classes
	// static permet d'invoquer la méthode sans instancier l'objet de la classe
	// void signifie une méthode qui n'attends pas de type de retour

	// String[] args => mécanisme pour que le système passe des informations à votre
	// application.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pour afficher un message, il faut utiliser la classe System
		// La classe System a deux objets pour l'entrée/sortie (in/out)
		// L'objet out a plusieurs méthodes d'affichage comme print() et println()
		System.out.print("Hello from the console ! \n\n");

		// type primitif int => type objet Integer
		int x = 5;
		System.out.println(x);

		// type objet Interger => Wrapper des types primitifs
		Integer w = 4;
		System.out.println(w);

		// Déclaration d'une variable de ype chaîne de caractère
		String mot = new String();
		mot = "Bonjour";
		System.out.println(mot);
		// ou
		String mot2 = new String("Bonjour 2");
		System.out.println(mot2);
		// ou encore
		String mot3 = "Bonjour 3";
		System.out.println(mot3);

		// types primitif vs Type objets
		// - les types primitifs sont moins couteux en memoire
		// - les types objets offrent plusieurs methodes à appliquer sur les valeurs

		String str = "Bonjour les bons jours";
		String str2 = str.replace("jour", "soir"); // remplace jour par soir
		System.out.println(str2);

		// indexOf() : Recherche une chaine pour la première occurence
		// qui prend en 1er param => une valeur String, represenatnt la chaine à
		// rechercher
		// 2eme param => une valeur int, représentant la position d'index à partir de
		// laquelle
		// démarrer la recherche
		int pos = str.indexOf("bon", 1);
		System.out.println(pos); // affiche 12

		// conversion
		Integer y = 2;
		String str3 = y.toString();
		System.out.println(str3); // affiche 2

		// concaténer
		String string = "bon";
		String string2 = "jour";
		System.out.println(string + string2);

		// Classe Scanner
		// - permet de lire une valeur saisie par l'utilisateur à récupérer
		System.out.println("---------------------------------Scanner-----------------------------");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Veuillez saisir un premier nombre, svp");
//		int nb1 = sc.nextInt();
//		System.out.println("Veuillez saisir un deuxième nombre, svp");
//		int nb2 = sc.nextInt();
//		
//		int res = nb1 + nb2; 
//		System.out.println("La somme de " + nb1 + " et de " + nb2 + " est : " + res );
//		System.out.printf("La somme de %d  et de %d vaut %d \n", nb1, nb2, res);
//		
//		int nbr_essais_max = 5;
//		int nbr_essais = 1;
//		int i = 0;
//		
//		while (i != 5 && nbr_essais <= nbr_essais_max ) {
//			
//			System.out.println("Veuillez trouver le bon nombre entre 0 et 10");
//			Scanner scanner = new Scanner(System.in);
//			i = scanner.nextInt();
//			if (i > 5) {
//				System.out.println("Plus petit");
//			}
//			else {
//				System.out.println("Plus grand");
//			}
//			nbr_essais += 1;
//		}
//		
//		if ((nbr_essais>nbr_essais_max) && (i != 5)) {
//			
//			System.out.printf("Désolé, vous avez utilisé vos 5 essais en vain.");
//			
//		} else {
//			
//			System.out.printf("Bravo \n");
//			
//		}
//		
//		 Scanner input = new Scanner(System.in);
//		  Random rnd = new Random();
//		  int mystere = rnd.nextInt(100) + 1;
//		  int nessais = 0;
//		  int njoueur = -1;
//		  while (njoueur != mystere)
//		  {
//		    System.out.print("Votre entier [1..100]? ");
//		    njoueur = input.nextInt();
//		    ++nessais;
//		    if (njoueur == mystere)
//		    {
//		      System.out.println("==> Gagne");
//		    }
//		    else if (njoueur < mystere)
//		    {
//		      System.out.println("==> Trop petit");
//		    }
//		    else
//		    {
//		      System.out.println("==> Trop grand");
//		    }
//		  }
//		  System.out.println("Trouve en " + nessais + " essai(s) \n");

		System.out.println("---------------------------------Exercices-----------------------------");
		// Écrivez un programme Java pour tester un nombre positif ou négatif.
//		  Scanner input1 = new Scanner(System.in);
//		  System.out.println("Veuillez saisir un nombre");
//		  float x1 = input1.nextInt();
//		  if(x1 < 0) {  System.out.println("Nombre saisi est négatif");}
//		  else if(x1 > 0){  System.out.println("Nombre saisi est positif");}
//		  else {  System.out.println("vous avez saisi 0 ");}

		// Demandez trois nombres de l'utilisateur et affichez le plus grand nombre.

//		  Scanner inputn1 = new Scanner(System.in);
//		  System.out.println("Veuillez saisir le 1er nombre");
//		  int n1 = input1.nextInt();
//		  
//		  Scanner inputn2 = new Scanner(System.in);
//		  System.out.println("Veuillez saisir le 2eme nombre");
//		  int n2 = inputn2.nextInt();
//		  
//		  Scanner inputn3 = new Scanner(System.in);
//		  System.out.println("Veuillez saisir le 3eme nombre");
//		  int n3 = inputn3.nextInt();
//		  
//		  if(n1 > n2 && n1 > n3) {  System.out.printf("%d est plus grand \n", n1);}
//		  else if(n2 > n3){  System.out.printf("%d est plus grand \n", n2);}
//		  else {  System.out.printf("%d est plus grand \n", n3);}

//		  (n1 > n2 && n1 > n3) ? System.out.printf("%d est plus grand \n", n1);
//		  : (n2 > n3)  System.out.printf("%d est plus grand \n", n2);
//		  :  System.out.printf("%d est plus grand \n", n3);

		System.out.println("---------------------------------Correction exercice------------------");

//		  
//		  String[] r = { "Positive", "Negative" };
//			// shift operator >> 
//			// L'opérateur de décalage droit signé ">>" décale un modèle de bits vers la droite.
//			System.out.println(r[(num >> 31) & 1]);  
//		    
//			Scanner in = new Scanner(System.in);
//			System.out.print("Input number: ");
//			int input = in.nextInt();
//			if (input > 0) {
//				System.out.println("Number is positive");
//			} else if (input < 0) {
//				System.out.println("Number is negative");
//			} else {
//				System.out.println("Number is zero");
//			}
//
//			System.out.print("Input the 1st number: ");
//			int num1 = in.nextInt();
//			System.out.print("Input the 2nd number: ");
//			int num2 = in.nextInt();
//			System.out.print("Input the 3rd number: ");
//			int num3 = in.nextInt();
//
//			if (num1 > num2)
//				if (num1 > num3)
//					System.out.println("The greatest: " + num1);
//			if (num2 > num1)
//				if (num2 > num3)
//					System.out.println("The greatest: " + num2);
//			if (num3 > num1)
//				if (num3 > num2)
//					System.out.println("The greatest: " + num3);
//			
//			int result = Math.max(Math.max(num1,num2),num3);
//			
//			System.out.print(result);

		// Ecire un code Java qui permet d'afficher les nombres pairs compris entre 0 et
		// 10

//		  for (int i=0; i<=10; i++) {
//			  if (i % 2 == 0) {
//				  System.out.println(i + " est paire"); 
//			  }
//		  }

		System.out.println("-------------------------------POO----------------");

		// Crée une instance de clase Person
		// ou crée un objet de ype Person
		Person person = new Person();
//		  person.num = 1;
//		  person.nom = "Wick";
//		  person.prenom = "John";
//		  System.out.println(person); 

		person.setNum(1);
		person.setNom("Wick");
		person.setPrenom("John");
		System.out.println(person);

		// méthode toString
		System.out.println(person.getNum() + " " + person.getNom() + " " + person.getPrenom());

		// après avoir décalré le constructeur
		Person p2 = new Person(2, "Wick", "John");

		System.out.println(p2);

//		  Person[] personTab = new Person[2];
//		  personTab[0] = new Person(2, "Wick", "John");
//		  Person p3 = new Person(4, "Wayne", "John");
//		  personTab[1] = p3; 
//		  
//			for(Person i : personTab){
//				System.out.println(i);
//			}

		System.out.println("-----------------------ARRAY-------------------------------------------");

		Person[] personTab = new Person[2];
		personTab[0] = new Person(3, "Ford", "John");
		Person p3 = new Person(4, "Wayne", "John");
		personTab[1] = p3;

		for (Person i : personTab) {
			System.out.println("Tableau : " + i);
		}

		System.out.println("-----------------------LISTE-------------------------------------------");

		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(p2);
		persons.add(p3);

		for (Person i : persons) {
			System.out.println("en liste : " + i);
		}

		System.out.println("-----------------------LISTE-------------------------------------------");

		persons.forEach(p -> System.out.println(p));

//		  for (Person i : persons) {
//				  System.out.println(i); 
//		  }
//		  
//		  persons.forEach(p -> System.out.println(p));

		// Definir une classe Adresse avec trois attributs prives (rue,
		// codePostal et ville de type chaıne de caractere
		// Definir un constructeur avec trois parametres, les getters, les
		// setters et la methode toString()
		// Dans la classe Personne, ajouter un attribut adresse de type
		// Adresse et definir un nouveau constructeur a quatre parametres
		// et le getter et le setter de ce nouvel attribut
		// Dans la classe Main, creer deux objets, un objet de type
		// Adresse et un de type Personne et lui attribuer l’adresse creee
		// precedemment
		// Afficher tous les attributs de cet objet de la classe Personne

		// Adresse adresse = new Adresse();
		// adresse.setRue("1 rue de paris");
		// adresse.setCodePostal("75000");
		// adresse.setVille("Paris");
		// System.out.println(adresse);

//		  Person p5 = new Person(5, "Travolta", "John",
//				  	  new Adresse("Rue Rivoli", "75001", "Paris"));
//		  
//		  Adresse a1 = new Adresse("rue rivoli", "75001", "Paris");
		// Person p6 = new Person(6, "Cena", "John", a1);
		// System.out.println(p5);
		// System.out.println(p6);

		System.out.println("-----------------------Les méthodes-------------------------------------------");

		System.out.println("Le prix TTC est de : " + totalTTC(149.6f, 20f)); // f pour float

//		  Scanner scan = new Scanner(System.in);
//		  System.out.print("Entrer un nombre : ");
//		  int s1 = scan.nextInt();
//		  System.out.println(saison(s1)); 

// Créer un programme qui demande un entier à l’utilisateur puis qui affiche dans quelle saison on se trouve pour la valeur rentrée.

		int choix = 0;
		// conditionSeason(choix);

		System.out.println("-----------------------EXCEPTIONS-------------------------------------------");

//			Une exception, c’est quoi ?

//			C’est une erreur qui se produit pendant l’execution de notre
//			programme
//			Une exception dans un programme implique generalement son
//			arret d’execution

//			Comment faire pour poursuivre l’execution?

//			Reperer les blocs pouvant generer une exception
//			Capturer l’exception correspondante
//			Afficher un message relatif a cette exception
//			Continuer l’execution

		int x1 = 5, y1 = 2;
		// System.out.println(x1/y1);
		// System.out.println("Fin de calcul"); // le message fin de calcul n'a pas ete
		// affichée

//			Comment faire pour capturer une exception?
//			Utiliser un bloc try{} catch {}
//			Le try{} pour entourer une instruction susceptible de
//			d´eclencher une exception
//			Le catch {} pour capturer l’exception et afficher un
//			message qui lui correspond
		try {
			System.out.println("Résultat de la division" + x1 / y1);

		} catch (ArithmeticException e) {
			// if(y1 == 0) { System.out.println("Division par zéro interdite"); }
			// System.out.println("Division par zéro interdite");
			// System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Fin de calcul");

		// supposons que le codePostal doit contenir exactement 5 chiffres
//			  Adresse a5, a6 = null;
//			  try {
//					a5 = new Adresse("2 Rue Paris", "7500", "Paris");
//					
//			  }
//			  catch(IncorrectCodePostalException e1) {
//				  //System.out.println("Exception : " + e.getMessage());
//				  e1.printStackTrace();
//			  }
//			  catch(IncorrectStreetNameException e2) {
//				  //System.out.println("Exception : " + e.getMessage());
//				  e2.printStackTrace();
//			  }
//			  System.out.println("Fin insertion adresse a5");
//			  
//			  
//			  // Et le rue doit être une chaine en majuscule
//			  
//			  try {
//					a6 = new Adresse("rue", "75000", "Paris");
//					
//			  }
//			  catch(IncorrectCodePostalException | IncorrectStreetNameException e) {
//				  //System.out.println("Exception : " + e.getMessage());
//				  e.printStackTrace();
//			  }
//			  finally { System.out.println("Fin insertion adresse a6"); }

		// Creer une nouvelle classe d’exception AdresseException pour
		// fusionner et remplacer les deux exceptions
		// IncorrectCodePostalException et
		// IncorrectStreetNameException
		Adresse a7 = null;
		try {
			a7 = new Adresse("rue", "7500", "Paris");

		} catch (AdresseException e) {
			// System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Fin insertion adresse a7");
		}

		// Appel de la classe PersonneDao implement l'interface IDao<> pour avoir acces
		// au données (DAO => Data ACCESS OBJECT)
		PersonDaoImpl personDaoImpl = new PersonDaoImpl();
		System.out.println("----------------------Save-------------------------------");
		Person p = new Person(12, "Jessy", "Dee");

		Person savePerson = personDaoImpl.save(p);

		if (savePerson != null) {
			JOptionPane.showMessageDialog(null, "person insérée" + savePerson, "SUCCESS", JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "problème avec insertPersonne" + savePerson, "Problème rencontré",
					JOptionPane.ERROR_MESSAGE);
		}

		System.out.println("---------------------------------GETALL-------------------------------------");

		List<Person> personnes = personDaoImpl.getAll();
		personnes.forEach(pers -> System.out.println(pers));

		System.out.println("---------------------------------Delete-------------------------------------");

		boolean removePerson = personDaoImpl.remove(31);

		if (removePerson) {
			JOptionPane.showMessageDialog(null, "personne supprimée avec succès " + removePerson, " SUCCESS",
					JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "problème avec delete personne " + removePerson, " Problème rencontré ",
					JOptionPane.ERROR_MESSAGE);
		}
		System.out.println("---------------------------------FindById-------------------------------------");
		Person personne = personDaoImpl.findById(33);
		if (personne != null) {
			JOptionPane.showMessageDialog(null, "Personne trouvée avec succès " + personne, " SUCCESS",
					JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "Personne enexistante dans la base de données " + personne,
					" Problème rencontré", JOptionPane.ERROR_MESSAGE);
		}
		
		System.out.println("-----------------------------------Update-------------------------------");
		  Person per = new Person(19, "Jessi", "Dea");
		  
		  Person updatePerson = personDaoImpl.update(per);
		  
		  if(updatePerson != null) {
			  JOptionPane.showMessageDialog(null, "person a bien été mise à jour " + updatePerson, " SUCCESS", JOptionPane.OK_OPTION);
		  }
		  else {
			  JOptionPane.showMessageDialog(null, "problème avec updatePersonne " + updatePerson, " Problème rencontré ",
                      JOptionPane.ERROR_MESSAGE);
		  }	  
	}

	public static float totalTTC(float somme, float pourcentage) {
		float total = somme + (somme * (pourcentage / 100));
		return total;
	}

	public static String saison(int s) {
		String votreSaison = "";

		if (s >= 1 && s <= 3) {
			votreSaison = "Vous êtes en hiver";
		} else if (s >= 4 && s <= 6) {
			votreSaison = "Vous êtes en pintemps";
		} else if (s >= 7 && s <= 9) {
			votreSaison = "Vous êtes en été";
		} else if (s >= 10 && s <= 12) {
			votreSaison = "Vous êtes en automne";
		} else {
			votreSaison = "Vous êtes en rien du tout";
		}
		return votreSaison;
	}

//	Créer un programme qui demande un entier à l’utilisateur puis qui affiche dans quelle saison on se trouve pour la valeur rentrée.

	public static int lireValiderEntier(int debut, int fin) {
		int choix;
		boolean valeur = false;
		Scanner clavier = new Scanner(System.in);
		do {
			System.out.print("\n\n\tEntrez le nombre :");
			choix = clavier.nextInt();
			if (choix >= 0 && choix <= 12)
				valeur = true;
			else {
				System.out.print("\n\n\tRefaire le choix :");
				valeur = false;
			}
		} while (!valeur);
		return choix;
	}

	public static void conditionSeason(int choix) {
		do {
			afficherMenu();
			choix = lireValiderEntier(1, 12);
			if (choix >= 1 & choix <= 3) {
				System.out.println("\n\n\tNous sommes en Hiver");
			} else if (choix >= 4 & choix <= 6) {
				System.out.println("\n\n\tNous sommes en Printemps");
			} else if (choix >= 7 & choix <= 9) {
				System.out.println("\n\n\tNous sommes en Ete");
			} else if (choix >= 10 & choix <= 12) {
				System.out.println("\n\n\tNous sommes en Automne");
			} else {
				System.out.println("\n\n\tCIAO!");
			}
		} while (choix != 0);
	}

	public static void afficherMenu() {
		System.out.println("\n\n\n\t\tMENU PRINCIPAL\n");
		System.out.println("\t1. Preciser un entier selon un mois de l'année\n");
		System.out.println("\t0. Quitter\n");
		System.out.print("\tFaites votre choix : ");
	}

}
