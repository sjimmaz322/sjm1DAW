package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrices {

    Random rd = new Random();
        
    public static int[][] crearMatriz(){
        int fila = 0, columna = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas filas desea que tenga su matriz?");
        fila = sc.nextInt();
        System.out.println("¿Cuántas columnas desea que tenga su matriz?");
        columna = sc.nextInt();
        
        int[][] aux = new int[fila][columna];
        
        return aux;
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
                String ocupacion = matriz[i][j] ? "La celda está libre" : "La celda está ocupada";
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

    public static void rellenarMatrizIntRandomRango(int[][] aux, int max, int min) {
        Random rd = new Random();

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j] = rd.nextInt(max - min + 1) + min;
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

    public static double calcularMediaValoresMatriz(int[][] aux) {
        double resultado = 0;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                resultado += aux[i][j];
            }
            resultado = resultado / aux.length*aux[i].length;
        }

        return resultado;
    }

    public static int valorMinimo(int[][] aux) {
        int minimo = 100;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                if (minimo > aux[i][j]) {
                    minimo = aux[i][j];
                }

            }

        }

        return minimo;
    }

    public static int valorMaximo(int[][] aux) {
        int maximo = 0;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                if (maximo < aux[i][j]) {
                    maximo = aux[i][j];
                }

            }

        }

        return maximo;
    }

    public static void recorrerFila(int[][] aux) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.println("¿Qué fila desea consultar?");
        try {
            x = sc.nextInt();

            if (x < aux[x].length && x >= 0) {
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

            if (x < aux.length && x >= 0) {
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

    public static void mostrarVecinos(int[][] aux) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De qué fila desea conocer las vecinas?");
        int fila = sc.nextInt();
        System.out.println("¿De qué columna desea conocer las vecinas?");
        int columna = sc.nextInt();

        if (fila < aux.length && fila >= 0) {

            if (columna < aux[0].length && columna >= 0) {
                System.out.println("Las vecinas de la celda " + fila + "-" + columna);
                for (int i = fila - 1; i <= fila + 1; i++) {
                    if (i < aux.length && i >= 0) {
                        for (int j = columna - 1; j <= columna + 1; j++) {
                            if (j < aux[i].length && j >= 0) {
                                if (!(i == fila && j == columna)) {
                                    System.out.println("La celda " + i + "-" + j + " " + aux[i][j]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
