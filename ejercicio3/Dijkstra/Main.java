package EDA_lab08.ejercicio3.Dijkstra;
import java.util.*;
public class Main {
    public static void main(String[] args){
        // (u, v, w) representa la arista desde el vértice `u` hasta el vértice `v` con peso `w`
        List<Arista> edges = Arrays.asList(
                new Arista(0, 1, 10), new Arista(0, 4, 3), new Arista(1, 2, 2),
                new Arista(1, 4, 4), new Arista(2, 3, 9), new Arista(3, 2, 7),
                new Arista(4, 1, 1), new Arista(4, 2, 8), new Arista(4, 3, 2)
        );
        // número total de nodos en el graph (etiquetados de 0 a 4)
        int n = 5;
        // construir grafo
        Grafo graph = new Grafo(edges, n);
        // ejecuta el algoritmo de Dijkstra desde cada nodo
        for (int inicio = 0; inicio < n; inicio++) {
            Dijkstra(graph, inicio, n);
        }
    }
    private static void getRuta(int[] prev, int i, List<Integer> route){
        if (i >= 0){
            getRuta(prev, prev[i], route);
            route.add(i);
        }
    }
 
    // Ejecutar el algoritmo de Dijkstra en un grafo dado
    public static void Dijkstra(Grafo graph, int inicio, int n) {
        // crea un nodo de fuente min-heap y push con distancia 0
        PriorityQueue<Nodo> minHeap;
        minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        minHeap.add(new Nodo(inicio, 0));
 
        // establece la distancia inicial desde la fuente a `v` como infinito
        List<Integer> dist;
        dist = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
 
        // la distancia de la fuente a sí misma es cero
        dist.set(inicio, 0);
 
        // array booleana para rastrear vértices para los cuales mínimo
        // el costo ya se encuentra
        boolean[] done = new boolean[n];
        done[inicio] = true;
 
        // almacena el predecesor de un vértice (en una ruta de impresión)
        int[] prev = new int[n];
        prev[inicio] = -1;
 
        // ejecutar hasta que el min-heap esté vacío
        while (!minHeap.isEmpty()) {
            // Elimina y devuelve el mejor vértice
            Nodo node = minHeap.poll();
 
            //obtenemos el número de vértice
            int u = node.vertex;
 
            // hacer para cada vecino `v` de `u`
            for (Arista edge: graph.adjList.get(u)) {
                int v = edge.destino;
                int weight = edge.peso;
 
                // Paso de relajación
                if (!done[v] && (dist.get(u) + weight) < dist.get(v)) {
                    dist.set(v, dist.get(u) + weight);
                    prev[v] = u;
                    minHeap.add(new Nodo(v, dist.get(v)));
                }
            }
            // marca el vértice `u` como hecho para que no se vuelva a recoger
            done[u] = true;
        }
        List<Integer> route = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (i != inicio && dist.get(i) != Integer.MAX_VALUE) {
                getRuta(prev, i, route);
                System.out.printf("dirección (%d -> %d): costo mínimo = %d, ruta = %s\n",
                                inicio, i, dist.get(i), route);
                route.clear();
            }
        }
    }
}
