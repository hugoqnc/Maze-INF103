package dijkstra;

public class DijkstraResolveException extends Exception{
	public DijkstraResolveException(String message){
		super(System.getProperty("line.separator") + System.getProperty("line.separator") + "Message : " + message + System.getProperty("line.separator"));
				
		}

}
