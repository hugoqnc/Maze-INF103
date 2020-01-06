package ihm;
import maze.Box; //pour eviter un conflit avec javax.swing
import java.awt.*;

import javax.swing.*;

public class BoxPanel extends JPanel {
	
	public BoxPanel(Box box , int pathInt) { //argument : box concernee et entier qui vaut 1 si la box fait partie du chemin solution, 0 sinon
		super();
		
		if (pathInt == 1) {//si la box fait partie du chemin solution :
			setLayout(new BorderLayout());
			RoundPanel round = new RoundPanel(); //on ajoute un point bleu a l'interieur
			add(round, BorderLayout.CENTER);
		}
		setBackground(box.getColor());
	}

}
