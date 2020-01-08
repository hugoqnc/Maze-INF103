package ihm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import maze.Maze;

public class RightPanel extends JPanel{
	
	private static final String message = //le message du RightPanel est ecrit en html
			"<html><p></p>"
			+ "<h1>Manual :</h1>"
			+ "<h2>Load Maze :</h2>"
			+ "<p>-Select a compatible .txt file in the file explorer</p>"
			+ "<p>-A maze with errors (none or several departure(s)/arrival(s))</p>"
			+ "<p>will not be opened</p>"
			+ "<h2>New Maze :</h2>"
			+ "<P>-Write a name for your new maze</p>"
			+ "<P>-Then choose its length and width between 2 and 99</p>"
			+ "<p>-You can create your maze using the Edit Maze commands</p>"
			+ "<h2>Edit Maze :</h2>"
			+ "<p>-Left click to add/remove walls</p>"
			+ "<p>-Left click and drag to add/remove several walls</p>"
			+ "<p>-Right click (eventually several times) to add/remove</p>"
			+ "<p>a departure/arrival</p>"
			+ "<h2>Save Maze :</h2>"
			+ "<p>-Saves the edited maze in its .txt file, and leaves the</p>"
			+ "<p>edit mode</p>"
			+ "<p>-An edited maze with errors can not be saved</p>"
			+ "<p>-You can use the Save Maze button to unresolve a maze</p>"
			+ "<h2>Resolve Maze :</h2>"
			+ "<p>-Saves the maze, then resolves it</p>"
			+ "<P>-The path is shown by blue dots</p>";
	
	public RightPanel() {//constructeur
		super();
		
		setPreferredSize(new Dimension(500,600));
		//setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		JLabel label = new JLabel(message);
		add(label);
		}

}