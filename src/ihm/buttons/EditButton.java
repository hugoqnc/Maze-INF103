package ihm.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import maze.*;

import ihm.*;

public class EditButton extends JButton implements ActionListener{
	
	private Window window;
	private Maze currentMaze;
	
	public EditButton(Window window) {
		super("Edition");
		this.window = window;
		currentMaze = window.getMaze();
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		window.editMaze();
		
	}

}
