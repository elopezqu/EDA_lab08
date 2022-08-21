package Grafo;

import java.util.ArrayList;

public class Node {
    private String nombre;
    private ArrayList<Integer> adya;

    public Node(String nombre){
        this.nombre = nombre;
        this.adya = new ArrayList<Integer>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setAdya(int i){
        this.adya.add(i);
    }
    public ArrayList<Integer> getAdya(){
        return this.adya;
    }
}
