package maze;

import java.awt.Color;

public class EBox extends Box{

	private static final Color color = Color.WHITE;
	
	public EBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
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
