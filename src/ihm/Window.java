package ihm;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import maze.*;

public class Window extends JFrame {
	
	private MazePanel pan;
	
	//interface graphique
	public Window(Maze maze) {//constructeur
		super();
		JFrame window = new JFrame();
		window.setTitle("Labyrinthe Hugo & Julie");//nom de la fenetre
		window.setSize(600, 600);//taille (en pixel)
		//window.setPreferredSize(new Dimension(600,600));
		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimensionnement de la fenetre
		
	    pan = new MazePanel(maze);
	    //pan.setBackground(Color.BLUE);//couleur du JPanel
	    window.setContentPane(pan);// JPanel est le content pane
		
	    //window.pack();
	    window.setVisible(true);
		}
	}
