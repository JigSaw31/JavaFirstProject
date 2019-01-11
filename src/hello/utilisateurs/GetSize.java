package hello.utilisateurs;

import java.util.HashMap;

import hello.livre.Livre;

public interface GetSize {
	public int getSize(HashMap<Livre, Integer> livres, boolean getStock);
}
