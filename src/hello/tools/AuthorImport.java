package hello.tools;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class AuthorImport {
	
	private File auteurFile;
	private static final String FIELD_SEPARATOR = ";";
	private ArrayList<String[]> auteurs;
	
	
	public ArrayList<String[]> getAuteurs() {
		return auteurs;
	}

	public AuthorImport() throws FileNotFoundException{
		auteurs = new ArrayList<String[]>();
		this.auteurFile = new File("C:\\users\\dell\\desktop\\lol.txt");
		if (this.auteurFile.exists()) {
			if (auteurFile.canRead()) {
				this.process();
			} else {
				System.out.println("Le fichier n'est pas lisible");
			}
		}
		else {
			System.out.println("Le fichier n'a pas été trouvé");
		}
	}

	private void process(){
		// TODO Auto-generated method stub
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(auteurFile);
			int rowCount = 0;
			while(fileScanner.hasNext()) {
				String row = fileScanner.nextLine();
				if (rowCount > 0) {
					String[] cols = row.split(FIELD_SEPARATOR);
					auteurs.add(cols);
					
				}
				rowCount++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
