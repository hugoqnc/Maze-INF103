
import maze.*;
import ihm.AskWindow;
import ihm.ErrorWindow;
import ihm.Window;

public class MainTest {

	public static void main(String[] args) {
	    Maze maze = new Maze("data/DefaultMaze.txt");
	    
		new Window("Labyrinthe", maze);
		
		new AskWindow("titre", "message");

	}

}
