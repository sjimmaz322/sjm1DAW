package tema5;

import java.util.Random;

public class MetodosArrays {

    public static void mostrarArray(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println("La posición " + i + " del Array es " + aux[i]);
        }
    }

    public static int[] rellenarArray(int[] aux) {
        Random rand = new Random();
        for (int i = 0; i < aux.length; i++) {
            aux[i] = rand.nextInt(100) + 1;
        }
        return aux;
    }

    public static String buscarNumero(int[] array, int buscado) {
        int valor = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscado) {
                valor = i;
            }
        }
        if (valor == -1) {
            return "El número no se encuentra en el array";
        }
        return "El número está en el Array en la posición " + valor;
    }

}
