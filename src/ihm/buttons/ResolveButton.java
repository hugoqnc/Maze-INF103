package ihm.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import ihm.*;

public class ResolveButton extends JButton implements ActionListener{
	
	private Window window;
	
	public ResolveButton(Window window) {
		super("Resolve Maze");
		this.window = window;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		window.resolveMaze();
		
	}

}
