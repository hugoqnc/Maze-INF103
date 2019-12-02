package ihm;
import maze.Box; //pour eviter un conflit avec javax.swing
import java.awt.*;

import javax.swing.*;

public class BoxPanel extends JPanel {
	
	//private Window window;
	
	public BoxPanel(Box box , int pathInt/*, Window window*/ ) { //argument : box concernee et entier qui vaut 1 si la box fait partie du chemin, 0 sinon
		super();
		
		if (pathInt == 1) {
			RoundPanel round = new RoundPanel();
			add(round);
			//setBackground(Color.GRAY);
		}
		
		
		//setPreferredSize(new Dimension(10,10));

		setBackground(box.getColor());
		
	}

}
