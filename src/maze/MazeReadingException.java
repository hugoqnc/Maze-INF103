package maze;

public class MazeReadingException extends Exception {
	
	private String messageErreur;
	
	public MazeReadingException(String fileName, int lineError, String message){//constructeur, indique ligne de l'erreur dans le labyrinthe
		super(System.getProperty("line.separator") + System.getProperty("line.separator") + "MazeReadingException dans " + "\"" + fileName + "\""+ " � la ligne " + lineError + "." +System.getProperty("line.separator")+ "Message : " + message + System.getProperty("line.separator"));
		messageErreur = "Error at line"+ lineError + " of the file \"" + fileName + "\"" + System.getProperty("line.separator") + message;
		}
	
	public String getMessage() {
		return messageErreur;
	}
	
	public String getTitle() {
		return "Reading Maze Error";
	}
}
