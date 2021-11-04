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
        int inicio;
        //Declaramos e inicializamos otras variables que usaremos
        int victoriasJ1;
        int victoriasJ2;
        int numRonda;

        //Declaramos e inicializamos la variable constante para el número de victorias máximas
        final int LIMITE_VICTORIAS = 3;
        final int LIMITE_RONDAS = 5;

        //Bucle de selección de inicio
        do {
            String option = JOptionPane.showInputDialog(null, "¿Desea iniciar el juego?" + "\n" + "\n"
                    + "Introduzca 1 para SI, introduzca otro numero para NO");
            inicio = Integer.parseInt(option);
            if (inicio == 1) {
                JOptionPane.showMessageDialog(null, "Las normas son las siguientes:" + "\n"
                        + "Se generarán dos números aleatorios entre 1 y 5, uno por cada jugador." + "\n"
                        + "Si la suma de ambos es menor a 7 ganará el jugador 1, si es mayor ganará el jugador 2" + "\n"
                        + "Si la suma es 7 ninguno ganará y será ronda nula");

                //Reseteo de rondas ganadas
                victoriasJ1 = 0;
                victoriasJ2 = 0;
                //Reseteo de rondas
                numRonda = 1;

                do {

                    //Generamos los número aleatorio de ambos jugadores
                    Random numAleatorio = new Random();

                    numJ1 = numAleatorio.nextInt(5) + 1;
                    numJ2 = numAleatorio.nextInt(5) + 1;

                    //Inicializamos la variable de la suma de ambos números
                    sumaNum = numJ1 + numJ2;

                    //Condición para una ronda nula
                    if (sumaNum == 7) {

                        //Resultado
                        JOptionPane.showMessageDialog(null, "Ronda " + numRonda + "\n" + "Ronda no válida, no hay ganadores" + "\n"
                                + "La suma ha sido: " + sumaNum + "\n"
                                + "El jugador 1 sigue llevando " + victoriasJ1 + " rondas ganadas" + "\n"
                                + "El jugador 2 sigue llevando " + victoriasJ2 + " rondas ganadas");

                        //Condición para la victoria del jugador 1    
                    } else if (sumaNum < 7) {

                        //Aumento de las victorias del jugador 1
                        victoriasJ1 = victoriasJ1 + 1;

                        //Resultado
                        JOptionPane.showMessageDialog(null, "Ronda " + numRonda + " ganada por el Jugador 1" + "\n"
                                + "El jugador 1 obtuvo un " + numJ1
                                + "\n" + "El jugador 2 obtuvo un: " + numJ2 + "\n"
                                + "La suma ha sido: " + sumaNum + "\n"
                                + "El jugador 1 lleva " + victoriasJ1 + " rondas ganadas" + "\n"
                                + "El jugador 2 lleva " + victoriasJ2 + " rondas ganadas");

                        //Aumento del número de ronda
                        numRonda++;

                        //Condición para la victoria del jugador 2    
                    } else if (sumaNum > 7) {

                        //Aumento de las victorias del jugador 2
                        victoriasJ2 = victoriasJ2 + 1;

                        JOptionPane.showMessageDialog(null, "Ronda " + numRonda + " ganada por el jugador 2" + "\n"
                                + "El jugador 1 obtuvo un " + numJ1
                                + "\n" + "El jugador 2 obtuvo un: " + numJ2 + "\n"
                                + "La suma ha sido: " + sumaNum + "\n"
                                + "El jugador 1 lleva " + victoriasJ1 + " rondas ganadas" + "\n"
                                + "El jugador 2 lleva " + victoriasJ2 + " rondas ganadas");

                        //Aumento de ronda
                        numRonda++;

                    }
                    //Condición para la repetición del bucle
                } while (numRonda <= LIMITE_RONDAS && (victoriasJ1 < LIMITE_VICTORIAS && victoriasJ2 < LIMITE_VICTORIAS));

                //Si el jugador 1 ha alcanzado el número de rondas ganadas necesarias para ganar el juego
                if (victoriasJ1 > victoriasJ2) {

                    JOptionPane.showMessageDialog(null, "El ganador ha sido el Jugador 1, ha ganado 3 rondas" + "\n"
                            + "El jugador 2 obtuvo: " + victoriasJ2 + " victorias");
                    //Si el jugador 2 ha alcanzado el número de rondas ganadas necesarias para ganar el juego    
                } else if (victoriasJ2 > victoriasJ1) {

                    JOptionPane.showMessageDialog(null, "El ganador ha sido el Jugador 2, ha ganado 3 rondas" + "\n"
                            + "El jugador 1 obtuvo: " + victoriasJ1 + " victorias");
                }
                //Condición de dejar de jugar y mensaje de despedida    
            } else {
                JOptionPane.showMessageDialog(null, "Gracias por participar");
            }
            //Condición de repetición de bucle principal    
        } while (inicio == 1);

    }
}
