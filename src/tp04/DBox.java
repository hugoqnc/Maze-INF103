package tp04;

public class DBox extends Box{

	private final int coordinateI;
	private final int coordinateJ;
	
	private dBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public boolean empty() {
		return true;
	}
}
