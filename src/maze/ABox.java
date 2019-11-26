package maze;

import java.awt.Color;

public class ABox extends Box{
	

	private int coordinateI;
	private int coordinateJ;
	private Color color;
	
	public ABox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		color = Color.green;
		}
	
	@Override
	public boolean empty() {
		return true;
	}
	
	@Override
	public String status() {
		return("A");
	}
	
	@Override
	public Color getColor() {
		return color;
	}

}
