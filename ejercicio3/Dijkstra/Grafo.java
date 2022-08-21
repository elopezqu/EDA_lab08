package EDA_lab08.ejercicio3.Dijkstra;
import java.util.*;

public class Grafo {
    // Una lista de listas para representar una lista de adyacencia
    List<List<Arista>> adjList = null;
 
    // Constructor
    Grafo(List<Arista> aristas, int n){
        adjList = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
 
        // agrega bordes al grafo dirigido
        for (Arista edge: aristas) {
            adjList.get(edge.inicio).add(edge);
        }
    }
}
