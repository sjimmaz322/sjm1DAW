package tema5;

import com.sun.source.doctree.SummaryTree;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {

//      Puede ser int num [] o int [] num, pero la segunda forma es más normalizada.
        int[] num = new int[10];
//      Cambiamos el valor del index 1 que predeterminado vale 0.
        num[0] = 1;
//      Array de String
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

//      Ejercicio 1 UdT5
        int[] number = {1, 2, 3, 4, 5, 6};
        int sumatorio = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("La posición "+i+" del Array es "+number[i]);
            sumatorio = sumatorio + number[i];
            
        }
        
        System.out.println("La suma de los valores del Array es : " +sumatorio);

//      Ejercicio 2 UdT5
        /*
        Escribe un programa para leer la altura de un número determinado de personas y calcular la altura media.
        El número de personas se pide por teclado y debe ser entero un entero mayor que cero. 
        Posteriormente el programa irá pidiendo la altura, en cm, de cada una de las personas y
        las guardará en una estructura de almacenamiento. Si la altura leída no es positiva, el programa la pasará a número positivo.
        También es necesario saber cuántas personas tienen una altura superior a la media e inferior a la media.
         */
        boolean seguir = true;
        int numPersonas = 0;
        int suma = 0;
        int media = 0;
        int contadorGenteAlta = 0;
        int contadorGenteBaja = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("¿De cuantas personas vamos a tomar los datos?");
            try {
                numPersonas = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Un número de personas debe ser un número");
                seguir = false;
            }
            if (numPersonas > 0) {
                seguir = true;
            } else {
                System.out.println("Introduzca un número mayor de 0");
                seguir = false;
                sc.nextLine();
            }
        } while (!seguir);

        int[] gente = new int[numPersonas];

        for (int i = 0; i < gente.length; i++) {
            System.out.println("Introduce la altura en cms de la persona " + (i + 1));

            try {
                gente[i] = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número");
            }

            if (i < 0) {
                i = Math.abs(i);
            }
            suma = suma + gente[i];

        }

        System.out.println("La media de las alturas es de " + (suma / gente.length) + " cms");

    }

}
