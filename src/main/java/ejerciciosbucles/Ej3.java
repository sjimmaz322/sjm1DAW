
package ejerciciosbucles;


public class Ej3 {

    
    public static void main(String[] args) {
       double x = 15;

        while (x <= 15*Math.pow(2, 24)) {
            System.out.print(x);
            System.out.print(" - ");
            x = (x * 2);
        }
    }
    
}
