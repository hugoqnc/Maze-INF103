package ihm;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import maze.*;

public class Window extends JFrame {
	

	private String title;
	
	//taille fixee de la fenetre(en pixel)
	private static final int longueur = 1100;
	private static final int largeur = 700;
	private Maze maze;
	
	private MainPanel mainPanel;
	private int mazeMode; //vaut 0 si le maze est en mode affichage, 1 pour resolution et 2 pour edition
	
	public Window(String title, Maze maze) {
		super();
		this.maze = maze;
		this.title = title;
		mazeMode = 0;//au lancement du programme, on affiche le labyrinthe par defaut
		
		setTitle(this.title);//nom de la fenetre
		setSize(longueur, largeur);
		
		ImageIcon img = new ImageIcon("data/MazeIcon2.png"); //creation de l'icone de la fenetre
		setIconImage(img.getImage());

		mainPanel = new MainPanel(this);//Panel principal avec le contenu affiche dans la fenetre
	    setContentPane(mainPanel);
		
		setLocationRelativeTo(null);//position centrale sur l'ecran
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		setResizable(false); //empeche redimensionnement de la fenetre
	    pack();
	    setVisible(true);
		}
	
	public void resolveMaze() {//afficher le ResolvedMainPanel
		setContentPane(new MainPanel(this));
		revalidate(); //pour reactualiser le panel

	}
	public void editMaze() {//afficher le EditPanel
		setContentPane(new MainPanel(this));
		revalidate(); //pour reactualiser le panel
	}
	
	public void changeMaze(String fileName) {
		maze = new Maze(fileName);
		setContentPane(new MainPanel(this));
		revalidate();

	}
	
	public Maze getMaze() {
		return maze;
	}
	
	public void setMazeMode(int value) {//permet d'alterner entre le labyrinthe en mode affichage, resolution ou edition
		mazeMode = value;
	}
	
	public int getMazeMode() {
		return mazeMode;
	}
	
	

	}
