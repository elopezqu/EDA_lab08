package Grafo;

import java.util.LinkedList;

public class Node {
    private String nombre;
    private int index;
    private LinkedList<Arista> adya;

    public Node(String nombre){
        this.nombre = nombre;
        this.index = -1;
        this.adya = new LinkedList<Arista>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public boolean equals(Node n){
        return this.nombre.equals(n.getNombre());
    }
    public void setNode(int index){
        this.index = index;
    }
    public LinkedList<Arista> getAdaya(){
        return this.adya;
    }
    public String toString(){
        return this.nombre;
    }
}
