package ejerciciosclase;

import java.util.Arrays;
import tema5.MetodosArrays;

public class JokerBuenoJokerMalo {

    public static void main(String[] args) {
        int[] arrayJoker = MetodosArrays.crearArrayFijo(7);
        MetodosArrays.rellenarArrayRandom(arrayJoker, 10);
        int[] arrayJugador = MetodosArrays.crearArrayFijo(7);
        MetodosArrays.rellenarArray(arrayJugador);
        System.out.println("-");
        MetodosArrays.compararArrays(arrayJoker, arrayJugador);
        if (MetodosArrays.compararArrays(arrayJoker, arrayJugador) == true) {
            System.out.println("ENHORABUENA \nUSTED HA GANADO EL PREMIO GORDO");
        } else {
            Arrays.sort(arrayJugador);
            Arrays.sort(arrayJoker);
            if (MetodosArrays.compararArrays(arrayJoker, arrayJugador) == true) {
                System.out.println("ENHORABUENA \nSU COMBINACIÓN NUMÉRICA TIENE PREMIO");
            } else {
                System.out.println("LO SENTIMOS, MÁS SUERTE LA PRÓXIMA");
            }
        }
    }
}
