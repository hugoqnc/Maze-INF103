package ihm;
import javax.swing.*;

import maze.*;
import maze.Box;

import java.awt.*;
import java.util.ArrayList;

public class MazePanel extends JPanel {
	
	Maze maze;	
	
	public MazePanel(Maze maze) {
		super();
		this.maze = maze;

		ArrayList<ArrayList<Box>> mazeTable = maze.getMaze();
		mazeTable = maze.getMaze();
		int pathInt = 0; //voir dans BoxPanel
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));
		
		for (int i=0; i<longueur; i++) {
			for (int j=0; j<largeur; j++) {
				Box box = mazeTable.get(i).get(j);
				BoxPanel boxPanel = new BoxPanel(box, pathInt);
				add(boxPanel);
			}
		}
	}
	
}
