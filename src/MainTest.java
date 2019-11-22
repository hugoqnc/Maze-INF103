
import maze.*;
import dijkstra.*;
import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Maze maze = new Maze("data/labyrinthe.txt");
		maze.initFromTextFile("data/labyrinthe.txt");
		VertexInterface depart = maze.getDepart();
		VertexInterface arrivee = maze.getArrivee();
		
		Dijkstra dij = new Dijkstra();
		PreviousInterface previous = dij.dijkstra(maze, depart);
		ArrayList<VertexInterface> list = previous.getShortestPathTo(arrivee);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getLabel());
		}
		

	}

}
