package Grafo;

public class Arista {
    private int destino;
    // private double peso;

    public Arista(int destino) {
        this.destino = destino;
    }
    /*
    public Arco(int destino, double peso){
        this(destino);
        this.peso = peso;
    }
    */
    public int getDestino(){
        return this.destino;
    }
    /* 
    public double getPeso(){
        return this.peso;
    }
    */
    public boolean equals(Arista a){
        return this.destino==a.getDestino();
    }
}
