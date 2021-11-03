package ejerciciosclase;

/*
Dos jugadores. Generar números aleatorio.
El jugador 1, saca numeros entre el 1 y el 5, el jugador 2 igual.
Si los números pensados (suma) <7 gana el jugador 1, si es >7 gana el jugador 2.
Si la suma ==7 no gana ninguno.
Decir el mejor de 5 rondas.
 */

import java.util.Random;
import javax.swing.JOptionPane;

public class EjercicioClase02 {

    public static void main(String[] args) {

        //Declaramos las variables que vamos a utilizar
        int numJ1;
        int numJ2;
        int sumaNum;

        //Declaramos e inicializamos otras variables que usaremos
        int victoriasJ1 = 0;
        int victoriasJ2 = 0;
        int numRonda = 1;

        //Declaramos e inicializamos la variable constante para el número de victorias máximas
        final int LIMITE_VICTORIAS = 3;

        do {
            //Generamos los número aleatorio de ambos jugadores
            Random numAleatorio = new Random();

            numJ1 = numAleatorio.nextInt(4) + 1;
            numJ2 = numAleatorio.nextInt(4) + 1;

            //Inicializamos la variable de la suma de ambos números
            sumaNum = numJ1 + numJ2;

            //Condición para una ronda nula
            if (sumaNum == 7) {
                
                JOptionPane.showMessageDialog(null, "Ronda " + numRonda + "\n" + "Ronda no válida, no hay ganadores" + "\n"+
                        "El jugador 1 lleva " + victoriasJ1 + " rondas ganadas" + "\n" +
                        "El jugador 2 lleva " +  victoriasJ2 + " rondas ganadas");
            //Condición para la victoria del jugador 1    
            } else if (sumaNum < 7) {
                
                JOptionPane.showMessageDialog(null, "Ronda " + numRonda + " ganada por el Jugador 1" + "\n" +
                        "El jugador 1 obtuvo un " + numJ1
                        + "\n" + "El jugador 2 obtuvo un: " + numJ2 + "\n"+
                        "El jugador 1 lleva " + victoriasJ1 + " rondas ganadas" + "\n" +
                        "El jugador 2 lleva " +  victoriasJ2 + " rondas ganadas");
                
                //Aumento del número de ronda
                numRonda = numRonda + 1;
                //Aumento de las victorias del jugador 1
                victoriasJ1 = victoriasJ1 + 1;
                
            //Condición para la victoria del jugador 2    
            } else if (sumaNum > 7) {
                
                JOptionPane.showMessageDialog(null, "Ronda " + numRonda + " ganada por el jugador 2" + "\n" +
                        "El jugador 1 obtuvo un " + numJ1
                        + "\n" + "El jugador 2 obtuvo un: " + numJ2 + "\n" +
                        "El jugador 1 lleva " + victoriasJ1 + " rondas ganadas" + "\n" +
                        "El jugador 2 lleva " +  victoriasJ2 + " rondas ganadas");
                
                //Aumento de ronda
                numRonda = numRonda + 1;
                //Aumento de las victorias del jugador 2
                victoriasJ2 = victoriasJ2 + 1;
            }
        //Condición para la repetición del bucle
        } while ((victoriasJ1 < LIMITE_VICTORIAS && victoriasJ2 < LIMITE_VICTORIAS));
        
        //Si el jugador 1 ha alcanzado el número de rondas ganadas necesarias para ganar el juego
        if (victoriasJ1==LIMITE_VICTORIAS){
            
            JOptionPane.showMessageDialog(null, "El ganador ha sido el Jugador 1, ha ganado 3 rondas"+"\n"+
                    "El jugador 2 obtuvo: " + victoriasJ2 + " victorias");
        //Si el jugador 2 ha alcanzado el número de rondas ganadas necesarias para ganar el juego    
        } else {
            
            JOptionPane.showMessageDialog(null, "El ganador ha sido el Jugador 2, ha ganado 3 rondas"+"\n"+
                    "El jugador 2 obtuvo: " + victoriasJ1 + " victorias");
        }
    }
}
