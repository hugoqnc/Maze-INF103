package tp04;

import java.util.ArrayList;

public interface GraphInterface {
	
	public boolean isInGraph(VertexInterface e); 
	public ArrayList<VertexInterface> returnGraph();
	public boolean isThereAWay(VertexInterface a, VertexInterface b);
	public int valuation(VertexInterface a, VertexInterface b);
	public ArrayList<VertexInterface> getSuccessors(VertexInterface e);
	

}
