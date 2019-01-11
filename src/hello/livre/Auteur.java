package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.BirthDateException;


public class Auteur {
	
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	private Auteur(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public static Auteur getAuteur(String nom, String prenom, Date dateNaissance) throws BirthDateException {
		Date today = new Date();
		if (dateNaissance.after(today)) {
			throw new BirthDateException();
		}
			Auteur auteur = new Auteur(nom, prenom, dateNaissance);
			return auteur;
	}
	
	public static Auteur getAuteur() throws ParseException, BirthDateException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nom de l'auteur : ");
		String nom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Prénom de l'auteur : ");
		String prenom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance : ");
		String naissance = scanner.nextLine();
		scanner.nextLine();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date dateNaissance = simpleDateFormat.parse(naissance);
		
		return getAuteur(nom, prenom, dateNaissance);
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
