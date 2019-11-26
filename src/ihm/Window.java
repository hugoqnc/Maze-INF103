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
	public Window(String Title, Maze maze) {//constructeur
		super();
		this.longeur = 1000;
		this.largeur = 800;
		this.maze = maze;
		this.Title = Title;
		window = new JFrame();
		window.setTitle(this.Title);//nom de la fenetre
		window.setSize(this.longeur, this.largeur);//taille (en pixel)

		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimentionnement de la fenetre
		
	    pan = new MazePanel(this.maze);
	    setBackground(Color.BLUE);//couleur du JPanel
	    window.setContentPane(pan);// JPanel est le content pane
		
	    //window.pack();
	    window.setVisible(true);
		}
	}
