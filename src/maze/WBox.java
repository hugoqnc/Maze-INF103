package maze;

import java.awt.Color;
public class WBox extends Box{//case Wall


	private static final Color color = Color.BLACK;
	
	public WBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public final String status() {
		return("W");
	}
	
	@Override
	public final Color getColor() {
		return color;
	}
	

}
