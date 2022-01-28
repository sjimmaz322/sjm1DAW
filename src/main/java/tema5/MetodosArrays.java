package tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MetodosArrays {

    public static void mostrarArray(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.println("La posición " + i + " del Array es " + aux[i]);
        }
    }

    public static int[] rellenarArrayRandom(int[] aux, int rango) {
        Random rand = new Random();
        for (int i = 0; i < aux.length; i++) {
            aux[i] = rand.nextInt(rango);
        }return aux;
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

    public static void ordenarArrayBubble(int[] a) {
        int tmp, j;
        for (int i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
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

    public static boolean compararArrays(int[] a, int[] b) {

        if (a.length == b.length) {

            for (int i = 0; i < b.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }

            }
            return true;
        }
        return false;
    }

    public static int[] crearArrayFlexible() {//Sin testear
        Scanner sc = new Scanner(System.in);

        boolean repetir = true; //Variable para repetición de bucle

        //Declaramos e inicializamos la variable para obtener el tamaño de los arrays
        int tam = 0;
        //Bucle para repetir en caso de error al introducir dato
        do {
            System.out.println("Introduce el tamaño de Array deseado");
            try { //Comprobación de que se introduzca un número
                tam = sc.nextInt();
                if (tam < 0) {//En caso de valor negativo se convierte en positivo
                    tam = Math.abs(tam);
                }
                if (tam == 0) { //Si el numero introducido es cero se pide un número válido
                    System.out.println("El número no puede ser igual a cero");
                    repetir = true;
                }
                repetir = false;
            } catch (InputMismatchException ime) {//Lanzamiento de excepción y repetición del bucle
                System.out.println("Introduzca un número por favor");
                System.out.println(" ");
                sc.nextLine(); //Limpieza de memoria
                repetir = true;
            }
        } while (repetir);

        return new int[tam];
    }

    public static void rellenarArray(int[] a) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduzca el número que desea que ocupe la posición " + i);
            a[i] = sc.nextInt();

        }
    }
    
    public static int[] crearArrayFijo(int tam) {
        
        boolean repetir = true; //Variable para repetición de bucle

        do {
            try { //Comprobación de que se introduzca un número
                if (tam < 0) {//En caso de valor negativo se convierte en positivo
                    tam = Math.abs(tam);
                }
                if (tam == 0) { //Si el numero introducido es cero se pide un número válido
                    System.out.println("El número no puede ser igual a cero");
                    repetir = true;
                }
                repetir = false;
            } catch (InputMismatchException ime) {//Lanzamiento de excepción y repetición del bucle
                System.out.println("Introduzca un número por favor");
                System.out.println(" ");
                repetir = true;
            }
        } while (repetir);

        return new int[tam];
    }
}
