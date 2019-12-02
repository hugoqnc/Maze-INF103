package ihm;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import maze.*;

public class Window extends JFrame {
	
	JFrame window;
	private String Title;
	//taille (en pixel)
	private int longueur;
	private int largeur;
	private Maze maze;
	
	//interface graphique
	public Window(String Title, Maze maze) {//constructeur
		super();

		this.maze = maze;
		//window.setPreferredSize(new Dimension(600,600));
		this.longueur = 700;
		setLargeur(this.maze);
		this.Title = Title;
		window = new JFrame();
		window.setTitle(this.Title);//nom de la fenetre
		window.setSize(this.longueur, this.largeur);//taille (en pixel)

		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimensionnement de la fenetre
		
		ResolvedMazePanel pan = new ResolvedMazePanel(this.maze);
	    window.setContentPane(pan);// JPanel est le content pane
		
	    //window.pack();
	    window.setVisible(true);
		}
	
	public void setLargeur(Maze maze) {
		float nbLongueur = maze.getLongeur();
		float nbLargeur = maze.getLargeur();
		largeur = Math.round(longueur*(nbLongueur/nbLargeur));
	}
	}
