package ihm.buttons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import ihm.*;

public class LoadButton extends JButton implements ActionListener{
	
	private Window window;
	
	public LoadButton(Window window) {
		super("Load Maze");
		this.window = window;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files","txt");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(window);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            chooser.getSelectedFile().getName());
	    }
	    //implement with main
		
	}

}

