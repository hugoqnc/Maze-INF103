package dijkstra;

public interface PiInterface {
	
	public int getValue(VertexInterface e);
	public void setValue(VertexInterface e, int v); //donne la valeur v à pi(e)
	public PiInterface nextPi(PiInterface p, VertexInterface y); // renvoie Pi(y) connaissant Pi(x)

}
