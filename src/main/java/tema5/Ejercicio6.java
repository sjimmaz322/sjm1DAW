package tema5;

import java.util.Arrays;

/**
 * Hacer un programa que determine si dos arrays son iguales. Probarlo con los
 * arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. Este
 * ejercicio hay que hacerlo de dos formas: la primera, usando la clase Arrays;
 * la segunda, creando un método que vaya comparando los valores de los arrays y
 * devuelva true si todos son iguales o false en caso contrario.
 *
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 2};
        int[] array4 = {1, 2, 3};

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1, array3));
        System.out.println(Arrays.equals(array1, array4));
        System.out.println(" ");
        System.out.println(MetodosArrays.compararArrays(array1, array2));
        System.out.println(MetodosArrays.compararArrays(array1, array3));
        System.out.println(MetodosArrays.compararArrays(array1, array4));
        System.out.println(" ");
        
    }

}
