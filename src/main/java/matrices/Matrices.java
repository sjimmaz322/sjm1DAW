package matrices;

import java.util.Random;

public class Matrices {

    Random rd = new Random();
    private int[][] matriz;
    private int filas, columnas;
    private int relleno = rd.nextInt(10) + 1;

    public Matrices(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public Matrices() {
        this.matriz = new int[this.relleno][this.relleno];
    }

    public Matrices(int filas) {
        this.filas = filas;
        this.matriz = new int[filas][filas];
    }

    public Random getRd() {
        return rd;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
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
        return "Matrices{" + "rd=" + rd + ", matriz=" + matriz + ", filas=" + filas + ", columnas=" + columnas + ", relleno=" + relleno + '}';
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("El valor de " + i + "-" + j + " es " + matriz[i][j]);
            }
        }
    }

    public static void rellenarMatrizRandom(int[][] aux) {
        Random rd = new Random();

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j] = rd.nextInt(100) + 1;
            }
        }
    }

}
