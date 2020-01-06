package maze;

import java.awt.Color;

public class DBox extends Box{


	private static final Color color = Color.GREEN;
	
	public DBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
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
