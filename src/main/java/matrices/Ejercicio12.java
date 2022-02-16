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

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("El valor de "+i+"-"+j+" es "+matriz[i][j]);
            }
        }

    }

}
