/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author samjimmaz
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numbers = new int[10];

    }

    private void rellenarArray(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduzca el entero que desea guardar en la posición " + i);
            numbers[i] = sc.nextInt();

        }
    }

    private int contadorPositivos(int[] numbers) {
        int contador = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    private int contadorNegativos(int[] numbers) {
        int contador = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    private int contadorCeros(int[] numbers) {
        int contador = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                contador++;
            }
        }
        return contador;
    }
}
