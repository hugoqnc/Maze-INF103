package ihm.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import ihm.*;

public class ResolveButton extends JButton implements ActionListener{
	
	private final Window window;
	
	public ResolveButton(Window window) {
		super("Resolve Maze");
		this.window = window;
		setBackground(Color.yellow);
		setOpaque(true);
		addActionListener(this);
	}
	
	public final void actionPerformed(ActionEvent evt) {//au click, affiche le panel de resolution de Maze
		SaveButton b = new SaveButton(window);
		b.actionPerformed(null); //enregistre si on est dans le mode Edit avant de resoudre
		window.setMazeMode(1);
		window.resolveMaze();
		
	}

}
