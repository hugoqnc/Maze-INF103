package maze;

public class WBox extends Box{//case Wall


	private int coordinateI;
	private int coordinateJ;
	
	public WBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public String status() {
		return("W");
	}
	

}
