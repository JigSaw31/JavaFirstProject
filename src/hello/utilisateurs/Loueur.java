package hello.utilisateurs;



import java.util.HashMap;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface {
	
	private HashMap<Livre, Integer> books;
	
	
	public Loueur() {
		
		books = new HashMap<Livre, Integer>();
	}
	
	
	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += books.size();
		return message;
	}
	
	public String listBooks() {
		String message = "Livres : " + "\n";
		for (java.util.Map.Entry<Livre, Integer> livre : books.entrySet()) {
			
			 message += livre.getKey().titre() + " nombre : " + livre.getValue() + "\n";
			
		}
		return message;
	}
	
	public int getCollectionsSize(boolean asStock) {
		
		GetSize size = (collection, getStock) -> {
			if(!getStock) {
				return collection.size();
			} else {
				int stock = 0;
				for(Livre livre : collection.keySet()) {
					stock += collection.get(livre);
				}
				return stock;
			}
		};
		
		return size.getSize(books, asStock);
	}
	
	

	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
		if (this.books.containsKey(livre)) {
			int value = books.get(livre);
			books.replace(livre, value + 1);
		}
		else {
			books.put(livre, 1);
		}
		
		return this;
	}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		if (books.containsKey(livre) && (books.get(livre) > 0)) {
			int value = books.get(livre);
			books.replace(livre, value - 1);
		}
		return this;
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
