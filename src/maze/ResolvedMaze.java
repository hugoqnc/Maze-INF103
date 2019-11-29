package maze;

import java.util.ArrayList;

import dijkstra.Dijkstra;
import dijkstra.PreviousInterface;
import dijkstra.VertexInterface;

public class ResolvedMaze {
	
	public ResolvedMaze(Maze maze) {//resolution du maze avec dijkstra
		PreviousInterface previous = Dijkstra.dijkstra(maze, (VertexInterface)maze.getDepart()); //ligne pose probleme
		//dijsktra est une m�thode de classe
		ArrayList<VertexInterface> list = previous.getShortestPathTo((VertexInterface)maze.getArrivee());
		
		for (int i=0; i<list.size(); i++) {// on transforme les cases EBoc traversées par le PCCH par des TBox
			TBox tbox=(TBox)list.get(i);
			maze.setBox(tbox.getCoordinateI(), tbox.getCoordinateJ(), tbox);
		}
	}

}
