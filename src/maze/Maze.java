package maze;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import dijkstra.Dijkstra;
import dijkstra.DijkstraResolveException;
import dijkstra.GraphInterface;
import dijkstra.PreviousInterface;
import dijkstra.VertexInterface;
import ihm.ErrorWindow;

public class Maze implements GraphInterface
	
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
	

	public Maze(String fileName) { 
		//BufferedReader reader = new BufferedReader(new FileReader("data/labyrinthe.txt"));
		this.fileName = fileName;
		maze = new ArrayList< ArrayList<Box> >();
		
		ArrayList<String> lecteur = lecteur(fileName);
		longeur = lecteur.size();
		largeur = lecteur.get(0).length();

		int compteurD = 0; //compte le nombre de cases D dans le fichier txt
		int compteurA = 0; //compte le nombre de cases A dans le fichier txt
		
		try {
		for (int i=0; i<longeur; i++) {
			ArrayList<Box> larg = new ArrayList<Box>();
			for(int j=0; j<largeur; j++) {
				char letter= lecteur.get(i).charAt(j);
				String designation = String.valueOf(letter);
				
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
					compteurA++;
					if (compteurA > 1){
						throw new MazeReadingException(fileName, i+1, "Le labyrinthe a plusieurs arriv�es. Elle doit �tre unique.");

					}
				
				}
				else if (designation.contentEquals("D")) {
					box = new DBox(i,j);
					depart = (DBox)box;
					compteurD++;
					if (compteurD > 1){

						throw new MazeReadingException(fileName, i+1, "Le labyrinthe a plusieurs d�parts. Il doit �tre unique.");
					}
				}
				else {
						throw new MazeReadingException(fileName,i+1,"Il y a un caract�re autre que E,W,A,D dans le fichier texte."); //ligne de 1 � n, et non de 0 � n-1	

				}
				larg.add(box);
			}
			maze.add(larg);
		}
		if (compteurA == 0) {

			throw new MazeReadingException(fileName, 0, "Il n'y a pas d'arriv�e dans le labyrinthe.");
		}
		if (compteurD == 0) {
			throw new MazeReadingException(fileName, 0, "Il n'y a pas de d�part dans le labyrinthe.");

		}
		
		}
		catch(MazeReadingException mre){
			mre.printStackTrace();
			new ErrorWindow(mre.getTitle(), mre.getMessage());
			throw new RuntimeException("Message : Fin du programme. Il faut corriger l'erreur MazeReadingException."); //permet de stopper l'execution du programme
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
	
	/* private final void initFromTextFile() {//permet de lire ligne par ligne les fichiers txt de data
	    // https://waytolearnx.com/2018/11/comment-lire-un-fichier-en-java-avec-bufferedreader.html
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(fileName))) {
	        String strCurrentLine;
	        while ((strCurrentLine = bufferedreader.readLine()) != null) {
	          System.out.println(strCurrentLine);
	        }
	      } catch (IOException ioe) {
	        ioe.printStackTrace();
	      }	}
	*/
	
	public ArrayList<String> lecteur(String fileName) {
		//creation d'une liste de string a traiter
		ArrayList<String> lecteur = new ArrayList<String>();
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(fileName))) {
			String strFirstLine = bufferedreader.readLine().trim();
			int largeurLine1 = strFirstLine.length();
			if (largeurLine1 == 0) {
				throw new MazeReadingException(fileName,0,"Cette ligne est vide.");
			}
			lecteur.add(strFirstLine);
			
			String strCurrentLine;
			int lineNumber = 2; //on donne numerote les lignes de 1 � n, pas de 0 � n-1
			while ((strCurrentLine = bufferedreader.readLine()) != null) {//trim supprime espaces superflux eventuels en fin de texte
				strCurrentLine = strCurrentLine.trim();
				if (strCurrentLine.length() != largeurLine1) {

					throw new MazeReadingException(fileName,lineNumber,"Cette ligne n'a pas la m�me longeur que les autres.");

				}
				lecteur.add(strCurrentLine);
				lineNumber ++;
			}
			
		}
		
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		catch (MazeReadingException mre) {
			mre.printStackTrace();
			new ErrorWindow(mre.getTitle(), mre.getMessage());
			throw new RuntimeException("Message : Fin du programme. Il faut corriger l'erreur MazeReadingException."); //permet de stopper l'execution du programme
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
		if (j<largeur-1) jList.add(j+1);
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
	

	public Box getBox(int coordinateI, int coordinateJ) {
		return maze.get(coordinateI).get(coordinateJ);
	}
	
	public ArrayList<VertexInterface> shortestPath(){
		PreviousInterface previous = Dijkstra.dijkstra(this, (VertexInterface)depart);
		ArrayList<VertexInterface> path = previous.getShortestPathTo(arrivee);
		try {
			if (path.contains(depart) == false) {

				throw new DijkstraResolveException("Le labyrinthe donn� n'a pas de solution.");
			}
		}
		catch(DijkstraResolveException dre){
			dre.printStackTrace();
			new ErrorWindow(dre.getTitle(), dre.getMessage());
			throw new RuntimeException("Message : Fin du programme. Il faut corriger l'erreur DijkstraResolveException."); //permet de stopper l'execution du programme
			
		}
		return path;
	}
}
