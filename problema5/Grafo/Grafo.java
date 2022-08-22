
import java.util.ArrayList;

public class Grafo {
    private ArrayList<Node> cabezas;

    public Grafo() {
        cabezas = new ArrayList<Node>();
    }

    public ArrayList<Node> getArray() {
        ArrayList<Node> aux = cabezas;
        return aux;
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
            cabezas.get(buscarIndex(inicio)).setAdya(buscarIndex(llegada));
            ;
        }
    }

    public String toString() {
        String aux = "";
        for (Node node : cabezas) {
            aux += "Vertice: " + node.getNombre();
            for (int index : node.getAdya()) {
                aux += " ---> " + cabezas.get(index).getNombre();
            }
            aux += "\n";
        }
        return aux;
    }

    public boolean isIncluded(Grafo a, Grafo b) {

        boolean result = true; // valor a retonar, true ==> b esta incluido o false ==> b no esta incluido

        for (Node nod : b.getArray()) { // iteramos sobre el b para ir comparando con el grafo a
            if (a.buscarIndex(nod.getNombre()) == -1) { // Condicion para ver si b contiene algun nodo extra del original, y rompe el ciclo para retornar false
                result = false;
                break;
            } else { // En caso de que si este va a comparar entre sus conexiones
                int cont = 0;
                if (nod.getAdya().size() == 0) { // Este if es para verificar si el nodo no tiene ningun enlace y si es asi retorna false
                    for (Node aux : b.getArray()) {
                        for (int auxNum : aux.getAdya()) {
                            if (b.getArray().get(auxNum).getNombre().equals(nod.getNombre())) {
                                cont++;
                            }
                        }
                    }
                    if (cont == 0) {
                        result = false;
                        return result;
                    }
                }

                // Continuamos con estos 2 ArrayList para guardas los enlaces y compararlos,
                // para evitar el error de f--->e y el otro e--->f, que al final serian lo mismo
                ArrayList<String> aux1 = new ArrayList<>();
                ArrayList<String> aux2 = new ArrayList<>();

                // Aqui guarda los valores
                for (int index : nod.getAdya()) {
                    aux2.add(b.getArray().get(index).getNombre());
                }
                for (int index : a.getArray().get(a.buscarIndex(nod.getNombre())).getAdya()) {
                    aux1.add(a.getArray().get(index).getNombre());
                }

                // Para que este incluido el nodo debe de tener igual o menos conexiones, nunca
                // mas que la original
                if (aux2.size() > aux1.size()) {
                    result = false;
                    break;
                }

                // AQUI COMPARA las conexiones
                boolean bandera = false;
                for (int i = 0; i < aux2.size(); i++) {

                    for (int j = 0; j < aux1.size(); j++) {
                        if (aux2.get(i).equals(aux1.get(j))) {
                            bandera = true; // Al hacer match cambio el valor de bandera a true
                            break;
                        }
                    }

                    if (bandera) {
                        bandera = false; // Si es true, continua normal
                    } else {
                        result = false; // pero si nunca hizo match significa que tiene un nodo que no esta en la original, y retorna false
                        break;
                    }
                }

                if (result == false) { // Este es if es para romper todo, si ya se sabe que no esta incluido
                    break;
                }

            }
        }
        return result;
    }

}
