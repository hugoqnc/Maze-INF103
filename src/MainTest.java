
import maze.*;

import javax.swing.UIManager;

import ihm.AskWindow;
import ihm.ErrorWindow;
import ihm.Window;

public class MainTest {

	public static void main(String[] args) {
		//Le bloc try/catch sert a resoudre des problemes de compatibilite avec macOS
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	    Maze maze = new Maze("data/SampleMaze.txt");
	    
		new Window("Labyrinthe", maze);

	}

}
