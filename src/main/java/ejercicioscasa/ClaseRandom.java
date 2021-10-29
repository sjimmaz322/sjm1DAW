
package ejercicioscasa;

import java.util.Random;
     
public class ClaseRandom {

   
    public static void main(String[] args) {
    Random numAleatorio = new Random();
    int n;
    do {
    n =numAleatorio.nextInt(20) +1;
        System.out.print(n);
        System.out.print(" - ");
    }while (n!=12);
    }
    
}
