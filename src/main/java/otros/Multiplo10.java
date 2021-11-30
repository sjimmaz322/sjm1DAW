package otros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplo10 {

    public static void main(String[] args) {
        final int BASE_MULTIPLO = 10;
        double num = 0; 
        int resto;
        boolean seguir = false;
        Scanner sc = new Scanner(System.in);
  
        do {
            System.out.println(" ");
            System.out.println("Introduzca el número a comprobar");
            System.out.println(" ");

            try {
                num = sc.nextDouble();
                seguir = true;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un carácter alfabético, introduzca un número");
                sc.nextLine();
            }

        } while (!seguir);
        resto = (int)(num % BASE_MULTIPLO);
        if (resto == 0) {
            System.out.println("El número " + num + " es múltiplo de 10 ya que su resto al dividir por 10 es " + resto);
        } else {
            System.out.println("El número " + num + " no es múltiplo de 10 ya que su resto al dividir por 10 es " + resto);
        }
        System.out.println(" ");
        System.out.println("Gracias por utilizar mi programa");
        System.out.println("Espero que haya cumplido sus espectativas");
    }
}
