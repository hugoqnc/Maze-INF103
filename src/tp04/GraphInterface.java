package tp04;

import java.util.ArrayList;

public interface GraphInterface {
	
	// inutile : public boolean isInGraph(VertexInterface e); 
	public ArrayList<VertexInterface> getAllVertices();
	// inutile : public boolean isThereAWay(VertexInterface a, VertexInterface b); //utilisee ?
	public int getWeight(VertexInterface src, VertexInterface dst);
	public ArrayList<VertexInterface> getSuccessors(VertexInterface e);
	

}
