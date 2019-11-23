package ihm;
import javax.swing.*;
import maze.*;
import java.awt.*;

public class MazePanel extends JPanel {
	
	public MazePanel(Maze maze) {
		super();
		
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));

	}
	
}
