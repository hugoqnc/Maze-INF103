package dijkstra;

import java.util.ArrayList;

public interface PreviousInterface {
	
	public VertexInterface getValue(VertexInterface e); 
	
	public void setValue(VertexInterface e, VertexInterface p); //met p comme pere de e
	
	public ArrayList<VertexInterface> getShortestPathTo(VertexInterface e);

}
