package dijkstra;

import java.util.ArrayList;
import java.util.Hashtable;

public class Previous extends Hashtable<VertexInterface, VertexInterface> {
	
	public VertexInterface getValue(VertexInterface e) {
		
	}
	
	public void setValue(VertexInterface e, VertexInterface p);
	
	public ArrayList<VertexInterface> getShortestPathTo(VertexInterface e);

}
