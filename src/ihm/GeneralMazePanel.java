package ihm;


import javax.swing.JPanel;
import maze.Maze;

public abstract class GeneralMazePanel extends JPanel {//classe mere des differents types de Panel affichant le maze
	
	private Maze maze;	
	
	public GeneralMazePanel(Window window) {
		super();
		this.maze = window.getMaze();

	}

	public Maze getMaze() {
		return maze;
	}
	
}

