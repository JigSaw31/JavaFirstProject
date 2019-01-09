package hello.utilisateurs;

import hello.livre.Livre;

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
		
		
		Livre lesMiserables = new Livre();
			lesMiserables.titre("Les misérables");
			lesMiserables.resume("Lorem ipsum jdhdugdygydgygygsdgd");
			lesMiserables.nbPages(250);
		((Loueur)loueur).addBook(lesMiserables);
		System.out.println(((Loueur)loueur).booksNumber());
		System.out.println(((Loueur)loueur).listBooks());
		
		
			
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
