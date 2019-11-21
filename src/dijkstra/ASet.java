package dijkstra;

import java.util.HashSet;

public class ASet extends HashSet<VertexInterface> {
	
	private HashSet<VertexInterface> ensembleA;
	
	public ASet() {
		ensembleA = new HashSet<VertexInterface>();
	}
	
	
	public void addVertex(VertexInterface e){
		ensembleA.add(e);
	}
	
	public boolean contains(VertexInterface e) {
		if (ensembleA.contains(e) == true) {
			return true;
		}
		return false;
	}

}
