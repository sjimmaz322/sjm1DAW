package otros;

import java.util.Random;

public class Anotaciones {

    public static void main(String[] args) {
        //Número aleatorio entre dos números
        //Número mayor nMayor
        //Número menor nMenor
        //Rango entre nMayor y nMenor
        // int n = numAleatorio.nextInt (nMayor -nMenor +1) +nMenor;
        //Ojo con los signos
        //ejemplo entre 36 y 12
        Random numAleatorio = new Random();

        int n = numAleatorio.nextInt(36 - 12 + 1) + 12;
        System.out.println(n);

    }

}
