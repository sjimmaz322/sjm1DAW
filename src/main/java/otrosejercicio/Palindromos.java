package otrosejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Mete una palabra y te dice si es un palíndromo o no
        System.out.println("Introduce la palabra que deseas comprobar");
        String palabra = sc.nextLine();

        boolean resultado = comprobarPalabra(palabra);
        boolean resultadoRecur = comprobarPalabraRecur(palabra, 0);

        String palin = resultado ? "La palabra " + palabra + " es un palíndormo" : "La palabra " + palabra + " no es un palíndormo";

        System.out.println(palin);

        String palin2 = resultadoRecur ? "La palabra " + palabra + " es un palíndormo" : "La palabra " + palabra + " no es un palíndormo";

        System.out.println(palin2);
    }

    private static boolean comprobarPalabra(String palabra) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        for (int i = 0; i < palabra.length(); i++) {
            list1.add(palabra.charAt(i));
        }
        for (int j = palabra.length() - 1; j >= 0; j--) {
            list2.add(palabra.charAt(j));
        }

        for (int k = 0; k < list1.size(); k++) {
            if (!(list1.get(k).equals(list2.get(k)))) {
                return false;
            }

        }
        return true;
    }

    private static boolean comprobarPalabraRecur(String palabra, int pos) {
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();

        for (int i = 0; i < palabra.length(); i++) {
            list3.add(palabra.charAt(i));
        }
        for (int j = palabra.length() - 1; j >= 0; j--) {
            list4.add(palabra.charAt(j));
        }
        if (!(list3.get(pos).equals(list4.get(pos)))) {
            return false;
        } else {
            if (pos != palabra.length()-1) {
                comprobarPalabraRecur(palabra, pos + 1);
            }
            return true;
        }

    }
}
