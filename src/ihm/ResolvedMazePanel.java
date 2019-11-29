package ihm;
import javax.swing.*;

import dijkstra.Dijkstra;
import dijkstra.PreviousInterface;
import dijkstra.VertexInterface;
import maze.*;
import maze.Box;

import java.awt.*;
import java.util.ArrayList;

public class ResolvedMazePanel extends JPanel {
	
	Maze maze;
	
	public ResolvedMazePanel(Maze maze) {
		super();
		this.maze = maze;
		
		ArrayList<ArrayList<Box>> mazeTable = maze.getMaze();
		
		ArrayList<VertexInterface> path = maze.shortestPath();
		int pathInt = 0; //voir dans BoxPanel
		
		int longueur = maze.getLongeur();
		int largeur = maze.getLargeur();
		
		setLayout(new GridLayout(longueur, largeur));
		
		for (int i=0; i<longueur; i++) {
			for (int j=0; j<largeur; j++) {
				Box box = mazeTable.get(i).get(j);
				if (path.contains(box)){
					pathInt = 1;
				}
				BoxPanel boxPanel = new BoxPanel(box, pathInt);
				add(boxPanel);
				pathInt = 0;
			}
		}
	}
	
}