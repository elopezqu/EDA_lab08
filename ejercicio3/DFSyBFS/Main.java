package EDA_lab08.ejercicio3.DFSyBFS;
public class Main{
	public static void main(String[] args){
		Grafo g = new Grafo(4);
        g.addArista(0, 1);
        g.addArista(0, 2);
        g.addArista(1, 2);
        g.addArista(2, 0);
        g.addArista(2, 3);
        g.addArista(3, 3);
        System.out.println("Matriz de adyacencia: ");
        g.mostrarMatrizAdy();
        System.out.println("DFS comenzado en el vertice 2: ");
        g.DFS(2);
        System.out.println("BFS comenzado en el vertice 2: ");
        g.BFS(2);
	}
}