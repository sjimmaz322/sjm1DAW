package pootema4;

import java.util.Random;

public class Utilidades {

        public static int generarAleatorio(int numMax, int nunMin){
            
            Random numAleatorio = new Random();
            int numRandom = numAleatorio.nextInt();
            return numRandom;
}
}
