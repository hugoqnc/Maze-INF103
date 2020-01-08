package ihm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorWindow extends JFrame {

	
	public ErrorWindow(String title, String message) {
		super();
		JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);//affiche un popup d'avertissement
		
	}
	

}
