package tema5;

import java.util.Random;

public class LanzarMoneda {

    /*
    Escribe una clase LanzarMoneda que tenga como único atributo un array de booleanos de tamaño 1000.
    La clase tendrá los siguientes métodos: 
    a) un método para rellenar el array, de forma que simule 1000 lanzamientos de una moneda.
    El método debe almacenar el resultado de cada tirada en el array. 
    b) un método para saber cuántas “caras” salieron después de los lanzamientos.
    c) un método para saber cuántas “cruces” salieron después de los lanzamientos.
    d) un método para imprimir el resultado de los 1000 lanzamientos, de forma que aparezca
    el número de lanzamiento y el resultado (cara o cruz)
    */
    
    private static boolean[] moneda = new boolean[1000];

    public static void rellenarArray(boolean[] a){
         Random rd = new Random();
         for (int i = 0; i < moneda.length; i++) {
            moneda[i] = rd.nextBoolean();
            
        }
    }
    public static int caras(boolean[] a){
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            if(moneda[i]){
                contador++;
            }
            
        }
        return (contador);
    }
    public static int cruces(boolean[] a){
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            if(!moneda[i]){
                contador++;
            }
            
        }
        return (contador);
    }
}
