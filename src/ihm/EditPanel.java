package ihm;
import java.awt.GridLayout;
import ihm.buttons.EditionMazeButton;
import javax.swing.*;
import maze.*;

public class EditPanel extends GeneralMazePanel {
	
	private Maze maze;
	private MouseTrackEdition trackOn = new MouseTrackEdition();

	public EditPanel(Window window) {
		super(window);
		maze = getMaze();
		
		this.maze = window.getMaze();
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));//on cree un quadrillage de boutons pour en faire un labyrinthe editable
		for (int i=0; i<longueur; i++) {
			for (int j=0; j<largeur; j++) {
				EditionMazeButton button= new EditionMazeButton(this.maze, i ,j,trackOn);
				add(button);
			}
		}
	}
}