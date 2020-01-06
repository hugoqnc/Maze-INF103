package maze;

import java.awt.Color;


import dijkstra.VertexInterface;

public abstract class Box 
	implements VertexInterface
	{
	private final int coordinateI;
	private final int coordinateJ;
	private static Color color;
	
	public Box(int coordinateI, int coordinateJ) {//constructeur de Box
		this.coordinateI = coordinateI;
		this.coordinateJ= coordinateJ;}
	
	public int getCoordinateI() {
		return coordinateI;}
	
	public int getCoordinateJ() {
		return coordinateJ;}
	
	public Color getColor() {
		return color;}
	
	public String getLabel() {//renvoie identifiant de la box par "coordinateI,coordinateJ"
		return(String.valueOf(coordinateI) +","+ String.valueOf(coordinateJ));
	}
	
	public boolean empty() {
		return false;}
	
	public abstract String status();	
	


	


}
