package matrices;

import java.util.Random;
import tema5.MetodosArrays;

/*
Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:
Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
Calcular la media de todos los valores
Calcular el valor mínimo y el máximo de todos los valores
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        int[][] matriz1 = new int[2][2];
        
        Matrices.rellenarMatrizIntRandom(matriz1);
        
        Matrices.mostrarMatrizInt(matriz1);
        
        double media = Matrices.calcularMediaValoresMatriz(matriz1);
        System.out.println(media);
    }



}
