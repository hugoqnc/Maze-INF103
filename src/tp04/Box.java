package tp04;

public class Box 
	implements VertexInterface
	{
	private final int coordinateI;
	private final int coordinateJ;
	
	public Box(int coordinateI, int coordinateJ) {
		this.coordinateI = coordinateI;
		this.coordinateJ= coordinateJ;}
	
	public String getLabel() {
		
	}
	
	public boolean empty() {
		return false;}

}
