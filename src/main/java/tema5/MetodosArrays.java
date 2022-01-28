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
        if (valor < 0) {
            return "El número no se encuentra en el array";
        }
        return "El número está en el Array en la posición " + valor;
    }
   
    public static void ordenarArrayBubble(int[] a){
        int tmp, j;
        for (int i = 0; i < a.length-1; i++){
		for (j = i+1; j < a.length; j++){
			if (a[i] > a[j]){
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
	}
        
    }
    public static int[] multiplicarArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
        return arr3;
    }

}
