
package ihm;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

import ihm.buttons.*;

public class HeadMenu extends JMenuBar{
	
	private final Window window;
	
	public HeadMenu(Window window) {//constructeur
		super();
		this.window = window;
		setPreferredSize(new Dimension(1100,100));
		setBackground(Color.WHITE);
		
		setLayout(new GridLayout(1,5));
		JButton b2 = new NewButton(this.window);
		JButton b3 = new EditButton(this.window);
		JButton b5 = new ResolveButton(this.window);
		JButton b4 = new SaveButton(this.window);
		JButton b1 = new LoadButton(this.window);
		add(b1); add(b2); add(b3); add(b4); add(b5);

		
		}

}
