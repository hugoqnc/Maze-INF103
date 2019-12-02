package dijkstra;

import java.util.ArrayList;

public class Dijkstra {
	
	private static PreviousInterface djikstra(GraphInterface g, VertexInterface r, ASetInterface a, PiInterface pi, PreviousInterface previous) {
		// g est une arrayliste de Vertex, c'est le graph : maze
		// r est la racine du graph : DBox
		// a est une array liste de vertex pour lequels on connait un PCCH issu de r
		// pi:x->pi(x) est la fonction qui donne la valuation d'un PCCH de r à x ne passant que par des sommets de A en plus du sommet x
		// previous:x->previous(x) fonction qui donne le predecesseur de x sur un tel chemin
		a.addVertex(r);
		VertexInterface pivot = r;
		pi.setValue(r,0);
		ArrayList<VertexInterface> sommets = g.getAllVertices(); //calcul unique du vecteur contenant les sommets
		int n = sommets.size();
		for (VertexInterface e : sommets) {
			if (e!=r)
				pi.setValue(e,1000); //on choisit une valeur pour l'infini
		}
		for (int j=0 ; j<n ; j++) {
			ArrayList<VertexInterface> successeurPivot = g.getSuccessors(pivot);
			int numberSuccesseur = successeurPivot.size();
			
			for (int k =0; k<numberSuccesseur; k++) {
				VertexInterface y = successeurPivot.get(k);
				if (a.contains(y) == false) {
					if (pi.getValue(pivot)+g.getWeight(pivot, y)<pi.getValue(y)) {
						pi.setValue(y, pi.getValue(pivot)+g.getWeight(pivot, y));
						previous.setValue(y, pivot);
					}
				}
			}
			
			int piY2 = 0; // valeur de pi(y2)
			int minPi = 0;
			VertexInterface minY2 = null;
			VertexInterface y2NotInA = null;
			int c = 0; //compteur qui ne sert qu'a reperer la premiere entree dans le if
			for (int l=0; l<n ; l++) {
				if (a.contains(sommets.get(l)) == false) {
					VertexInterface y2 = sommets.get(l);
					piY2 = pi.getValue(y2);
					y2NotInA = y2;
					c++;
				}
				if (c==1) {
					minPi = piY2; //a la premiere entree dans le if, on peut initialiser minPi et minY2
					minY2 = y2NotInA;
				}
				if (piY2 < minPi) {
					minPi = piY2;
					minY2 = y2NotInA;
				}

				}
			
			pivot = minY2;
			a.addVertex(pivot);
			
			}
		
		return previous;
		
	}
	
	public static PreviousInterface dijkstra(GraphInterface g, VertexInterface r) { // r est la racine du graphe
		PreviousInterface previous = new Previous();
		ASetInterface a = new ASet();
		PiInterface pi = new Pi();
		
		previous = djikstra(g, r, a, pi, previous);
		
		return previous;
		
	}
	

}

