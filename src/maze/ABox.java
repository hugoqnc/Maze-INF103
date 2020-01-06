package maze;

import java.awt.Color;

public final class ABox extends Box{
	

	private static final Color color = Color.RED;
	
	public ABox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		
		}
	
	@Override
	public final boolean empty() {
		return true;
	}
	
	@Override
	public final String status() {
		return("A");
	}
	
	@Override
	public final Color getColor() {
		return color;
	}

}
