package ihm;
import java.awt.GridLayout;
import java.util.ArrayList;
import ihm.buttons.EditionMazeButton;

import javax.swing.*;
import maze.*;

public class EditPanel extends JPanel {
	
	private Maze maze;
	private Window window;
	private MouseTrackEdition trackOn = new MouseTrackEdition();

	public EditPanel(Window window) {
		super();
		this.window = window;
		this.maze = window.getMaze();
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));
		for (int i=0; i<longueur; i++) {
			for (int j=0; j<largeur; j++) {
				EditionMazeButton button= new EditionMazeButton(this.maze, i ,j,trackOn);
				add(button);
			}
		}
	}
}