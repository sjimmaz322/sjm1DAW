package tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        /*
        Escribir un programa que lea del teclado el tamaño de dos arrays de enteros (el mismo tamaño para los dos arrays).
        El programa inicializará los arrays con números aleatorios entre 1 y 100.
        Existirá un método llamado multiplicar que recibirá los dos arrays e irá multiplicando los elementos dos a dos,
        empezando por los elementos que ocupan la posición cero, luego la uno, etc, guardando el resultado en otro array,
        que será devuelto por el método. Además existirá un método para imprimir por pantalla los valores de los arrays.
         */

        boolean repetir = true;
        int longitud = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        do {
            System.out.println("Introduzca la longitud de los Arrays");
            try {
                longitud = sc.nextInt();
                if (longitud < 0) {
                    longitud = Math.abs(longitud);
                }
                repetir = false;
                if (longitud == 0) {
                    System.out.println("Un Array no puede tener un tamaño de cero");
                    repetir = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Valor introducido no válido, inténtelo de nuevo");
                repetir = true;
                sc.nextLine();
            }
        } while (repetir);

        int[] arr1 = new int[longitud];
        int[] arr2 = new int[longitud];

        

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100) + 1;
        }
        
        System.out.println("Mostramos el Array 1");
        mostrarArray(arr1);
        System.out.println(" ");
        System.out.println("Mostramos el Array 2");
        mostrarArray(arr2);
        System.out.println(" ");
        System.out.println("La multiplicación de ambos Array sería");
        mostrarArray(multiplicar(arr1, arr2));
        
    }

    private static int[] multiplicar(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
        return arr3;
    }
    
   private static void mostrarArray(int[] aux){
       for (int i = 0; i < aux.length; i++) {
           System.out.println("La posición "+i+" del Array es "+aux[i]);
       }
   }
   private static int[] rellenarArray(int[] aux){
       int []
       for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(100) + 1;
        }
   }

}
