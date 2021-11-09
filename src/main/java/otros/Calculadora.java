package otros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Scanner
        // Mostrar menú opciones
        // Filtramos entrada de usuario
        // Controlar las excepciones ante error de usuario
        // Cuatro opciones: Sumar, restar, multiplicar y dividir.

        Scanner sc = new Scanner(System.in);
        int operando1 = 0, operando2 = 0;
        boolean solicitarDatos = true;

        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Introduce dos operandos entre -100 y 100");

        do {
            System.out.println("Introduce dos perandos entre -100 y 100");
            do {
                try {
                    // Bloque candidato a lanzar excepción    
                    System.out.println("Introduce operando 1:");
                    operando1 = sc.nextInt();

                    System.out.println("Introduce operando 2:");
                    operando2 = sc.nextInt();

                    solicitarDatos = false;

                } catch (InputMismatchException ime) {
                    // Código para tratar el error    
                    System.out.println("Se ha introducido texto en lugar de números. "
                            + "Vuelva a introducir los datos.");
                    sc.next();
                }
            } while (solicitarDatos);
        } while ((operando1 > -100 || operando1 < 100) && (operando2 > -100 || operando2 < 100));

    }

}
