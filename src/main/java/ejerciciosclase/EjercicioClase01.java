package ejerciciosclase;

/*
1 - Vamos a solicitar al usuario que decida si meter por teclado un número positivo
o si desea que sea generado aleatoriamente. Rango válido de números positivos entre 2 y 600_000_000.
2 - Algoritmo de fuerza bruta. Si el número "n" es par no es primo. Si es impar recorremos todo el rango de impares
desde 3 hasta n/2.
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class EjercicioClase01 {

    public static void main(String[] args) {

        Random numAleatorio = new Random();
        String numText;
        int num, i;
        int selection;
        boolean aux;
        
        do {
            String select = JOptionPane.showInputDialog(null, "Introduzca la opción que desee" + "\n" + "\n"
                    + "1 Para intoducir manualmente el número"
                    + "\n" + "2 Para general aleatoriamente un número"
                    + "\n" + "0 Para cancelar el programa y salir");
            selection = Integer.parseInt(select);
        } while (!(selection >= 0 && selection <= 2));

        switch (selection) {

            case 1:

                do {
                    numText = JOptionPane.showInputDialog("Introduzca el número que desee comprobar");
                    num = Integer.parseInt(numText);

                    if (num < 2 || num > 600000000) {
                        JOptionPane.showMessageDialog(null, "El rango aceptado es entre 2 y 600000000");
                    }
                } while (num < 2 || num > 600000000);

                if (num % 2 == 0) {

                    JOptionPane.showMessageDialog(null, "Sabemos que " + num + " no es primo al ser divisible por 2");

                } else if (num % 2 != 0) {

                    JOptionPane.showMessageDialog(null, "Sabemos que no es par, pero no sabemos si es primo");

                    for (i = 3; i == (num / 2); i = i + 2) {

                        

                        if (num % i == 0) {

                            JOptionPane.showMessageDialog(null, "Sabemos que " + num + " no es par y no es primo");
                        } else if (num % i != 0) {

                            JOptionPane.showMessageDialog(null, "Podemos decir que " + num + " es primo");
                        }
                    }

                }

                break;

            case 2:

                int number = numAleatorio.nextInt(600_000_000 - 2 + 1) + 2;
                JOptionPane.showMessageDialog(null,"El número generado ha sido: " + number);
                if (number % 2 == 0) {

                    JOptionPane.showMessageDialog(null, "Sabemos que " + number + " no es primo al ser divisible por 2");

                } else {

                    for (i = 3; i == (number / 2); i = i + 2) {

                        

                        JOptionPane.showMessageDialog(null, "Sabemos que no es par, pero no sabemos si es primo");

                        if (number % i == 0) {

                            JOptionPane.showMessageDialog(null, "Sabemos que " + number + " no es par y no es primo");
                        } else if (number % i != 0) {

                            JOptionPane.showMessageDialog(null, "Podemos decir que " + number + " es primo");
                        }
                    }

                }
                break;

            case 0:

                JOptionPane.showMessageDialog(null, "Fin del programa, hasta la próxima");
                break;

            default:

                JOptionPane.showMessageDialog(null, "Las opciones válidas de selección son: 1, 2 o 0");
                break;
        }

    }
}
