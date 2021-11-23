package pootema4;

import java.util.Random;

public class Utilidades {

    /*
    Quiero una clase llamada Utilidades, sin atributos, con dos métodos: generarAleatorios
    en un rango dado y leer Enteros con Scanner. Luego probar en un main ambos métodos creando un objeto de la clase Utilidades
     */
    public static int generarAleatorio(int numMax, int nunMin) {

        Random numAleatorio = new Random();
        int numRandom = numAleatorio.nextInt();
        return numRandom;
    }
}
