package tema5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Creamos objetos para las clases Scanner y Random
        Random numRandom = new Random();
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

        //Declaramos e inicializamos el array
        int[] array1 = new int[tam];

        //Rellenamos los arrays con el método para ello de la clase Ejercicio 4
        MetodosArrays.rellenarArray(array1);
        
        //Método para comprobar los números de Array y poder elegir el resultado
        MetodosArrays.mostrarArray(array1);
        
        System.out.println("Introduzca el número a buscar"); //Solicitamos el número a buscar
        int numBuscado = sc.nextInt();
        
        System.out.println(MetodosArrays.buscarNumero(array1, numBuscado));
        
        Arrays.binarySearch(array1, numBuscado);
        
        System.out.println("El número se encuentra en la posición "+  Arrays.binarySearch(array1, numBuscado));
        
    }
}



