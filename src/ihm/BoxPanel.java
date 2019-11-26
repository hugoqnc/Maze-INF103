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
		setBackground(box.getColor());
		
	}

}
