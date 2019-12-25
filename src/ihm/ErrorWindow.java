package ihm;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorWindow extends JFrame {

	
	public ErrorWindow(String title, String message) {
		super();
		//ImageIcon img = new ImageIcon("data/MazeIcon2.png");

		JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);
		
	}
	

}
