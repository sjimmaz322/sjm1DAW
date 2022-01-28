/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que lea de la entrada un número y utilice ese número para crear un array de enteros de ese tamaño.
* A continuación, el programa inicializa el array con los valores que el usuario introduzca por teclado. 
* Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como indique el valor de cada elemento del array. 
* Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:
 */
public class Ejercicio8 {

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

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca el número que desea que ocupe la posición " + i);
            array1[i] = sc.nextInt();

        }

        for (int i = 0; i < array1.length; i++) {
            int valor = array1[i];
            for (int j = valor - 1; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("\n");

        }
    }

}
