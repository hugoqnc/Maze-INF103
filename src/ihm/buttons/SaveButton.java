package ihm.buttons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
//import MainTest;

import ihm.*;

public class SaveButton extends JButton implements ActionListener{
	
	private Window window;
	
	public SaveButton(Window window) {
		super("Save Maze");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
	    }
	    
		
	}