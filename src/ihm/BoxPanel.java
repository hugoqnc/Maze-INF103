package ihm;
import maze.*;
import maze.Box; //pour eviter un conflit avec javax.swing
import java.awt.*;

import javax.swing.*;

public class BoxPanel extends JPanel {
	
	//private Window window;
	
	public BoxPanel(Box box /*, Window window*/ ) {
		super();
		
		//this.window = window ;
		
		String type = box.status();
		
		if (type.contentEquals("A")) {
			setBackground(Color.RED);
		}
		if (type.contentEquals("D")) {
			setBackground(Color.GREEN);
		}
		if (type.contentEquals("W")) {
			setBackground(Color.BLACK);
		}
		if (type.contentEquals("E")) {
			setBackground(Color.WHITE);
		}
		
		//setPreferredSize(new Dimension(10,10));
		
	}

}
