package dijkstra;

import java.util.ArrayList;

public class DijkstraResolveException extends Exception{
	public DijkstraResolveException(String message){
		super(System.getProperty("line.separator") + System.getProperty("line.separator") + "Message : " + message + System.getProperty("line.separator"));
				
		}
	/* try {
			ArrayList<VertexInterface> path = previous.getShortestPathTo()
			if (path.contains(e) == false) {
				throw new DijkstraResolveException("Le labyrinthe donné n'a pas de solution");
			}
		}
		catch(DijkstraResolveException dre){
			dre.printStackTrace();
			throw new RuntimeException("Message : Fin du programme. Il faut corriger l'erreur MazeReadingException"); //permet de stopper l'execution du programme
			
		}*/

}
