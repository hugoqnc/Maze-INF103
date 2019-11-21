package tp04;

import java.util.ArrayList;

public abstract class Box 
	implements VertexInterface
	{
	private int coordinateI;
	private int coordinateJ;
	
	public Box(int coordinateI, int coordinateJ) {//constructeur de Box
		this.coordinateI = coordinateI;
		this.coordinateJ= coordinateJ;}
	
	public int getCoordinateI() {
		return coordinateI;}
	
	public int getCoordinateJ() {
		return coordinateJ;}
	
	public String getLabel() {//renvoie identifiant de la box par "coordinateI,coordinateJ"
		return(String.valueOf(coordinateI) +","+ String.valueOf(coordinateJ));
	}
	
	public boolean empty() {
		return false;}
	
	public String status();	
	

	}
	


}
