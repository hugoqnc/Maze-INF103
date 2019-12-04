package ihm;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorWindow extends JFrame {
	private JFrame window;
	
	public ErrorWindow(String title, String message) {
		super();
		//ImageIcon img = new ImageIcon("data/MazeIcon2.png");
		window = new JFrame();
		JOptionPane.showMessageDialog(window, message, title, JOptionPane.WARNING_MESSAGE);
		
	}
	

}
