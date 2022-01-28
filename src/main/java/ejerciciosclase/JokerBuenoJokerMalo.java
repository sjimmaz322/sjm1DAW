package ejerciciosclase;

import java.util.Arrays;
import tema5.MetodosArrays;

public class JokerBuenoJokerMalo {

    public static void main(String[] args) {
        int[] joker = MetodosArrays.crearArrayFijo(7);
        MetodosArrays.rellenarArrayRandom(joker, 10);
        int[] jugador = MetodosArrays.crearArrayFijo(7);
        MetodosArrays.rellenarArray(jugador);
        System.out.println("-");
        MetodosArrays.compararArrays(joker, jugador);
        if (MetodosArrays.compararArrays(joker, jugador) == true) {
            System.out.println("ENHORABUENA \nUSTED HA GANADO EL PREMIO GORDO");
        } else {
            Arrays.sort(jugador);
            Arrays.sort(joker);
            if (MetodosArrays.compararArrays(joker, jugador) == true) {
                System.out.println("ENHORABUENA \nSU COMBINACIÓN NUMÉRICA TIENE PREMIO");
            } else {
                System.out.println("LO SENTIMOS, MÁS SUERTE LA PRÓXIMA");
            }
        }
    }
}
