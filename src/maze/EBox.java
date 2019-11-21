package maze;

public class EBox extends Box{

	private int coordinateI;
	private int coordinateJ;
	
	public EBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public boolean empty() {
		return true;
	}
	
	@Override
	public String status() {
		return("E");
	}
}
