package dijkstra;

import java.util.ArrayList;

public interface GraphInterface {
	
	public ArrayList<VertexInterface> getAllVertices();
	public int getWeight(VertexInterface src, VertexInterface dst);
	public ArrayList<VertexInterface> getSuccessors(VertexInterface e);
	
}
