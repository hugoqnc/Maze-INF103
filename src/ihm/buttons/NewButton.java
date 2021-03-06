package ihm.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

import ihm.AskWindow;
import ihm.Window;

public final class NewButton extends JButton implements ActionListener{
	
	private final Window window;
	
	public NewButton(Window window) {
		super("New Maze");
		this.window = window;
		setBackground(Color.WHITE);
		addActionListener(this);
	}
	
	public final void actionPerformed(ActionEvent evt) {// au click, ouverture d'une fenetre avec un deroulant pour determiner la taille du new Maze
		AskWindow askW = new AskWindow();
		int length = askW.getLength();
		int width = askW.getWidth();
		String filePath = askW.getFilePath();
		try{
			FileWriter editFile = new FileWriter(filePath,false);
			BufferedWriter editLector = new BufferedWriter(editFile);
			for (int i=0; i<length;i++) {
				for (int j=0; j<width;j++) {
					if (i==0 && j==0) {
						editLector.write("D");
					}
					else if (i==0 && j==1) {
						editLector.write("A");
					}
					else editLector.write("E");
				}
			editLector.newLine();
			}
			editLector.close();
			//le nouveau fichier est maintenant sauvegarde
		}catch (IOException e) {
			e.printStackTrace();
			}
		window.setMazeMode(2);
		window.changeMaze(filePath);
		window.editMaze();

	}

}
