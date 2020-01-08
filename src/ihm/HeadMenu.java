
package ihm;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import ihm.buttons.*;

public class HeadMenu extends JMenuBar{
	
	public HeadMenu(Window window) {//constructeur
		super();
		setPreferredSize(new Dimension(1100,100));
		setBackground(Color.WHITE);
		
		setLayout(new GridLayout(1,5));// cree une "barre" de boutons
		JButton b2 = new NewButton(window);
		JButton b3 = new EditButton(window);
		JButton b5 = new ResolveButton(window);
		JButton b4 = new SaveButton(window);
		JButton b1 = new LoadButton(window);
		add(b1); add(b2); add(b3); add(b4); add(b5);

		
		}

}
