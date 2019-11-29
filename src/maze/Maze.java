package maze;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import dijkstra.Dijkstra;
import dijkstra.GraphInterface;
import dijkstra.PreviousInterface;
import dijkstra.VertexInterface;

public class Maze 
	implements GraphInterface
	{
	private String fileName;
	private ArrayList< ArrayList<Box> > maze ;
	private int longeur;
	private int largeur;
	private DBox depart;
	private ABox arrivee;
	
	public ArrayList<ArrayList<Box>> getMaze() {
		return maze;
	}
	
	private static ArrayList<String> caractere(){//liste des caractères acceptes
		//trouver un endroit plus pertinent pour editer cette fonction et modifier constructeur de maze en consequence
		ArrayList<String> caractere = new ArrayList<String>();
		caractere.add("A");
		caractere.add("W");
		caractere.add("E");
		caractere.add("D");
		return caractere;}
	

	public Maze(String fileName){//constructeur de la classe_A COMPLETER
		//BufferedReader reader = new BufferedReader(new FileReader("data/labyrinthe.txt"));
		this.fileName = fileName;
		maze = new ArrayList< ArrayList<Box> >();
		
		ArrayList<String> lecteur = lecteur(fileName);
		int longeurTest = lecteur.size();
		int largeurTest = lecteur.get(0).length();
		// inutile : ArrayList<String> caractere = caractere();
		//il faut faire des exception ici
		
		//si lecteur est conforme :
		longeur = longeurTest;
		largeur = largeurTest;
		for (int i=0; i<longeur; i++) {
			ArrayList<Box> larg = new ArrayList<Box>();
			for(int j=0; j<largeur; j++) {
				char letter= lecteur.get(i).charAt(j);
				String designation = String.valueOf(letter);
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
					arrivee = (ABox)box;
				}
				else if (designation.contentEquals("D")) {
					box = new DBox(i,j);
					depart = (DBox)box;
				}
				larg.add(box);
			}
			maze.add(larg);
		
		}
		
		
		
		}
	

	
	public int getLongeur() {
		return longeur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
/*	public ArrayList<VertexInterface> getAllVertices() {//A corriger return list of the Vertex 
		ArrayList<VertexInterface> allVertices = new ArrayList<VertexInterface>();	
		Iterator<Box> iter = maze.iterator();
		while (iter.hasNext()) {
			Box box = (Box)iter.next() ;
			if (box.empty()) {
				allVertices.add(box);
			}}
		return(allVertices);
		}
*/
	public ArrayList<VertexInterface> getAllVertices() {
		longeur  = getLongeur();
		largeur = getLargeur();
		ArrayList<VertexInterface> allVertices = new ArrayList<VertexInterface>();
		for (int i = 0; i<longeur; i++) {
			for (int j = 0; j<largeur; j++) {
				allVertices.add(maze.get(i).get(j));
			}
		}
		return allVertices;
	}
	
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex){
		Box box = (Box)vertex;
		return emptyVoisin(box);
	}
	
	public int getWeight(VertexInterface src,VertexInterface dst) {// à modifier si graph pondéré.
		Box boxSrc = (Box)src ;
		Box boxDst = (Box)dst ;
		return 1;
	}
	
	private final void initFromTextFile() {//permet de lire ligne par ligne les fichiers txt de data
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

	public ArrayList<Box> voisin(Box box){//return la liste des voisins de box. Attention, quelque soit leur nature !
		int i = box.getCoordinateI();
		int j = box.getCoordinateJ();
		ArrayList<Box> voisins = new ArrayList<Box>();
		ArrayList<Integer> iList = new ArrayList<Integer>();
		if (i>0) iList.add(i-1);
		if (i<longeur-1) iList.add(i+1);
		ArrayList<Integer> jList = new ArrayList<Integer>();
		if (j>0) jList.add(j-1);
		if (j<longeur-1) jList.add(j+1);
		Iterator<Integer> iteri = iList.iterator();
		while (iteri.hasNext()) {
			voisins.add(maze.get(iteri.next()).get(j));
		}
			
		Iterator<Integer> iterj = jList.iterator();
		while (iterj.hasNext()) {
			voisins.add(maze.get(i).get(iterj.next()));
		}
		return (voisins);}
		
	public ArrayList<VertexInterface> emptyVoisin(Box box){//return la liste des voisins libre (empty) de box
		ArrayList<Box> voisins = voisin(box);
		ArrayList<VertexInterface> emptyVoisins = new ArrayList<VertexInterface>();
		Iterator<Box> iter = voisins.iterator();
		while (iter.hasNext()) {
			Box vois = iter.next();
			if (vois.empty()) {
				emptyVoisins.add(vois);
			}
		}
		return emptyVoisins;
	}
		   
	public Box getDepart() {
		return depart;
	}
	
	public Box getArrivee() {
		return arrivee;
	
	}
	
	public void setBox(int coordinateI, int coordinateJ, Box box) {
		ArrayList<Box> ligneBox = maze.get(coordinateI);
		ligneBox.set(coordinateJ, box);
		maze.set(coordinateI, ligneBox);
	}
}
