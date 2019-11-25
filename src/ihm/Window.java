package ihm;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import maze.*;

public class Window extends JFrame {
	
	JFrame window;
	private MazePanel pan;
	private String Title;
	//taille (en pixel)
	private int longeur;
	private int largeur;
	private Maze maze;
	
	//interface graphique
	public Window(Maze maze) {//constructeur
		super();
		window = new JFrame();
		window.setTitle(Title);//nom de la fenetre
		window.setSize(longeur, largeur);//taille (en pixel)

		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimentionnement de la fenetre
		
	    pan = new MazePanel(maze);
	    pan.setBackground(Color.BLUE);//couleur du JPanel
	    window.setContentPane(pan);// JPanel est le content pane
		
	    //window.pack();
	    window.setVisible(true);
		}
	}
