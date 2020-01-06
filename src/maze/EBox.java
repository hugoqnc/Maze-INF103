package maze;

import java.awt.Color;

public final class EBox extends Box{

	private static final Color color = Color.WHITE;
	
	public EBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public final boolean empty() {
		return true;
	}
	
	@Override
	public final String status() {
		return("E");
	}
	
	@Override
	public final Color getColor() {
		return color;
	}
}
