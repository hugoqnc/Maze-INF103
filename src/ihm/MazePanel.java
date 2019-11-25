package ihm;
import javax.swing.*;

import dijkstra.Dijkstra;
import dijkstra.PreviousInterface;
import dijkstra.VertexInterface;
import maze.*;
import maze.Box;

import java.awt.*;
import java.util.ArrayList;

public class MazePanel extends JPanel {
	
	//private Window window ;
	
	public MazePanel(Maze maze) {
		super();
		
		ArrayList<ArrayList<Box>> mazeTable = maze.getMaze();
		
		PreviousInterface previous = Dijkstra.dijkstra(maze, maze.getDepart());
		ArrayList<VertexInterface> path = previous.getShortestPathTo(maze.getArrivee());
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
				BoxPanel boxPanel = new BoxPanel(mazeTable.get(i).get(j), pathInt);
				add(boxPanel);
				pathInt = 0;
			}
		}

	}
	
}
