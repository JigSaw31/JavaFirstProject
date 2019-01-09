package hello.utilisateurs;

abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	public Utilisateur nom(String nom) {
		this.nom = nom;
		return this;
	}
	
	public Utilisateur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
		return this;
	}

	public String nom() {
		return nom;
	}

	public String prenom() {
		return prenom;
	}

	public String numAdherent() {
		return numAdherent;
	}
	
}
