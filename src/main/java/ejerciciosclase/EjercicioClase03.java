package ejerciciosclase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioClase03 {

    public static void main(String[] args) {

        int numero1 = 1, numero2 = 1, division = 0;

        Scanner teclado = new Scanner(System.in);

        boolean seguir = true;

        do {
            try {

                System.out.println("Introduce el primer número: ");
                numero1 = teclado.nextInt();

                System.out.println("Introduce el segundo número: ");
                numero2 = teclado.nextInt();

                division = numero1 / numero2;

                seguir = false;

            } catch (InputMismatchException ime) {

                System.out.println("Números, no letras por favor. "
                        + "Introduce solo números");
                teclado.nextLine();

            } catch (ArithmeticException ae) {
                System.out.println("No se puede dividir por cero");
            }

        } while (seguir);

        System.out.println("Resultado: " + division);

    }

}
