package pootema4;

import static pootema4.Utilidades.generarAleatorio;
import static pootema4.Utilidades.leerEnteros;

public class PruebaUtilidades {

    public static void main(String[] args) {
       
        
        int num, num2;
        num = generarAleatorio();
        System.out.println(num);
        
        System.out.println("Introduce un número");
        num2 = leerEnteros();
        System.out.println(num2);
    }

}
