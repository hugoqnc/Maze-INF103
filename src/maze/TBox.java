package maze;

import java.awt.Color;


public class TBox extends EBox{
	private int coordinateI;
	private int coordinateJ;
	private Color color;
	
	public TBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		color=Color.darkGray;
		}

	@Override
	public String status() {
		return("T");
	}
	@Override
	public Color getColor() {
		return color;
	}

}
