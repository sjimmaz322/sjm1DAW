package ejerciciosclase;

import java.util.Scanner;

public class EjercicioClase03 {

    public static void main(String[] args) {
            
        int numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        
        int division = numero1/numero2; 
        
        System.out.println("Resultado: " + division);
    }

}
