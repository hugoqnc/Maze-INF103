package interfacehumainmachine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;


public class HeadMenu extends JMenuBar{
	int number =5;
	int longeur =1000;
	int largeur=100;
	
	public HeadMenu() {
		
		setPreferredSize(new Dimension(longeur, largeur));
		setBackground(Color.WHITE);
		
		setLayout(new GridLayout(1,number));
		
		JButton b2 = new NewButton();
		JButton b3 = new EditButton();
		JButton b5 = new ResolveButton();
		JButton b4 = new SaveButton();
		JButton b1 = new LoadButton();
		add(b1); add(b2); add(b3); add(b4); add(b5);
	}

}
