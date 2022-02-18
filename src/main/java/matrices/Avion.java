package matrices;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Avion {

    private boolean[][] avion;
    private int filas, columnas;

    public Avion(int filas, int columnas) {

        this.filas = filas;
        this.columnas = columnas;
        this.avion = new boolean[filas][columnas];
    }

    public boolean[][] getAvion() {
        return avion;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public static void rellenarAvionEntero(boolean[][] aux) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                boolean correcto = true;
                do {
                    correcto = true;
                    System.out.println("Introduzca el estado del asiento de la fila " + i + " asiento " + j + ".\n"
                            + "0 para que esté libre y 1 para reservarlo.");
                    String estado = sc.nextLine();
                    switch (estado) {
                        case "0":
                            aux[i][j] = true;
                            break;
                        case "1":
                            aux[i][j] = false;
                            break;
                        default:
                            System.out.println("Los valores válidos son 0 o 1.");
                            correcto = false;
                            break;

                    }
                } while (!correcto);

            }
        }

    }

    public static void solicitarAsiento(boolean[][] avion) {
        Scanner sc = new Scanner(System.in);
        boolean reservado = true;
        boolean correcto = true;
        int fila = 0;
        int columna = 0;

        do {
            do {
                correcto = true;
                System.out.println("Introduzca la fila en la que desea el asiento");
                try {
                    fila = sc.nextInt();
                    if (fila < 0 || fila > 24) {
                        System.out.println("Ha elegido una fila que no existe\nLas filas van entre la 0 y la 24");
                        correcto = false;
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Las filas van desde la 0 a la 24");
                    correcto = false;
                }

            } while (!correcto);
            do {
                correcto = true;
                System.out.println("Introduza el asiento que desea");
                try {
                    columna = sc.nextInt();
                    if (columna < 0 || columna > 3) {
                        System.out.println("Ha elegido un asiento que no existe\nLos asientos van desde el 0 al 3");
                        correcto = false;
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Los asientos van desde el 0 al 3");
                    correcto = false;
                }
            } while (!correcto);

            if (avion[fila][columna] == false) {
                avion[fila][columna] = true;
                reservado = false;
                System.out.println("Su asiento ha sido reservado");
            } else {
                System.out.println("El asiento ya estaba reservado\nPor favor elija otro");
                reservado = true;
            }

        } while (reservado);
    }

    public static void mostrarAvion(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String ocupacion = matriz[i][j] ? "está ocupado" : "está libre";
                System.out.println("El asiento de la fila " + i + " numero " + j + " " + ocupacion);
            }
        }
    }

}
