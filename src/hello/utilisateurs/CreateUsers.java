package hello.utilisateurs;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthDateException;
import hello.tools.AuthorImport;

public class CreateUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilisateur loueur = createLoueur();
		Utilisateur emprunteur = createEmprunteur();
		Utilisateur emprunteurLoueur = createEmprunteurLoueur();
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom() + " est un loueur");
		}
		
		if (emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom() + " est un loueur");
		} else {
			System.out.println(emprunteur.nom() + " n'est pas un loueur");
		}
		
		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom() + " est un emprunteur et un loueur");
		}
		
		Livre unlivre = new Livre();
		unlivre.titre("Les topo");
		unlivre.resume("Lorem ipsum jdhdugdygydgygygsdgd");
		unlivre.nbPages(250);
		((Loueur)loueur).addBook(unlivre);
		((Loueur)loueur).addBook(unlivre);
		
		Livre lesMiserables = new Livre();
			lesMiserables.titre("Les misérables");
			lesMiserables.resume("Lorem ipsum jdhdugdygydgygygsdgd");
			lesMiserables.nbPages(250);
		((Loueur)loueur).addBook(lesMiserables);
		((Loueur)loueur).addBook(lesMiserables);
		((Loueur)loueur).addBook(lesMiserables);
		System.out.println(((Loueur)loueur).booksNumber());
		System.out.println(((Loueur)loueur).listBooks());
		
//		Auteur asimov;
//		try {
//			asimov = Auteur.getAuteur();
//			System.out.println(asimov.nom() + asimov.prenom() + asimov.dateNaissance());
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("La date de naissance est incorrect");
//			System.out.println(e.getMessage());
//		} catch (BirthDateException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}

		
		try {
			AuthorImport authorImport = new AuthorImport();
			ArrayList<String[]> listAuteurs = authorImport.getAuteurs();
			ArrayList<Auteur> listDesAuteurs = new ArrayList<Auteur>();
			for (String[] auteur : listAuteurs) {
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				Date dateNaissance = simpleDateFormat.parse(auteur[2]);
				Auteur lolAuteur = Auteur.getAuteur(auteur[0], auteur[1], dateNaissance);
				listDesAuteurs.add(lolAuteur);
				
			}
			System.out.println(listDesAuteurs.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BirthDateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
	}
	
	private static Utilisateur createLoueur() {
		return new Loueur()
				.nom("Aubert")
				.prenom("Jean-Luc")
				.numAdherent("000111555");
	}
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Man")
				.prenom("Iron")
				.numAdherent("000222667");
	}
	
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Dylan")
				.prenom("Bob")
				.numAdherent("000333779");
	}
	
	

}
