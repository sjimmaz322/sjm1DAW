package matrices;

import java.util.Random;

public class Matrices {

    Random rd = new Random();
    private int[][] matrizInt;
    private boolean[][] matrizBoo;
    private int filas, columnas;
    private int relleno = rd.nextInt(10) + 1;

    public Matrices(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matrizInt = new int[filas][columnas];
    }
    

    public Matrices() {
        this.matrizInt = new int[this.relleno][this.relleno];
    }

    public Matrices(int filas) {
        this.filas = filas;
        this.matrizInt = new int[filas][filas];
    }

    public Random getRd() {
        return rd;
    }

    public int[][] getMatriz() {
        return matrizInt;
    }

    public void setMatriz(int[][] matriz) {
        this.matrizInt = matrizInt;
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

    public int getRelleno() {
        return relleno;
    }

    public void setRelleno(int relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Matrices{" + "rd=" + rd + ", matriz=" + matrizInt + ", filas=" + filas + ", columnas=" + columnas + ", relleno=" + relleno + '}';
    }

    public static void mostrarMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("El valor de " + i + "-" + j + " es " + matriz[i][j]);
            }
        }
    }

    public static void mostrarMatrizBoolean(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String ocupacion = matriz[i][j] ? "La celda está libre":"La celda está ocupada";
                System.out.println("El valor de " + i + "-" + j + " es " + ocupacion);
            }
        }
    }

    public static void rellenarMatrizIntRandom(int[][] aux) {
        Random rd = new Random();

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j] = rd.nextInt(100) + 1;
            }
        }
    }

    public static void rellenarMatrizBooleanRandom(boolean[][] aux) {
        Random rd = new Random();

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j] = rd.nextBoolean();
            }
        }
    }

}
