package paqueteb;

import java.util.Random;
import java.util.Scanner;

public class Sorteo {

    public static void main(String[] args) {
        Random rd = new Random();
        Decimo listado = new Decimo();

        String numDecimo;
        int premio;
        //Rellenamos el sorteo con 1000 numeros con 1000 premios
        for (int i = 0; i < 1000; i++) {
            numDecimo = "";
            premio = rd.nextInt(1000000) + 1;
            for (int j = 0; j < 5; j++) {
                numDecimo += rd.nextInt(10);
            }
            listado.aniadeBoletoPremiado(numDecimo, premio);

        }
        
        //Añadido numero para hacer comprobación de mensaje de premio
        //listado.aniadeBoletoPremiado("12345", 100);
        Scanner sc = new Scanner(System.in);
        
        String numComprobar = sc.nextLine();
        
        if(listado.consultarDecimo(numComprobar)!=null){
        System.out.println("El premio del número " + numComprobar + " es " + listado.consultarDecimo(numComprobar) + "€");
        }else{
            System.out.println(numComprobar +" no premiado");
        }
    }
}
