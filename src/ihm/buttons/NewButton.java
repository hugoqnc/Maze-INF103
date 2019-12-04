package ihm.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

import ihm.AskWindow;
import ihm.Window;
import maze.Maze;

public class NewButton extends JButton implements ActionListener{
	
	private Window window;
	
	public NewButton(Window window) {
		super("Edit");
		this.window = window;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		AskWindow askW = new AskWindow();
		int length = askW.getLength();
		int width = askW.getWidth();
		
		/*try{
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
			window.changeMaze(fileName); //quitte le mode édition
		}catch (IOException e) {
			e.printStackTrace();
			}*/
		
	}

}
