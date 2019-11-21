import maze.Maze;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ihm.Window;

public class MainTest {

	public static void main(String[] args) {
		
		//interface graphique
		JFrame window = new JFrame();
		window.setTitle("Labyrinthe binome 6");//nom de la fenetre
		window.setSize(1000, 800);//taille (en pixel)
		window.setLocationRelativeTo(null);//position centrée sur l'écran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimentionnement de la fenetre
		
		
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.BLUE);//couleur du JPanel
	    window.setContentPane(pan);// JPanel est le content pane   
		
	    window.setVisible(true);
		
		
		//Maze maze = new Maze("data/labyrinthe.txt");
		//maze.initFromTextFile("data/labyrinthe.txt");
		

	}

}
