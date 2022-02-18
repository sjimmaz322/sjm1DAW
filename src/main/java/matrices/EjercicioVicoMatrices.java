package matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioVicoMatrices {

    /*
    Crear matriz n x m
    Crear método recorrerFila
    Crear método recorrerColumna
    Crear método recorrerVecina (doble bucle for)

     */
    public static void main(String[] args) {

        int[][] matriz = new int[2][3];

        Matrices.rellenarMatrizIntRandomRango(matriz, 10, 1);

        Matrices.mostrarMatrizInt(matriz);

        Matrices.recorrerFila(matriz);

        Matrices.recorrerColumna(matriz);

        int minimo = Matrices.valorMinimo(matriz);
        int maximo = Matrices.valorMaximo(matriz);

        System.out.println(" ");
        System.out.println("La matriz tiene una celda con el valor mínimo de " + minimo + " y una celda con el valor máximo de " + maximo);
    }

}
