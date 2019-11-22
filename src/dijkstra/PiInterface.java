package dijkstra;

public interface PiInterface {
	
	public int getValue(VertexInterface e);
	public void setValue(VertexInterface e, int v); //donne la valeur v a  pi(e)
	//inutile :public PiInterface nextPi(PiInterface p, VertexInterface y); // renvoie Pi(y) connaissant Pi(x)

}
