package Grafo;

public class Test {
    public static void main(String[]args){
        Grafo grafo = new Grafo();
        grafo.newVertice("1");
        grafo.newVertice("2");
        grafo.newVertice("3");
        grafo.newVertice("4");
        grafo.conectar("1", "2");
        grafo.conectar("1", "3");
        grafo.conectar("3", "2");
        grafo.conectar("3", "1");
        System.out.println(grafo);
    }
}
