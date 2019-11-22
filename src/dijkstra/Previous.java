package dijkstra;

import java.util.ArrayList;
import java.util.Hashtable;

public class Previous extends Hashtable<VertexInterface, VertexInterface> implements PreviousInterface{
	
	private Hashtable<VertexInterface, VertexInterface> previousTable;
	
	public Previous() {
		super();
		//previousTable = new Hashtable<VertexInterface,VertexInterface>();	
	}
	
	public VertexInterface getValue(VertexInterface e) {
		return previousTable.get(e);
		
	}
	
	public void setValue(VertexInterface e, VertexInterface p) { //attribue le pere p au sommet e
		previousTable.put(e,p);
	}
	
	public ArrayList<VertexInterface> getShortestPathTo(VertexInterface e){
		int stop = 0; //stop va arreter la boucle while lorsqu'on aura remonte tout le chemin
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>(); //va stocker le chemin de e (debut) jusqu'a la racine(fin)
		VertexInterface value = null;
		VertexInterface key = e;
		
		while (stop == 0) {
			path.add(key);
			value = getValue(key);
			if (value == null) {
				stop = 1;
			}
			key = value;			
		}
		return path;
	}

}
