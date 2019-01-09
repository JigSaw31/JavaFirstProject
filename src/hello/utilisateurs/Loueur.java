package hello.utilisateurs;

import java.util.ArrayList;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface {
	
	private ArrayList<Livre> books;
	
	public Loueur() {
		super();
		books = new ArrayList<Livre>();
	}
	
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += books.size();
		return message;
	}
	
	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + "\n";
		for (Livre livre : books) {
			message += livre.titre();
			
		}
		return message;
	}

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
//			if (books.contains(livre) == false) {
				books.add(livre);
//			}
			
		return this;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteurLoueur() {
		// TODO Auto-generated method stub
		return null;
	}

}
