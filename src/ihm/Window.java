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
	
	//interface graphique
	public Window(String title, Maze maze) {//constructeur
		super();

		this.maze = maze;
		//window.setPreferredSize(new Dimension(600,600));
		this.longueur = 1000;
		this.largeur = 700;
		this.title = title;

		setTitle(this.title);//nom de la fenetre
		setSize(this.longueur, this.largeur);//taille (en pixel)
		
		ImageIcon img = new ImageIcon("data/MazeIcon2.png"); //creation de l'icone de la fenetre
		setIconImage(img.getImage());

		mainPanel = new MainPanel(this.maze, 0, this);
	    setContentPane(mainPanel);
		
		setLocationRelativeTo(null);//position centrale sur l'ecran
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		setResizable(false); //empeche redimensionnement de la fenetre
	    pack();
	    setVisible(true);
		}
	
	public void resolveMaze() {
		setContentPane(new MainPanel(this.maze, 1, this));
		revalidate(); //pour reactualiser le panel

	}
	public void editMaze() {
		setContentPane(new MainPanel(this.maze,2,this));
		revalidate(); //pour reactualiser le panel
	}
	
	public void changeMaze(String fileName) {
		maze = new Maze(fileName);
		setContentPane(new MainPanel(this.maze, 0, this));
		revalidate();
	}
	public Maze getMaze() {
		return maze;
	}

	}
