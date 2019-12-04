package ihm;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AskWindow extends JFrame {
public JFrame window;
	
	public AskWindow(String title, String message) {
		super();
		window = new JFrame();
		Integer[] values = new Integer[98];
		for (int i =0; i<values.length; i++) {
			values[i] = i+2;
		}
		JOptionPane.showInputDialog(null, "Length : ", "Choose length (1/2)", JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
		JOptionPane.showInputDialog(null, "Width : ", "Choose width (2/2)", JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
		
	}
	
}
