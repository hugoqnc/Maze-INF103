package ihm.buttons;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
//import MainTest;

import ihm.*;

public class LoadButton extends JButton implements ActionListener{
	
	private final Window window;
	
	public LoadButton(Window window) {
		super("Load Maze");
		this.window = window;
		setBackground(Color.WHITE);
		addActionListener(this);
	}
	
	public final void actionPerformed(ActionEvent evt) { //construction du nouveau Maze déterminer par l'utilisateur
		window.setMazeMode(0);
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Choose the maze you want to load");
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files","txt");
	    
	    //verification que le fichier est .txt
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(window);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	if (chooser.getSelectedFile().exists()) {
	    		window.changeMaze(chooser.getSelectedFile().getPath());
	    	}
	    	else {
	    		new ErrorWindow("Non-existent File","Please try again and choose an existing .txt file.");
	    	}
	    }
	    
		
	}

}

