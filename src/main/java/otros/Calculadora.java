package otros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    //Método suma. Solo se utiliza en la clase calculadora.
    //Lo declaro método privado.
    //Recibe dos parámetros y devuelve un entero con el resultado de la suma de ambos.
    private static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }
    //Método resta. Solo se utiliza en la clase calculadora.
    //Lo declaro método privado.
    //Recibe dos parámetros y devuelve un entero con el resultado de la resta de ambos.
    private static int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }
    //Método mostrarMenu. Solo se utiliza en calculadora.
    // Método privado, solo es usa en main.
    private static void mostrarMenu (){
            System.out.println("Elija la operación que desea calcular");
            System.out.println("1 para sumar");
            System.out.println("2 para restar");
            System.out.println("3 para multiplicar");
            System.out.println("4 para dividir");
            System.out.println("0 para cancelar");  
    }

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
        int resultado = 0;
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

//        do {
//            do {
//                do {
//                    try {//Bloque candidato a error
//                        solicitarDatosMenu = true;
//                        System.out.println("Elija la operación que desea calcular");
//                        System.out.println("1 para sumar");
//                        System.out.println("2 para restar");
//                        System.out.println("3 para multiplicar");
//                        System.out.println("4 para dividir");
//                        System.out.println("0 para cancelar");
//                        select = sc.nextInt();
//                        solicitarDatosMenu = false;
//
//                    } catch (InputMismatchException ime) {//Mensaje de error
//                        System.out.println("Introduciendo letras en vez de número otra vez... inténtalo de nuevo");
//                        sc.nextLine();
//                    }
//                } while (solicitarDatosMenu);//Condición de repetición por error
//            } while (!((select == 1) || (select == 2) || (select == 3) || (select == 4) || (select == 0)));//Condición de repetición por elección fuera de opciones
//
//            switch (select) {
//                case 1:
//                    System.out.println("Ha elegido sumar ambos operandos");
//                    suma = operando1 + operando2;
//                    System.out.println("El resultado es: " + suma);
//                    break;
//                case 2:
//                    System.out.println("Ha elegido restar ambos operandos");
//                    resta = operando1 - operando2;
//                    System.out.println("El resultado es: " + resta);
//                    break;
//                case 3:
//                    System.out.println("Ha decidido multiplicar ambos operandos");
//                    multiplication = operando1 * operando2;
//                    System.out.println("El resultado es: " + multiplication);
//                    break;
//                case 4:
//                    System.out.println("Ha decidido dividir ambos operandos");
//                    try {//Bloque candidato a lanzar excepción
//                        division = (double) operando1 / (double) operando2;
//                        System.out.println("El resultado es: " + division);
//                    } catch (ArithmeticException ae) {//Mensaje de error
//                        System.out.println("No se puede dividir por cero");
//                    }
//                    break;
//                case 0:
//                    System.out.println("Ha decidido sabiamente, cerrando el programa...");
//                    break;
//            }
//        } while (select != 0);//Condición para finalizar el programa
        sc.nextLine();
        String option = "";
        do {
            mostrarMenu();
            option = sc.nextLine();

            switch (option) {
                case "1":
                    resultado = sumar(operando1, operando2);
                    break;
                case "2":
                    resultado = restar(operando1, operando2);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }
            System.out.println("El resultado es: " + resultado);
        } while (!option.equals("0"));
    }
/*
    Tareas:
    1- Adaptar el programa para multiplicar y dividir.
    2- Crear los métodos para multiplicar y dividir
    3- Método que pida un entero por teclado y devuelva el dato si es correcto.
    */
    
}
