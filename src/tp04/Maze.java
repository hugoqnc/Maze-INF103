import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


public class Maze 
	implements GraphInterface
	{
	private ArrayList<Box> maze ;
	private int longeur;
	private int largeur;

	public Maze(){//constructeur de la classe
		BufferedReader reader = new BufferedReader(new FileReader("data/labyrinthe.txt"));
		maze = new ArrayList<Box>();
		this.longeur = longeur;
		this.largeur = largeur;
		}
	
	public int getLongeur() {
		return longeur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public ArrayList<VertexInterface> getAllVertices() {//return list of the Vertex that are empty
		allVertices = new ArrayList<VertexInterface>();	
		Iterator<VertexInterface> iter = maze.iterator();
		while (iter.hasNext()) {
			if (iter.next().empty()) {
				allVertices.add(iter.next());}
		return(allVertices);}}
	
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex){
		EBox box = (EBox)vertex ;

	}
	
	public int getWeight(VertexInterface src,VertexInterface dst) {
		EBox boxSrc = (EBox)src ;
		EBox boxDst = (EBox)dst ;
	}
	
	public final void initFromTextFile(String fileName) {//A FAIRE : GERER LES EXCEPTIONS
		BufferedReader reader = new BufferedReader(fileName);
		while ((strCurrentLine = bufferedreader.readLine()) != null) {
		    System.out.println(strCurrentLine);
		}
		
	}
		   
}
