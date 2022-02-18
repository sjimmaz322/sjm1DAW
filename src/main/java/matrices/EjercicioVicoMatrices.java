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

        EjercicioVicoMatrices.recorrerFila(matriz);

        EjercicioVicoMatrices.recorrerColumna(matriz);

    }

    public static void recorrerFila(int[][] aux) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.println("¿Qué fila desea consultar?");
        try {
            x = sc.nextInt();

            if (x <= aux[x].length && x >= 0) {
                System.out.println("La fila " + x);
                for (int i = 0; i < aux[x].length; i++) {
                    System.out.println("La celda " + x + "-" + i + " contiene un " + aux[x][i]);
                }
            } else {
                System.out.println("Ha elegido un valor incorrecto");
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Ha elegido un valor fuera de límites");
        }

    }

    public static void recorrerColumna(int[][] aux) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.println("¿Qué columna desea consultar?");
        try {
            x = sc.nextInt();

            if (x <= aux.length && x >= 0) {
                System.out.println("La columna " + x);
                for (int i = 0; i < aux.length; i++) {
                    System.out.println("La celda " + i + "-" + x + " contiene un " + aux[i][x]);
                }
            } else {
                System.out.println("Ha elegido un valor fuera de límites");
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Ha elegido un valor fuera de límites");
        }

    }
}
