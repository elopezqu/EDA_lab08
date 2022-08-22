

public class Test {
    public static void main(String[]args){
        Grafo grafo = new Grafo();
        Grafo b = new Grafo();
        //Agregar los nodos del grafo
        grafo.newVertice("a");
        grafo.newVertice("b");
        grafo.newVertice("c");
        grafo.newVertice("d");
        grafo.newVertice("e");
        grafo.newVertice("f");

        b.newVertice("f");
        b.newVertice("e");
        b.newVertice("c");
        //b.newVertice("e");
        //b.newVertice("f");
        //b.newVertice("e");
        //b.newVertice("h");

        /*
        grafo.newVertice("2");
        grafo.newVertice("3");
        grafo.newVertice("4");
        */
        //Indicar la direccion que tiene los nodos
        //grafo.conectar(nodo inicial, nodo final);
        grafo.conectar("a", "f");
        grafo.conectar("a", "e");
        grafo.conectar("b", "d");
        grafo.conectar("c", "b");
        grafo.conectar("c", "f");
        grafo.conectar("d", "a");
        grafo.conectar("e", "f");
        grafo.conectar("f", "c");
        grafo.conectar("f", "d");

        //b.conectar("f", "a");
        //b.conectar("a", "e");
        b.conectar("c", "f");
        b.conectar("e", "f");
        //b.conectar("a", "c");
        //b.conectar("f", "a");
        
        /* 
        grafo.conectar("1", "3");
        grafo.conectar("3", "2");
        grafo.conectar("3", "1");
        */
        //Se imprime el el grafo en forma de lista adyacente
        //System.out.println(grafo);


        System.out.println(grafo.isIncluded(grafo,b));

        
    }
}
