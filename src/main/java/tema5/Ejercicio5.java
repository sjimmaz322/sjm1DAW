package tema5;

import java.util.Scanner;

public class Ejercicio5 {

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

    private void mostrarArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("El valor de la posición " + i + " del Array es " + numbers[i]);
        }
    }

    private int mediaPositivos(int[] numbers) {
        int media = 0;
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                suma += numbers[i];
            }
        }
        media = suma / numbers.length;
        return media;
    }

    private int mediaNegativos(int[] numbers) {
        int media = 0;
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                suma -= numbers[i];
            }
        }
        media = suma / numbers.length;
        return media;
    }
}
