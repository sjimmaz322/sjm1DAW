package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        /*
        Implementa un programa que lea un String, lo pase a minúscula,
        lo introduzca en un array de caracteres y ordene dicho array siguiendo el orden Unicode (a<b<c<d...).
        */
        
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        System.out.println("Introduce tu texto");
        cadena = sc.nextLine();
        
        System.out.println(cadena);
        System.out.println(" ");
        
        cadena = cadena.toLowerCase();
        
        char[] textoArray = cadena.toCharArray();
        
        Arrays.sort(textoArray);
        
        System.out.println(textoArray);
        
    }

}
