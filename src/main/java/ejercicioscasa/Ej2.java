/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscasa;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        //Ponemos la el escanner que nos permita introducir una variable por teclado
        Scanner teclado = new Scanner(System.in);
        //Declaramos las variables int necesarias
        int n, x;
        //Imprimimos por consola un mensaje que nos pide introducir el valor de n
        System.out.println("Ingrese el valor final:");
        //Inicializamos n con el valor introducido
        n = teclado.nextInt();
        //Inicializamos la variable x
        x = 1;
        //Utilizamos el bucle while para que se vaya sumando 1 a x hasta que los valores de x y n sean iguales
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

    }

}
