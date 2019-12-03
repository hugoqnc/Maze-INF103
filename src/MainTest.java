
import maze.*;

import ihm.Window;

public class MainTest {

	public static void main(String[] args) {
	    Maze maze = new Maze("data/labyrinthe etroit.txt");
	    
		new Window("Labyrinthe", maze);

	}

}
