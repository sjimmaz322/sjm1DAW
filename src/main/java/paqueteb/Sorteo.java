package paqueteb;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sorteo {

    public static void main(String[] args) {
        Random rd = new Random();
        Decimo listado = new Decimo();
        String numDecimo;

        //Rellenamos el sorteo con 1000 numeros con 1000 premios
        for (int i = 0; i < 1000; i++) {
             numDecimo = "";
            for (int j = 0; j < 5; j++) {
                numDecimo += rd.nextInt(10);
            }
            listado.aniadeBoletoPremiado(numDecimo, rd.nextInt(1000000) + 1);

        }

        //Añadido numero para hacer comprobación de mensaje de premio
        //listado.aniadeBoletoPremiado("12345", 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué número desea comprobar?");
        String numComprobar = sc.nextLine();

        if (listado.consultarDecimo(numComprobar) != null) {
            System.out.println("El premio del número " + numComprobar + " es " + listado.consultarDecimo(numComprobar) + "€");
        } else {
            System.out.println(numComprobar + " no premiado");
        }
        //Método para imprimir todos los boletos con sus premios
//        listado.imprimirTodo();
    }
}
