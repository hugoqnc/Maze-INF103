package maze;

import java.awt.Color;


import dijkstra.VertexInterface;

public abstract class Box 
	implements VertexInterface
	{
	private final int coordinateI;
	private final int coordinateJ;

	
	public Box(int coordinateI, int coordinateJ) {//constructeur de Box
		this.coordinateI = coordinateI;
		this.coordinateJ= coordinateJ;}
	
	public final int getCoordinateI() {
		return coordinateI;}
	
	public final int getCoordinateJ() {
		return coordinateJ;}
	
	public abstract Color getColor() ;
	
	public final String getLabel() {//renvoie identifiant de la box par "coordinateI,coordinateJ"
		return(String.valueOf(coordinateI) +","+ String.valueOf(coordinateJ));
	}
	
	public boolean empty() {
		return false;}
	
	public abstract String status();	
	


	


}
