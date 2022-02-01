package tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        /*
        13,15,16,17
        Escribir un programa que lea números enteros entre 1 y 20 desde teclado. Se debe generar un histograma con las frecuencias
        de cada entero en la secuencia.  Para representar las barras del histograma hay que utilizar secuencias del carácter ‘*’.
        El programa finaliza al introducir un cero.
        Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3 generaría la siguiente salida:
         */
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int array[] = new int[20];
        boolean repetir = true;
        do {//Bucle para que el programa se repita hasta que se pulse 0
            do{//Bucle para que se repita cuando se introduzca mal un valor
                //Limpieza de buffer
            System.out.println("\nIntroduzca el número que desea\n 0 para finalizar\n");
            try {
                num = sc.nextInt();
                if (num >= 1 && num<=20){
                    repetir = false;    
                }else{
                    System.out.println("Introduza un numero entre 1 y 20");
                    repetir = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Introduza un número entre 1 y 20");
                sc.nextLine();
            }
            }while (repetir);
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }

        } while ((num != 0));

    }
    
}
