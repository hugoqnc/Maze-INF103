package ihm;

import java.awt.*;
import javax.swing.*;

public class RoundPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.WHITE);
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.BLUE);
		g.fillOval(w/4, h/4, w/2, h/2);
		
	}

}
