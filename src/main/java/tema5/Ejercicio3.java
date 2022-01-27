package tema5;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        double[] arr1 = new double[20];
        double[] arr2;
        boolean iguales;
        
        //Rellenado del arr1
        Arrays.fill(arr1, 7.5);
        
        //Copia de arr1 en arr2
        arr2 = Arrays.copyOf(arr1, arr1.length);
        
        //Mostramos por consola ambos String
        System.out.println("Primer array: "+Arrays.toString(arr1));
        System.out.println("Segundo array: "+Arrays.toString(arr2));
        
        //Comparación
        iguales = Arrays.equals(arr1, arr2);
       
        //Muestra de resultado con operador ternario
        System.out.println(Arrays.equals(arr1, arr2)?"Son iguales":"No son iguales");
        //Creamos objeto random
        Random numRandom = new Random();
        //Creamos el número random
        int indice = numRandom.nextInt(arr1.length);
        //Cambiamos un lugar aleatorio de arr2
        arr2[indice] = 6.3;
        
        //Mostramos por consola ambos String
        System.out.println("Primer array: "+Arrays.toString(arr1));
        System.out.println("Segundo array: "+Arrays.toString(arr2));
        
        //Muestra de resultado con operador ternario
        System.out.println(Arrays.equals(arr1, arr2)?"Son iguales":"No son iguales");
    }
    
}
