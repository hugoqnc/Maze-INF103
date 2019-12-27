package ihm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import maze.Maze;

public class RightPanel extends JPanel{
	private JPanel menu;
	
	private String message = 
			"<html><p></p>"
			+ "<h1>Manual :</h1>"
			+ "<h2>Load Maze :</h2>"
			+ "<p>Select a compatible .txt file in the file explorer</p>"
			+ "<h2>New Maze :</h2>"
			+ "<P>Write a name for your new maze</p>"
			+ "<P>Then choose its length and width between 2 and 99</p>"
			+ "<p>You can create your maze using the Edit Maze commands</p>"
			+ "<h2>Edit Maze :</h2>"
			+ "<p>Left click to add/remove walls</p>"
			+ "<p>Left click and drag to add/remove several walls</p>"
			+ "<P>Right click (eventually several times) to add/remove</p>"
			+ "<P>a departure/arrival</p>"
			+ "<h2>Save Maze :</h2>"
			+ "<P>Saves the edited maze in its .txt file</p>"
			+ "<h2>Resolve Maze :</h2>"
			+ "<p>Saves the maze, then resolves it</p>"
			+ "<P>The path is shown by blue dots</p>";
	
	public RightPanel() {//constructeur
		super();
		
		setPreferredSize(new Dimension(400,600));
		//setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		JLabel label = new JLabel(message);
		add(label);
		}

}