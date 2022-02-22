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

        int [][] matriz = Matrices.crearMatriz();
        
        Matrices.rellenarMatrizIntRandomRango(matriz, 10, 1);

        Matrices.mostrarMatrizInt(matriz);

        Matrices.recorrerFila(matriz);

        Matrices.recorrerColumna(matriz);
        
        Matrices.mostrarVecinos(matriz);
        
    }

}
