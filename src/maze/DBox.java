package maze;

import java.awt.Color;

public class DBox extends Box{

	private int coordinateI;
	private int coordinateJ;
	private Color color;
	
	public DBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		color = Color.cyan;
		}
	
	@Override
	public boolean empty() {
		return true;
	}
	
	@Override
	public String status() {
		return("D");
	}
	
	@Override
	public Color getColor() {
		return color;
	}
	
}
