package tema5;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio23 {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        
        Random rd = new Random();
        int tamanio = rd.nextInt(15-5+1)+5;
        
        for (int i = 0; i < tamanio; i++) {
            Integer aux = rd.nextInt(100-50+1)+50 ;
            lista1.add(aux);
               
    }
    for (Integer tmp : lista1) {//forEach para ver todos los sitios
            System.out.print(tmp + " - ");
        }
}
}
