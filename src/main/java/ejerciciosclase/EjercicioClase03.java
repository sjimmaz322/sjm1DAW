package ejerciciosclase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioClase03 {

    public static void main(String[] args) {
            
        int numero1=1, numero2=1;
        
        Scanner teclado = new Scanner(System.in);
        
        boolean seguir = true;
        
        do {
        try{
            
        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        
        seguir = false;
        
        } catch(InputMismatchException ime){
            
            System.out.println("Números, no letras por favor. "+
                    "Introduce solo números");
            teclado.nextLine();
             
        } 
        } while (seguir);
        
        int division = numero1/numero2; 
        
        System.out.println("Resultado: " + division);
        
    }

}
