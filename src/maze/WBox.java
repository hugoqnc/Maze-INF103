package maze;

import java.awt.Color;
public class WBox extends Box{//case Wall


	private int coordinateI;
	private int coordinateJ;
	private Color color;
	
	public WBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		color =Color.BLACK;
		}
	
	@Override
	public String status() {
		return("W");
	}
	
	@Override
	public Color getColor() {
		return color;
	}
	

}
