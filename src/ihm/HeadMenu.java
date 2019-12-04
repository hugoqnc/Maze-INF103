
package ihm;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

import ihm.buttons.*;

public class HeadMenu extends JMenuBar{
	
	private Window window;
	
	public HeadMenu(Window window) {//constructeur
		super();
		this.window = window;
		setPreferredSize(new Dimension(1000,100));
		setBackground(Color.WHITE);
		
		setLayout(new GridLayout(1,5));
		JButton b1 = new JButton("New Maze");
		JButton b2 = new JButton("Edit Maze");
		JButton b3 = new ResolveButton(this.window);
		JButton b4 = new JButton("Save Maze");
		JButton b5 = new LoadButton(this.window);
		add(b1); add(b2); add(b3); add(b4); add(b5);

		
		}

}
