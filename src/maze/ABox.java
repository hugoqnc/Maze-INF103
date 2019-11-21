package maze;

public class ABox extends Box{
	

	private int coordinateI;
	private int coordinateJ;
	
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

}
