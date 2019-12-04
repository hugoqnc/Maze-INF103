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
		this.window = window;
		addActionListener(this);
		fileName = window.getMaze().getFileName();
	}
	
	public void actionPerformed(ActionEvent evt) {
			try{
				fileName = window.getMaze().getFileName();
				FileWriter editFile = new FileWriter(fileName,false);
				BufferedWriter editLector = new BufferedWriter(editFile);
				for (int i=0; i<window.getMaze().getLongeur();i++) {
					for (int j=0; j<window.getMaze().getLargeur();j++) {
						editLector.write(window.getMaze().getBox(i,j).status());
					}
				editLector.newLine();
				}
				editLector.close();
				//le nouveau fichier est maintenant sauvegardé
			}catch (IOException e) {
				e.printStackTrace();
				}
	}
	    
		
	}