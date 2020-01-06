package maze;

public final class MazeReadingException extends Exception {
	
	private final String messageErreur;
	

	public MazeReadingException(String fileName, int lineError, String message){//constructeur, indique ligne de l'erreur dans le labyrinthe
		super(System.getProperty("line.separator") + System.getProperty("line.separator") + "MazeReadingException dans " + "\"" + fileName + "\""+ " � la ligne " + lineError + "." +System.getProperty("line.separator")+ "Message : " + message + System.getProperty("line.separator"));
		messageErreur = "Error at line number "+ lineError + " of the file \"" + fileName + "\"" + System.getProperty("line.separator") + message;
	}
	
	public final String getMessage() {
		return messageErreur;
	}
	
	public final String getTitle() {
		return "Reading Maze Error";
	}
}
