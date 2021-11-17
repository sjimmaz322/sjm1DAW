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
        num1 = randomNumber();
        num2 = randomNumber();
        num3 = randomNumber();
        num4 = randomNumber();
        
    }
    private static int randomNumber(){
        Random numRandom = new Random(10);
        int numR = numRandom.nextInt();
        return numR;
    }
}
