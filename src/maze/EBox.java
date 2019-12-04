package maze;

import java.awt.Color;

public class EBox extends Box{

	private int coordinateI;
	private int coordinateJ;
	private Color color;
	
	public EBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		color = Color.WHITE;
		}
	
	@Override
	public boolean empty() {
		return true;
	}
	
	@Override
	public String status() {
		return("E");
	}
	
	@Override
	public Color getColor() {
		return color;
	}
}
