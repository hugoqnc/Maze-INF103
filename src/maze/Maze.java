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
	private final String fileName;
	private ArrayList< ArrayList<Box> > maze ;
	private final int longeur;
	private final int largeur;
	private DBox depart;
	private ABox arrivee;
	
	public ArrayList<ArrayList<Box>> getMaze() {
		return maze;
	}
	

	public Maze(String fileName) { 
		this.fileName = fileName;
		maze = new ArrayList< ArrayList<Box> >();
		
		ArrayList<String> lecteur = lecteur(fileName); //voir la méthode lecteur
		longeur = lecteur.size();
		largeur = lecteur.get(0).length();

		int compteurD = 0; //compte le nombre de cases D dans le fichier txt
		int compteurA = 0; //compte le nombre de cases A dans le fichier txt
		
		//Vérification de la conformité du labyrinthe et attribution des cases
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
						throw new MazeReadingException(fileName, i+1, "There are several arrivals in the maze. It must have only one.");

					}
				
				}
				else if (designation.contentEquals("D")) {
					box = new DBox(i,j);
					depart = (DBox)box;
					compteurD++;
					if (compteurD > 1){

						throw new MazeReadingException(fileName, i+1, "There are several departures in the maze. It must have only one.");
					}
				}
				else {
						throw new MazeReadingException(fileName,i+1,"There is a character other than E,W,A,D in the text file."); //ligne de 1 a n, et non de 0 a n-1	

				}
				larg.add(box);
			}
			maze.add(larg);
		}
		if (compteurA == 0) {

			throw new MazeReadingException(fileName, 0, "There is no arrival in the maze.");
		}
		if (compteurD == 0) {
			throw new MazeReadingException(fileName, 0, "There is no departure in the maze.");

		}
		
		}
		catch(MazeReadingException mre){
			new ErrorWindow(mre.getTitle(), mre.getMessage());
			throw new RuntimeException("Message : Fin du programme. Il faut corriger l'erreur MazeReadingException."); //permet de stopper l'execution du programme
		}
		
		
		}
	

	
	public final int getLongeur() {
		return longeur;
	}
	
	public final int getLargeur() {
		return largeur;
	}
	

	public final ArrayList<VertexInterface> getAllVertices() {
		
		ArrayList<VertexInterface> allVertices = new ArrayList<VertexInterface>();
		for (int i = 0; i<longeur; i++) {
			for (int j = 0; j<largeur; j++) {
				allVertices.add(maze.get(i).get(j));
			}
		}
		return allVertices;
	}
	
	public final ArrayList<VertexInterface> getSuccessors(VertexInterface vertex){
		Box box = (Box)vertex;
		return emptyVoisin(box);
	}
	
	public final int getWeight(VertexInterface src,VertexInterface dst) {// à modifier pour un graphe pondere.
		Box boxSrc = (Box)src ;
		Box boxDst = (Box)dst ;
		return 1;
	}

	
	public final ArrayList<String> lecteur(String fileName) {
		//creation d'une liste de string a traiter
		ArrayList<String> lecteur = new ArrayList<String>();
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(fileName))) {
			String strFirstLine = bufferedreader.readLine().trim();
			int largeurLine1 = strFirstLine.length();
			if (largeurLine1 == 0) {
				throw new MazeReadingException(fileName,0,"This line is empty.");
			}
			lecteur.add(strFirstLine);
			
			String strCurrentLine;
			int lineNumber = 2; //on donne numerote les lignes de 1 a n, pas de 0 a n-1
			while ((strCurrentLine = bufferedreader.readLine()) != null) {//trim supprime espaces superflux eventuels en fin de texte
				strCurrentLine = strCurrentLine.trim();
				if (strCurrentLine.length() != largeurLine1) {

					throw new MazeReadingException(fileName,lineNumber,"This line has a different length from the others.");

				}
				lecteur.add(strCurrentLine);
				lineNumber ++;
			}
			
		}
		
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		catch (MazeReadingException mre) {
			new ErrorWindow(mre.getTitle(), mre.getMessage());
			throw new RuntimeException("Message : Fin du programme. Il faut corriger l'erreur MazeReadingException."); //permet de stopper l'execution du programme
		}
		
		return lecteur;
	}

	public final ArrayList<Box> voisin(Box box){//return la liste des voisins de box. Attention, quelque soit leur nature !
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
		
	public final ArrayList<VertexInterface> emptyVoisin(Box box){//return la liste des voisins libre (empty) de box
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
		   
	public final Box getDepart() {
		return depart;
	}
	
	public final Box getArrivee() {
		return arrivee;
	
	}
	
	public final void setBox(int coordinateI, int coordinateJ, Box box) {
		ArrayList<Box> ligneBox = maze.get(coordinateI);
		ligneBox.set(coordinateJ, box);
		maze.set(coordinateI, ligneBox);
	}
	

	public final Box getBox(int coordinateI, int coordinateJ) {
		return maze.get(coordinateI).get(coordinateJ);
	}
	
	public final ArrayList<VertexInterface> shortestPath(){
		PreviousInterface previous = Dijkstra.dijkstra(this, depart);
		ArrayList<VertexInterface> path = previous.getShortestPathTo(arrivee);
		try {
			if (path.contains(depart) == false) {

				throw new DijkstraResolveException("The submitted maze has no solution.");
			}
		}
		catch(DijkstraResolveException dre){
			new ErrorWindow(dre.getTitle(), dre.getMessage());
			
		}
		return path;
	}
	public final String getFileName() {
		return fileName;
	}
}
