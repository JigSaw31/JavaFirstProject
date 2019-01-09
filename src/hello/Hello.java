package hello;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;

public class Hello {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Utilisateur moi = new Loueur();
		moi.setNom("Tartempion");
		moi.setPrenom("Jules");
		moi.setNumAdherent("5722001");
		System.out.println("Utilisateur : " + moi.getNom() + " " + moi.getPrenom() + "\n" + "Numéro adherent : " + moi.getNumAdherent());

		
		Utilisateur user = new Loueur("Dylan", "Bob", "5722002");
		System.out.println("Utilisateur : " + user.getNom() + " " + user.getPrenom() + "\n" + "Numéro adherent : " + user.getNumAdherent());

		Utilisateur alien = new Loueur();
		alien
			.nom("E.T")
			.prenom("Predator")
			.numAdherent("5722003");
		System.out.println("Utilisateur : " + alien.nom() + " " + alien.prenom() + "\n" + "Numéro adherent : " + alien.numAdherent());
		
		
		Livre unLivre = new Livre();
		unLivre
			.titre("Les misérables")
			.resume("Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.")
			.nbPages(50);
		System.out.println("Livre : " + unLivre.titre() + " resumé : " + unLivre.resume() + " nbPages : " + unLivre.nbPages());
		
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("2020-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo", "Victor", simpleDateFormat.parse("2020-09-09"));
		
		if (hugo == null) {
			System.out.println("Impossible d'instancier l'objet");
		} else {
			System.out.println("Auteur : " + hugo.nom() + hugo.dateNaissance());
		}
		
		System.out.println(alien.getPrixLocation(4, 20));
		
		
	}
	
	
	
	
}


