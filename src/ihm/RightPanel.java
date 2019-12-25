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
			+ "<p>Select a compatible .txt file</p>"
			+ "<h2>New Maze :</h2>"
			+ "<P>Choose a name ending with .txt for the new maze</p>"
			+ "<P>Then choose the length and width between 2 and 99</p>"
			+ "<h2>Edit Maze :</h2>"
			+ "<p>Left click to add/remove walls</p>"
			+ "<p>Left click and maintain to add/remove several walls</p>"
			+ "<P>Right click to add/remove a departure/arrival</p>"
			+ "<h2>Save Maze :</h2>"
			+ "<P>Saves the edited maze in the .txt file</p>"
			+ "<h2>Resolve Maze :</h2>"
			+ "<p>Saves the maze, then resolves it</p>";
	private String title ="Edition Menu";
	
	public RightPanel() {//constructeur
		super();
		
		setPreferredSize(new Dimension(400,600));
		//setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		JLabel label = new JLabel(message);
		add(label);
		}

}