package tp04;

import java.util.ArrayList;

public abstract class Box 
	implements VertexInterface
	{
	private int coordinateI;
	private int coordinateJ;
	
	public Box(int coordinateI, int coordinateJ) {
		this.coordinateI = coordinateI;
		this.coordinateJ= coordinateJ;}
	
	public String getLabel() {
		return String.valueOf(coordinateI) + "," + String.valueOf(coordinateJ);
	}
	
	public boolean empty() {
		return false;}
	
	public ArrayList<Box> voisin(){//a definir
		if coordinate 
	}
	


}
