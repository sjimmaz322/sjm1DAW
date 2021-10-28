
package ejercicioscasa;


public class Ej3 {

    
    public static void main(String[] args) {
       int x = 15;
// Usamos la potencia de 2 elevada a 24 ya que no podemos olvidar que el primer número es 15 por 2 elevado a 0, lo cual si hacemos
// a potencia de 25 estaríamos imprimiendo 26 número cuando piden 25
        while (x <= 15*Math.pow(2, 24)) {
            System.out.print(x);
            System.out.print(" - ");
            x = (x * 2);
        }
    }
    
}
