package ihm.buttons;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ihm.*;
import maze.Maze;

public final class SaveButton extends JButton implements ActionListener{
	
	private final Window window;
	private String fileName;
	
	public SaveButton(Window window) {
		super("Save Maze");
		this.window = window;
		addActionListener(this);
		fileName = window.getMaze().getFileName();
		setBackground(Color.WHITE);
	}
	
	public final void actionPerformed(ActionEvent evt) {
		window.setMazeMode(0);
			try{
				//Methode : on cree une copie EDITED du fichier txt comprenant la version editee du labyrinthe
				//Si cette version ne contient pas de fautes, alors on remplace la version actuelle par la version editee, et on supprime le fichier Copy
				//Si cette version contient une faute, alors on garde dans le fichier texte l'ancienne version sans fautes
				String fileNameNew = fileName.substring(0,fileName.length() - 4) + "1.txt"; //change le nom "test.txt" en "test1.txt", qui devient le fichier EDITED
				FileWriter editFile = new FileWriter(fileNameNew,false);
				BufferedWriter editLector = new BufferedWriter(editFile);
				for (int i=0; i<window.getMaze().getLongeur();i++) {
					for (int j=0; j<window.getMaze().getLargeur();j++) {
						editLector.write(window.getMaze().getBox(i,j).status());
					}
				editLector.newLine();
				}
				editLector.close();
				//le nouveau fichier EDITED est maintenant sauvegarde
				File oldFile = new File(fileName); 
				File newFile = new File (fileNameNew);
				try {
					Maze mazeNew = new Maze(fileNameNew); //Permet de verifier si le nouveau fichier EDITED contient une faute
				}
				catch(RuntimeException rte) {
					newFile.delete(); //si oui, on le supprime et on stoppe l'execution de la methode
					throw new RuntimeException("Error in the edited maze");
				}
				
				newFile.renameTo(oldFile); //si non, on remplace le vieux fichier par le nouveau, et on supprime la copie
				newFile.delete();
				
				window.changeMaze(fileName); //quitte le mode edition et affiche le labyrinthe normalement
			}catch (IOException e) {
				e.printStackTrace();
				}
	}
	    
		
	}