package tp04;

public class EBox extends Box{

	private final int coordinateI;
	private final int coordinateJ;
	
	private eBox(int coordinateI, int coordinateJ) {//constructeur de ABox
		super(coordinateI,coordinateJ);
		}
	
	@Override
	public boolean empty() {
		return true;
	}
}
