package hello;

public class Cotisation {
	
	private static final int cotisation = 15;
	private static final int nbreLivreMax = 30;
	private static final double remise = 5;
	private static final double TVA = 20;
	
	private static final double prixJour = 0.05;
	
	
	public final double getPrixCotisation(int nbreLivres) {
		if (nbreLivres > nbreLivreMax) {
			return cotisation - (cotisation * (remise/100));
		}
		
		return cotisation;
	}

	public final double getPrixLocation (int nbreLivresLoue, int nbrJour) {
		
		return (nbrJour * prixJour) * nbreLivresLoue;
	}

}




