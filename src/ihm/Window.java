package ihm;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class Window extends JFrame {
	//interface graphique
	public Window() {//constructeur
		JFrame window = new JFrame();
		window.setTitle("Labyrinthe binome 6");//nom de la fenetre
		window.setSize(1000, 800);//taille (en pixel)
		window.setLocationRelativeTo(null);//position centrale sur l'ecran
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fin sur x
		window.setResizable(false); //empeche redimentionnement de la fenetre
		
		
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.BLUE);//couleur du JPanel
	    this.setContentPane(pan);// JPanel est le content pane   
		
	    window.setVisible(true);
		}
	}
