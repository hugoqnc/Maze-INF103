package ihm.buttons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ihm.*;

public class SaveButton extends JButton implements ActionListener{
	
	private Window window;
	private String fileName;
	
	public SaveButton(Window window) {
		super("Save Maze");
		addActionListener(this);
		fileName = window.getMaze().getFileName();
	}
	
	public void actionPerformed(ActionEvent evt) {
			try{
				FileWriter editFile = new FileWriter(fileName,false);
				BufferedWriter editLector = new BufferedWriter(editFile);
				for (int i=0; i<window.getLongueur();i++) {
					for (int j=0; j<window.getLongueur();j++) {
						editLector.write("h");
						//window.getMaze().getBox(i,j).getLabel()
						
					}
				editLector.newLine();
				}
				editLector.close();
			}catch (IOException e) {e.printStackTrace();}
	}
	    
		
	}