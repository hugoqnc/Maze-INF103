package ihm;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AskWindow extends JFrame {
private JFrame window;
private int length;
private int width;
	
	public AskWindow(String title, String message) {
		super();
		window = new JFrame();
		Integer[] values = new Integer[98];
		for (int i =0; i<values.length; i++) {
			values[i] = i+2;
		}
		Object o1 = JOptionPane.showInputDialog(null, "Length : ", "Choose length (1/2)", JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
		Object o2 = JOptionPane.showInputDialog(null, "Width : ", "Choose width (2/2)", JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
		
		try {
			if (o1 == null || o2 == null) {
				throw new RuntimeException("An input dialog has been ignored");
			}
		}
		catch(RuntimeException rte){
			rte.printStackTrace();
			new ErrorWindow("Ignored input dialog", "Please start again and make sure to fill all the dialogs.");
		}
		
		length = (int) o1;
		width = (int) o2;
		System.out.println(length);
		System.out.println(width);

	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
}
