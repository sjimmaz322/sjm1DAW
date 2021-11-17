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
        int num1, num2, num3, num4, numIntentos = 1;
        char letra;
        boolean repetition;
        do {
            num1 = randomNumber();
            num2 = randomNumber();
            num3 = randomNumber();
            num4 = randomNumber();

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
            

            letra = randomChar();

            System.out.println(letra);
            System.out.println(" ");
            
            repetition = numRepetidos(num1, num2, num3, num4);
            
            if (((num1 + num4) % 2 == 0) || ((num2 * num3) % 2 != 0) || repetition==true){
                System.out.println("Contraseña "+num1+num2+num3+num4+letra+" No Válida");
                System.out.println("Intentando de nuevo");
                System.out.println(" ");
                numIntentos++;
            }
            
        } while (((num1 + num4) % 2 == 0) || ((num2 * num3) % 2 != 0) || repetition==true);
        System.out.println("Contraseña "+num1+num2+num3+num4+letra+" Válida");
        System.out.println("Se han generado en total: " + numIntentos + " contraseñas");
    }

    private static int randomNumber() {
        Random numRandom = new Random();
        int numR = numRandom.nextInt(10);
        return (numR);
    }

    private static char randomChar() {
        Random charRandom = new Random();

        int numChar = charRandom.nextInt(88 - 70 + 1) + 70;
        char charR = (char) numChar;

        return charR;
    }
    private static boolean numRepetidos(int num1, int num2, int num3, int num4){    
    if ((num1==num2)||(num1==num3)||(num1==num4)||(num2==num3)||(num2==num4)||(num3==num4)){
        return true;
    } else {
        return false;
    }
    }
}
