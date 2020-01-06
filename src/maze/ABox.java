package maze;

import java.awt.Color;

public class ABox extends Box{
	

	private static final Color color = Color.RED;
	
	public ABox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		
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
