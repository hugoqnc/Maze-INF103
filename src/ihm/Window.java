package ihm;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import maze.*;

public class Window extends JFrame {
	
	public JFrame window;
	private String title;
	
	//taille (en pixel)
	private int longueur;
	private int largeur;
	private Maze maze;
	
	private MainPanel mainPanel;
	private int mazeMode; //vaut 0 si le maze est en mode affichage, 1 pour resolu et 2 pour edition
	
	//interface graphique
	public Window(String title, Maze maze) {//constructeur
		super();

		this.maze = maze;
		//window.setPreferredSize(new Dimension(600,600));
		this.longueur = 1000;
		this.largeur = 700;
		this.title = title;
		mazeMode = 0;
		
		window = new JFrame();
		window.setTitle(this.title);//nom de la fenetre
		window.setSize(this.longueur, this.largeur);//taille (en pixel)
		
		ImageIcon img = new ImageIcon("data/MazeIcon2.png"); //creation de l'icone de la fenetre
		window.setIconImage(img.getImage());

		mainPanel = new MainPanel(this);
	    window.setContentPane(mainPanel);
		
		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimensionnement de la fenetre
	    window.pack();
	    window.setVisible(true);
		}
	
	public void resolveMaze() {
		window.setContentPane(new MainPanel(this));
		window.revalidate(); //pour reactualiser le panel

	}
	public void editMaze() {
		window.setContentPane(new MainPanel(this));
		window.revalidate(); //pour reactualiser le panel
	}
	
	public void changeMaze(String fileName) {
		maze = new Maze(fileName);
		window.setContentPane(new MainPanel(this));
		window.revalidate();
	}
	
	public Maze getMaze() {
		return maze;
	}
	
	public void setMazeMode(int value) {
		mazeMode = value;
	}
	
	public int getMazeMode() {
		return mazeMode;
	}
	
	

	}
