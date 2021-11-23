package otros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Apuntes {

    public static void main(String[] args) {
        /*
        Constructores se llaman IGUAL que la clase y no llevan nada más 
        Public Nombre (Parámetros)
        */
        int numero;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dame un número");
            numero = sc.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("No es un número");
        }
    }

}
