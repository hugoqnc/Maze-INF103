package ihm;
import javax.swing.*;

import maze.Maze;

public class HeadMenu extends JFrame{
	private JFrame menu;
	
	public HeadMenu() {//constructeur
		super();
		menu = new JFrame();
		menu.setSize(500, 80);//taille (en pixel)
		menu.setResizable(false); //empeche redimensionnement de la fenetre
		menu.setVisible(true);
		}

}
