package dijkstra;

public interface PreviousInterface {
	
	public VertexInterface getPrevious(VertexInterface e); 
	public void setPrevious(VertexInterface e, VertexInterface p); //set p comme pere de e
	

}
