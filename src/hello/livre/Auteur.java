package hello.livre;

import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

import hello.Utilisateur;

public class Auteur {
	
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	private Auteur(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public static Auteur getAuteur(String nom, String prenom, Date dateNaissance) {
		Date today = new Date();
		if (dateNaissance.after(today)) {
			return null;
		}
			Auteur auteur = new Auteur(nom, prenom, dateNaissance);
			return auteur;
	}

	public String nom() {
		return this.nom;
	}
	
	public String prenom() {
		return this.prenom;
	}
	
	public Date dateNaissance() {
		return this.dateNaissance;
	}
	
	public Auteur nom(String nom) {
		this.nom = nom;
		return this;
	}
	
	public Auteur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	
	public Auteur dateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
		return this;
	}

}
