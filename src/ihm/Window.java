package ihm;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import maze.*;

public class Window extends JFrame {
	
	JFrame window;
	private MazePanel pan;
	private String Title;
	//taille (en pixel)
	private int longueur;
	private int largeur;
	private Maze maze;
	
	//interface graphique
	public Window(String Title, Maze maze) {//constructeur
		super();

		//window.setPreferredSize(new Dimension(600,600));
		this.longueur = 700;
		setLargeur(maze);
		this.maze = maze;
		this.Title = Title;
		window = new JFrame();
		window.setTitle(this.Title);//nom de la fenetre
		window.setSize(this.longueur, this.largeur);//taille (en pixel)

		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimensionnement de la fenetre
		
	    pan = new MazePanel(this.maze);
	    setBackground(Color.BLUE);//couleur du JPanel
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
