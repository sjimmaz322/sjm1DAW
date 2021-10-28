
package ejercicioscasa;

import java.util.Random;
     
public class ClaseRandom {

   
    public static void main(String[] args) {
    Random numAleatorio = new Random();
    int n =numAleatorio.nextInt(50) +1;
        System.out.println(n);
    }
    
}
