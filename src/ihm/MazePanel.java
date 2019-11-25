package ihm;
import javax.swing.*;
import maze.*;
import maze.Box;

import java.awt.*;
import java.util.ArrayList;

public class MazePanel extends JPanel {
	
	//private Window window ;
	
	public MazePanel(Maze maze) {
		super();
		
		ArrayList<ArrayList<Box>> mazeTable = maze.getMaze();
		
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));
		
		for (int i=0; i<longueur; i++) {
			for (int j=0; j<largeur; j++) {
				BoxPanel boxPanel = new BoxPanel(mazeTable.get(i).get(j));
				add(boxPanel);
			}
		}

	}
	
}
