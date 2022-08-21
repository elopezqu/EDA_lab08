package EDA_lab08.ejercicio3.DFSyBFS;
import java.io.*;
import java.util.*;

public class Grafo {
    private int vertices; 
    private LinkedList<Integer> adj[];

    public Grafo(int v){
    	vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    public void mostrarMatrizAdy() {
    	String matriz [][]= new String[vertices+1][vertices+1];
    	for(int i=0; i<adj.length;i++) {
            for (int a : adj[i]) {
            	matriz[i+1][a+1] = 1+"";
            }
    	}
    	for(int i=0; i<matriz.length;i++) {
            for (int j=0; j<matriz[i].length; j++) {
            	if(i==0)
            		matriz[i][j]=(j-1)+"";
            	if(j==0)
            		matriz[i][j]=(i-1)+"";
            	if(j==0 && i==0)
            		matriz[i][j]="x";
            	if(matriz[i][j]==null)
            		matriz[i][j]="0";
            	System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
    	}
    }
    public void addArista(int v, int w){
        adj[v].add(w);
    }
    protected void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    public void DFS(int v){
        boolean visited[] = new boolean[vertices];
        DFSUtil(v, visited);
    }
    public void BFS(int s){
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while (queue.size() != 0){
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}