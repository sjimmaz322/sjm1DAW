package ejercicioscasa;

import java.util.Random;

public class Ej4 {

    /*
Crear contraseñas aleatorias que cumplan las siguientes restricciones:
- 4 números entre 0 y 9 distintos
- La suma de los dígitos 1 y 4 debe ser impar
- La multiplicación de las digitos 2 y 3 debe ser par
- Añadirá una letra aleatoria entre F y X (Mayúsculas).
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        char letra;
        do {
        num1 = randomNumber();
        num2 = randomNumber();
        num3 = randomNumber();
        num4 = randomNumber();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(" - ");
        
        } while ( ((num1+num4)%2==0)||((num2*num3)%2!=0));
    }

    private static int randomNumber() {
        Random numRandom = new Random();
        int numR = numRandom.nextInt(10);
        return (numR);
    }
}
