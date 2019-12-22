package ihm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import maze.Maze;

public class RightPanel extends JPanel{
	private JPanel menu;
	private String message = "<html><body>"
			+ "Utilisation du menu Edition :"
			+ "<br />"
			+ "Clique gauche et maintenir pour changer plusieurs cases d'un coup."
			+ "<br />"
			+ "Clique droit pour changer une case à la fois et définir les cases départ et arrivée."
			+ "</body></html>";
	private String title ="Edition Menu";
	
	public RightPanel() {//constructeur
		super();
		setPreferredSize(new Dimension(400,600));
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		JLabel label = new JLabel(message);
		add(label);
		}

}