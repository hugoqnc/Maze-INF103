package maze;

public class DBox extends Box{

	private int coordinateI;
	private int coordinateJ;
	
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
}
