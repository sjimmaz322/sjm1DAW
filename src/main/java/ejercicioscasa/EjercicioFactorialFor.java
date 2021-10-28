
package ejercicioscasa;

import java.util.Scanner;
public class EjercicioFactorialFor {

  
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el numero al cual quieras calcuar el factorial");
        int n = entradaTeclado.nextInt();
        int i, factorial=1;
        for (i =1; i<=n; i++ ){
            factorial=factorial*i;
        }
        System.out.println("El factorial de :" + n + " es: " + factorial);
    }
    }
    

