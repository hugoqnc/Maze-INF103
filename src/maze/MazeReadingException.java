package maze;

public class MazeReadingException extends Exception {
	public MazeReadingException(String fileName, int lineError, String message){
		super(System.getProperty("line.separator") + System.getProperty("line.separator") + "MazeReadingException dans " + "\"" + fileName + "\""+ " à la ligne " + lineError + "." +System.getProperty("line.separator")+ "Message : " + message + System.getProperty("line.separator"));
				
		}
	
}
