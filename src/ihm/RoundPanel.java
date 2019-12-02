package ihm;

import java.awt.*;
import javax.swing.*;

public class RoundPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		g.fillOval(w/4, h/4, w/2, h/2);
		setBackground(new Color(0,0,0,0)); //couleur transparente
		//setPreferredSize(new Dimension(60,60));
		
	}

}
