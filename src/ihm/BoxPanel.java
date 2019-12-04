package ihm;
import maze.Box; //pour eviter un conflit avec javax.swing
import java.awt.*;

import javax.swing.*;

public class BoxPanel extends JPanel {
	
	//private Window window;
	
	public BoxPanel(Box box , int pathInt/*, Window window*/ ) { //argument : box concernee et entier qui vaut 1 si la box fait partie du chemin, 0 sinon
		super();
		
		if (pathInt == 1) {
			setLayout(new BorderLayout());
			RoundPanel round = new RoundPanel();
			//round.setBackground(box.getColor());
			add(round, BorderLayout.CENTER);
			//setBackground(Color.WHITE);
			
		}
		setBackground(box.getColor());
	}

}
