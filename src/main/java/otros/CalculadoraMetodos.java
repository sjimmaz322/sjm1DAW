package otros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMetodos {
    
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
    
    private static int multiplicar(int a, int b){
        int multipli = a*b;
        return multipli;
    }
    
    private static int dividir (int a, int b){
        int divition = a/b;
        return divition;
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
        
        Scanner sc = new Scanner(System.in); // Clase Scanner
        //Definición e inicialización de variables necesarias
        int operando1 = 0, operando2 = 0;
        boolean solicitarDatos = true;
        int resultado = 0;
        

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
        } while (!((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)));
        
        String option = "";
        do{
            mostrarMenu();
            option = sc.nextLine();
        } while (!option.equals("0"));
    }

}
