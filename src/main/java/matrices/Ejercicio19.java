package matrices;

public class Ejercicio19 {

    /*
    Crear un programa que mediante un menú permita reservar o cancelar asientos de un avión,
    así como mostrar qué asientos están ocupados y libres actualmente.
    El avión tendrá 25 filas de 4 asientos cada una.
     */
    public static void main(String[] args) {

        // Creamos la matriz avion
        // Avion[][] avion = new Avion[25][4];
        boolean[][] avion = new boolean[25][4];

        // Rellenamos los asiento con un boolean false para vacio y true para lleno.
        Matrices.rellenarMatrizBooleanRandom(avion);

        //Mostramos el avión (hay un método pero utilizo solo el código para que el mensaje no sea genérico)
        //Avion.mostrarAvion(avion);
        
        //Solicitamos un asiento
        Avion.solicitarAsiento(avion);
        
    }

}
