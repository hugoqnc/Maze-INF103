package ihm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

import maze.Maze;

public class HeadMenu extends JMenuBar{
	
	public HeadMenu() {//constructeur
		super();
		setPreferredSize(new Dimension(1000,100));
		setBackground(Color.WHITE);
		
		/*JMenu menu =new JMenu("Menu");
		JMenu menu2=new JMenu("Menu2");  
        JMenu submenu=new JMenu("Sub Menu");  
        JMenuItem i1=new JMenuItem("Item 1");  
        JMenuItem i2=new JMenuItem("Item 2");  
        JMenuItem i3=new JMenuItem("Item 3");  
        JMenuItem i4=new JMenuItem("Item 4");  
        JMenuItem i5=new JMenuItem("Item 5");  
        menu.add(i1); menu.add(i2); menu.add(i3);  
        submenu.add(i4); submenu.add(i5);  
        menu.add(submenu);  
        add(menu);
        add(menu2);*/
		
		setLayout(new GridLayout(1,5));
		JButton b1 = new JButton("New Maze");
		JButton b2 = new JButton("Edit Maze");
		JButton b3 = new JButton("Resolve Maze");
		JButton b4 = new JButton("Save Maze");
		JButton b5 = new JButton("Load Maze");
		add(b1); add(b2); add(b3); add(b4); add(b5);

		
		}

}
