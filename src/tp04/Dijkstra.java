package tp04;

import java.util.ArrayList;

public class Dijkstra {
	
	private PreviousInterface djikstra(GraphInterface g, VertexInterface r, ASetInterface a, PiInterface pi, PreviousInterface previous) {
		// g est une arrayliste de Vertex, c'est le graph
		// r est la racine du graph
		// a est une array liste de vertex pour lequels on connait un PCCH issu de r
		// pi:x->pi(x) est la fonction qui donne la valuation d'un PCCH de r à x ne passant que par des sommets de A en plus du sommet x
		// previous:x->previous(x) fonction qui donne le prédécesseur de x sur un tel chemin
		a.addAnElement(r);
		VertexInterface pivot = r;
		pi.setValue(r,0);
		ArrayList<VertexInterface> sommets = g.returnGraph(); //calcul unique du vecteur contenant les sommets
		int n = sommets.size();
		for (VertexInterface e : sommets) {
			if (e!=r)
				pi.setValue(e,1000); //on choisit une valeur pour l'infini
		}
		for (int j=0 ; j<n ; j++) {
			ArrayList<VertexInterface> successeurPivot = g.getSuccessors(pivot);
			int numberSuccesseur = successeurPivot.size();
			
			for (int k =0; k<numberSuccesseur; k++) {
				if (a.isInA(successeurPivot.get(k)) == false) {
					VertexInterface y = successeurPivot.get(k);
					if (pi.getValue(pivot)+g.valuation(pivot, y)<pi.getValue(y))
						previous.setPrevious(y, pivot);
				}
			}
			
			
			int piY2 = 0;
			int minPi = 0;
			VertexInterface minY2 = null;
			VertexInterface y2InA = null;
			for (int l=0; l<n ; l++) {
				int c = 0; //compteur qui ne sert qu'à repérer la premiere entrée dans le if
				if (a.isInA(sommets.get(l)) == false) {
					VertexInterface y2 = sommets.get(l);
					piY2 = pi.getValue(y2);
					y2InA = y2;
					c++;
				}
				if (c==1) {
					minPi = piY2; //à la premiere entrée dans le if, on peut initialiser minPi
				}
				if (piY2 < minPi) {
					minPi = piY2;
					minY2 = y2InA;
				}
					 
				}
			
			pivot = minY2;
			a.addAnElement(pivot);
			
			}
		
		return previous;
		// retourne 
		
	}
	

}

