package pootema4;

import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    /*
    Quiero una clase llamada Utilidades, sin atributos, con dos métodos: generarAleatorios
    en un rango dado y leerEnteros con Scanner. Luego probar en un main ambos métodos creando un objeto de la clase Utilidades
     */
    public static int generarAleatorio(int numMax, int nunMin) {

        Random numAleatorio = new Random();
        int numRandom = numAleatorio.nextInt(100)+1;
        return numRandom;
    }
    public static int leeEnteros(){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        return num;
    }
}
