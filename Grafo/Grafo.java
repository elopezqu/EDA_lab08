package Grafo;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Node> cabezas;

    public Grafo() {
        cabezas = new ArrayList<Node>();
    }

    public int buscarIndex(String nombre) {
        for (int i = 0; i < cabezas.size(); i++) {
            if (cabezas.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void newVertice(String nombre) {
        if (buscarIndex(nombre) == -1) {
            cabezas.add(new Node(nombre));
        }
    }

    public void conectar(String inicio, String llegada) {
        if (!cabezas.get(buscarIndex(inicio)).getAdya().contains(buscarIndex(llegada))) {
            cabezas.get(buscarIndex(inicio)).setAdya(buscarIndex(llegada));;
        }
    }
    public String toString(){
        String aux = "";
        for(Node node : cabezas){
            aux += "Vertice: "+node.getNombre();
            for(int index : node.getAdya()){
                aux += " ---> "+ cabezas.get(index).getNombre();
            }
            aux += "\n";
        }
        return aux;
    }

}
