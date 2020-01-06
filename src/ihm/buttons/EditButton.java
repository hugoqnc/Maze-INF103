package ihm.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


import ihm.*;

public class EditButton extends JButton implements ActionListener{
	
	private final Window window;
	
	public EditButton(Window window) {
		super("Edit Maze");
		this.window = window;
		setBackground(Color.WHITE);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {// au click, rightpanel affiche le panel d'edition 
		window.setMazeMode(2);
		window.editMaze();
		
	}

}
