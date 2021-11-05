/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author samjimmaz
 */
public class EjercicioClase04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numDedosA = 0;
        int numDedosB = 0;
        int selection = 0;
        int suma;
        boolean seguir = true;
        //Creamos el bucle que nos permitirá repetir el programa hasta que queramos
        do {
            //Bucle para hacer que se repita hasta que hagamos las cosas bien
            do {
                //Preguntamos por qué se quiere apostar o si se quiere abandonar el programa
                String apuestaText = JOptionPane.showInputDialog(null, "¿Apuestas por Pares o por Nones?"
                        + "\n" + "1 para nones" + "\n" + "2 para pares" + "\n" + "0 para salir");
                //Detección de errores
                try {
                    selection = Integer.parseInt(apuestaText);
                    seguir = false;
                    //Acción ante el error
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Introduzca un 0 o un 1 o un 2, por favor, le damos otra oportunidad");

                }
                //Condición para seguir en el bucle hasta que hagamos bien las cosas
            } while (seguir);
            //Switch para seleccionar cada caso
            switch (selection) {

                //Caso de apostar por nones
                case 1:

                    //Bucle para solo permitir valores entre 0 y 10, o sea, los dedos que se pueden usar
                    do {

                        String dedosAText = JOptionPane.showInputDialog("Jugador A" + "\n" + "¿Cuántos dedos quieres usar?");
                        //Detección de errores
                        try {
                            numDedosA = Integer.parseInt(dedosAText);
                            //Mensaje de aviso de error    
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "A ver, no es tan difícil, introduce un número");

                        }//Condición de mensaje ante valor fuera de rango
                        if (numDedosA < 1 || numDedosA > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 1 y 10 dedos");

                        }

                    } while ((numDedosA < 1 || numDedosA > 10));

                    //Mismo bucle empleado para el jugador A
                    do {
                        String dedosBText = JOptionPane.showInputDialog("Jugador B" + "\n" + "¿Cuántos dedos quieres usar?");
                        //Detectar errores
                        try {
                            numDedosB = Integer.parseInt(dedosBText);
                            //Actuar ante el error
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "A ver, no es tan difícil, introduce un número");

                        }
                        //Condición para mensaje de error por valores fuera de rango
                        if (numDedosB < 1 || numDedosB > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 1 y 10 dedos");

                        }
                        //Condición de repetición de bucle
                    } while ((numDedosB < 1 || numDedosB > 10));
                    //Suma para si el numero resultante es par o impar
                    suma = numDedosA + numDedosB;
                    //Condición para saber que mensaje mostrar dependiento del resto de la división de la suma por 2
                    //En caso de que sea par
                    if (suma % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido pares, gana el jugador B"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es par");
                        //En caso de que sea impar
                    } else if (!(suma % 2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido nones, gana el jugador A"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es impar o sea nones");
                    }

                    break;

                //Caso de apostar por pares
                case 2:
                    do {

                        String dedosAText = JOptionPane.showInputDialog("Jugador A" + "\n" + "¿Cuántos dedos quieres usar?");
                        //Detección de errores
                        try {
                            numDedosA = Integer.parseInt(dedosAText);
                            //Mensaje de aviso de error    
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "A ver, no es tan difícil, introduce un número");

                        }//Condición de mensaje ante valor fuera de rango
                        if (numDedosA < 1 || numDedosA > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 1 y 10 dedos");

                        }

                    } while ((numDedosA < 1 || numDedosA > 10));

                    //Mismo bucle empleado para el jugador A
                   do {
                        String dedosBText = JOptionPane.showInputDialog("Jugador B" + "\n" + "¿Cuántos dedos quieres usar?");
                        //Detectar errores
                        try {
                            numDedosB = Integer.parseInt(dedosBText);
                            //Actuar ante el error
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "A ver, no es tan difícil, introduce un número");

                        }
                        //Condición para mensaje de error por valores fuera de rango
                        if (numDedosB < 1 || numDedosB > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 1 y 10 dedos");

                        }
                        //Condición de repetición de bucle
                    } while ((numDedosB < 1 || numDedosB > 10));

                    //Suma para si el numero resultante es par o impar
                    suma = numDedosA + numDedosB;

                    //Condición para saber que mensaje mostrar dependiento del resto de la división de la suma por 2
                    //En caso de que sea par
                    if (suma % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Apostaste por pares, ha salido pares, gana el jugador A"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es par");

                        //En caso de que sea impar
                    } else if (!(suma % 2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido nones, gana el jugador B"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es impar o sea nones");
                    }
                    break;

                //Caso para la decisión de abandonar el programa
                case 0:
                    JOptionPane.showMessageDialog(null, "Entonces no jugamos" + "\n" + "Adios");

                    break;

                //Caso para cualquier valor no permitido
                default:
                    JOptionPane.showMessageDialog(null, "Los valores aceptables son 1, 2 o 0");

                    break;

            }

            //Condición de repetición de bucle primario
        } while (!(selection == 0));
    }

}
