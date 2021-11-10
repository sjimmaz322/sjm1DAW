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

        Scanner sc = new Scanner(System.in); // Clase Scanner
        //Definición e inicialización de variables necesarias
        int operando1 = 0, operando2 = 0, select = 0;
        boolean solicitarDatos = true, solicitarDatosMenu = true;
        int suma, resta, multiplication;
        double division = 0;

        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Introduce dos operandos enteros entre -100 y 100");

        do {
            System.out.println("Introduce dos operandos enteros entre -100 y 100");
            do {
                try {
                    solicitarDatos = true;
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
                    sc.nextLine();
                }
            } while (solicitarDatos);//Condición de repetición del error
        } while (!((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100))); //Condición de repeticición de rango incorrecto
        do {
            do {
                do {
                    try {//Bloque candidato a error
                        System.out.println("Elija la operación que desea calcular");
                        System.out.println("1 para sumar");
                        System.out.println("2 para restar");
                        System.out.println("3 para multiplicar");
                        System.out.println("4 para dividir");
                        System.out.println("0 para cancelar");
                        select = sc.nextInt();
                        solicitarDatosMenu = false;

                    } catch (InputMismatchException ime) {//Mensaje de error
                        System.out.println("Introduciendo letras en vez de número otra vez... inténtalo de nuevo");
                        sc.nextLine();
                    }
                } while (solicitarDatosMenu);//Condición de repetición por error
            } while (!((select == 1) || (select == 2) || (select == 3) || (select == 4) || (select == 0)));//Condición de repetición por elección fuera de opciones

            switch (select) {
                case 1:
                    System.out.println("Ha elegido sumar ambos operandos");
                    suma = operando1 + operando2;
                    System.out.println("El resultado es: " + suma);
                    break;
                case 2:
                    System.out.println("Ha elegido restar ambos operandos");
                    resta = operando1 - operando2;
                    System.out.println("El resultado es: " + resta);
                    break;
                case 3:
                    System.out.println("Ha decidido multiplicar ambos operandos");
                    multiplication = operando1 * operando2;
                    System.out.println("El resultado es: " + multiplication);
                    break;
                case 4:
                    System.out.println("Ha decidido dividir ambos operandos");
                    try {//Bloque candidato a lanzar excepción
                        division = (double) operando1 / (double) operando2;
                        System.out.println("El resultado es: " + division);
                    } catch (ArithmeticException ae) {//Mensaje de error
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 0:
                    System.out.println("Ha decidido sabiamente, cerrando el programa...");
                    break;
            }
        } while (select != 0);//Condición para finalizar el programa
    }

}
