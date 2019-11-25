package ihm;
import maze.Box; //pour eviter un conflit avec javax.swing
import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;

public class BoxPanel extends JPanel {
	
	//private Window window;
	
	public BoxPanel(Box box , int pathInt/*, Window window*/ ) { //argument : box concernee et entier qui vaut 1 si la box fait partie du chemin, 0 sinon
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
		if (pathInt == 1) {
			setBackground(Color.GRAY);
		}
		
		//setPreferredSize(new Dimension(10,10));
		
	}

}
