
import maze.*;

import ihm.Window;

public class MainTest {

	public static void main(String[] args) {
	    Maze maze = new Maze("data/labyrinthe.txt");
	    
		new Window("Labyrinthe", maze);
		

	}

}
