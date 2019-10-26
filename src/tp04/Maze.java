package tp04;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Maze 
	implements GraphInterface
	{
	private ArrayList<Box> maze ;
	private int longeur;
	private int largeur;

	public Maze(){//constructeur de la classe_A COMPLETER
		//BufferedReader reader = new BufferedReader(new FileReader("data/labyrinthe.txt"));
		maze = new ArrayList<Box>();
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
	      }
		
	}
		   
}
