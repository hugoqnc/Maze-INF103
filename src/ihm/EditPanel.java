package ihm;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import maze.*;

public class EditPanel extends JPanel {
	
	private Maze maze;

	public EditPanel(Maze maze) {
		super();
		this.maze = maze;
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));
		for (int i=0; i<longueur; i++) {
			for (int j=0; j<largeur; j++) {
				EditionMazeButton button= new EditionMazeButton(this.maze, i ,j);
				add(button);
			}
		}
	}
}