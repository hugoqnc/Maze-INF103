package maze;

import java.awt.Color;

public final class DBox extends Box{


	private static final Color color = Color.GREEN;
	
	public DBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public final boolean empty() {
		return true;
	}
	
	@Override
	public final String status() {
		return("D");
	}
	
	@Override
	public final Color getColor() {
		return color;
	}
	
}
