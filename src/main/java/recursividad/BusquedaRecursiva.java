package recursividad;

public class BusquedaRecursiva {

    public static void main(String[] args) {

        //Búsqueda secuencial en una lista
    }

    public static int buscarElemento(int[] lista, int elemento, int i) {
        if ((i == lista.length) || (lista[i] == elemento)) {
            if (i == lista.length) {
                return -1;
            } else {
                return i;
            }
        } else {
            return buscarElemento(lista, elemento, i + 1);
        }
    }

}
