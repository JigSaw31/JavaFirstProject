package hello.livre;

import hello.Utilisateur;

public class Livre {
	
	private String titre;
	private String resume;
	private int nbPages;
	
	private static final int MINIPAGE = 2;
	

	public String titre() {
		return this.titre;
	}
	
	public String resume() {
		return this.resume;
	}
	
	public int nbPages() {
		return this.nbPages;
	}
	
	public Livre titre(String titre) {
		this.titre = titre;
		return this;
	}
	
	public Livre resume(String resume) {
		this.resume = resume;
		return this;
	}
	
	public Livre nbPages(int nbPages) {
		if (nbPages >= MINIPAGE) {
			this.nbPages = nbPages;
		}
		else {
			System.out.println("Attention le nombre de pages est inférieur à la limite rentré - valeur par défaut attribuée");
			this.nbPages = MINIPAGE;
		}
		return this;
	}

}
