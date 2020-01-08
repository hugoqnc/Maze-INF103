package dijkstra;

public class DijkstraResolveException extends Exception{
	
	private String messageErreur;
	
	public DijkstraResolveException(String message){
		super(System.getProperty("line.separator") + System.getProperty("line.separator") + "Message : " + message + System.getProperty("line.separator"));
		messageErreur = message;
				
		}
	public String getMessage() {
		return messageErreur;
	}
	
	public String getTitle() {
		return "Maze Resolve Error";
	}
}



