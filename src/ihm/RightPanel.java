package ihm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import maze.Maze;

public class RightPanel extends JPanel{
	private JPanel menu;
	
	private String message = 
			"<html><h2>Manual :</h2>"
			+ "<h3>Edit :</h3>"
			+ "<p>Left click to add/remove walls</p>"
			+ "<p>Left click and maintain to add/remove several walls</p>"
			+ "<P>Right click to add/remove a departure/arrival</p>"
			+ "<h3>Load :</h3></html>";
	private String title ="Edition Menu";
	
	public RightPanel() {//constructeur
		super();
		
		setPreferredSize(new Dimension(400,600));
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		JLabel label = new JLabel(message);
		add(label);
		}

}