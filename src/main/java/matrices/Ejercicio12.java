package matrices;

public class Ejercicio12 {

    /*
    Declara e inicializa una matriz de caracteres de 2x3, con los valores que tú quieras.
    Implementa un método, en la misma clase que el método main(), que reciba una matriz de caracteres
    y la imprima por consola.
     */
    public static void main(String[] args) {

        int[][] matriz = new int[3][2]; //Primer [] son las filas y el segundo [] son las columnas.

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        Matrices.mostrarMatrizInt(matriz);
        
        double media = Matrices.calcularMediaValoresMatriz(matriz);
        System.out.println("La media de los valores es: "+media);
        
        int minimo = Matrices.valorMinimo(matriz);
        System.out.println("El valor más pequeño de la matriz es: "+minimo);
        
        int maximo = Matrices.valorMaximo(matriz);
        System.out.println("El valor más grande de la matriz es: "+maximo);
    }

}
