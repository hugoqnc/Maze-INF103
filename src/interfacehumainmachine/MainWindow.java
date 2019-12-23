package interfacehumainmachine;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private String title;//titre de la fenêtre
	private ImageIcon img;//icone de la fanêtre
	
	//dimension de la fenêtre :
	private int longueur;
	private int largeur;
	
	//contenu dans la fenêtre :
	private MainPanel mainPanel;
	
	public MainWindow() {
		super();
		
		title = "Labyrinthe Julie & Hugo";
		setTitle(title);
		
		longueur =1000;
		largeur =700;
		setSize(longueur,largeur);
		
		img = new ImageIcon("data/MazeIcon2.png");
		setIconImage(img.getImage());
		
		mainPanel = new MainPanel();
		setContentPane(mainPanel);
		
		setLocationRelativeTo(null);//position centrale sur l'ecran
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		setResizable(false); //empeche redimensionnement de la fenetre
	    pack();
	    setVisible(true);	
		
		
	}
	
	
	

}
