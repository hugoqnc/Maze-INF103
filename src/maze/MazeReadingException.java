package maze;

public class MazeReadingException extends Exception {
	public MazeReadingException(String fileName, int lineError, String message){
		super("MazeReadingException in " + fileName + " at line " + lineError + ". Message : " + message);
				
		}
	
}
