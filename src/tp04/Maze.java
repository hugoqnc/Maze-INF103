package tp04;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Maze 
	implements GraphInterface
	{
	private ArrayList<Box> maze ;
	private int longeur;
	private int largeur;
	private DBox depart;
	private ABox arrive;
	
	
	
	private ArrayList<String> caractere(){//liste des caractères acceptes
		//trouver un endroit plus pertinent pour editer cette fonction et modifier constructeur de maze en consequence
		ArrayList<String> caractere = new ArrayList<String>();
		caractere.add("A");
		caractere.add("W");
		caractere.add("E");
		caractere.add("D");
		return caractere;}
	

	public Maze(String fileName){//constructeur de la classe_A COMPLETER
		//BufferedReader reader = new BufferedReader(new FileReader("data/labyrinthe.txt"));
		maze = new ArrayList<Box>();
		
		ArrayList<String> lecteur = lecteur(fileName);
		int longeurTest = lecteur.size();
		int largeurTest = lecteur.get(0).length();
		ArrayList<String> caractere = caractere();
		//il faut faire des exception ici
		
		//si lecteur est conforme :
		longeur = longeurTest;
		largeur = largeurTest;
		for (int i=0; i<longeur; i++) {			
			for(int j=0; j<largeur; j++) {
				String designation= lecteur.get(i).substring(j);
				//ATTENTION : CECI N'EST PAS TROP TROP ORIENTE OBJET :
				Box box = null;
				if (designation.contentEquals("E")){
					box = new EBox(i,j);
				}
				else if (designation.contentEquals("W")) {
					box = new WBox(i,j);
				}
				else if (designation.contentEquals("A")) {
					box = new ABox(i,j);
					arrive = (ABox)box;
				}

				else if (designation.contentEquals("D")) {
					box = new DBox(i,j);
					depart = (DBox)box;
				}
				maze.add(box);
			}
			
		
		}
		
		
		
		}
	

	
	public int getLongeur() {
		return longeur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public ArrayList<VertexInterface> getAllVertices() {//return list of the Vertex 
		ArrayList<VertexInterface> allVertices = new ArrayList<VertexInterface>();	
		Iterator<Box> iter = maze.iterator();
		while (iter.hasNext()) {
			Box box = (Box)iter.next() ;
			if (box.empty()) {
				allVertices.add(box);
			}}
		return(allVertices);
		}
	
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex){//a completer
		Box box = (Box)vertex ;

	}
	
	public int getWeight(VertexInterface src,VertexInterface dst) {// a completer
		Box boxSrc = (Box)src ;
		Box boxDst = (Box)dst ;
	}
	
	public final void initFromTextFile(String fileName) {//permet de lire ligne par ligne les fichiers txt de data
	    // https://waytolearnx.com/2018/11/comment-lire-un-fichier-en-java-avec-bufferedreader.html
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(fileName))) {
	        String strCurrentLine;
	        while ((strCurrentLine = bufferedreader.readLine()) != null) {
	          System.out.println(strCurrentLine);
	        }
	      } catch (IOException ioe) {
	        ioe.printStackTrace();
	      }	}
	
	private final ArrayList<String> lecteur(String fileName) {
		//creation d'une liste de string a traiter
		ArrayList<String> lecteur = new ArrayList<String>();
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(fileName))) {
			String strCurrentLine;
			while ((strCurrentLine = bufferedreader.readLine()) != null) {
				lecteur.add(strCurrentLine.trim());//trim supprime espaces superflux eventuels en fin de texte
			}
		}catch (IOException ioe) {
		ioe.printStackTrace();
		}
		return lecteur;
	}
		
		   
}
