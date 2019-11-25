package maze;

public class TBox extends EBox{
	private int coordinateI;
	private int coordinateJ;
	
	public TBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}

	@Override
	public String status() {
		return("T");
	}

}
