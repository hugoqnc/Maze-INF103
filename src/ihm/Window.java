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
		this.longueur = 1000;
		this.largeur = 700;
		this.Title = Title;
		window = new JFrame();
		window.setTitle(this.Title);//nom de la fenetre
		window.setSize(this.longueur, this.largeur);//taille (en pixel)

		JPanel pan = new MainPanel(this.maze);
	    window.setContentPane(pan);// JPanel est le content pane
		
		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimensionnement de la fenetre
	    window.pack();
	    window.setVisible(true);
		}
	

	}
