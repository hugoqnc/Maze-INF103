package dijkstra;

import java.util.Hashtable;

public class Pi extends Hashtable<VertexInterface, Integer> implements PiInterface{

	
	private Hashtable<VertexInterface, Integer> piTable ;
	
	public Pi() {
		piTable = new Hashtable<VertexInterface, Integer>() ;
	}
	
	public int getValue(VertexInterface e) {
		return piTable.get(e).intValue();
	}
	
	public void setValue(VertexInterface e, int v) {
		System.out.println("test");
		piTable.put(e,v);
		
	}

}
