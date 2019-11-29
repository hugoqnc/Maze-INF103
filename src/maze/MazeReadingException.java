package maze;

public class MazeReadingException extends Exception {
	public MazeReadingException(String fileName, int lineError, String message){
		super("MazeReadingException at line " + lineError + ". Message : " + message);
				
		}
	
}
