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
        
        String palin = resultado?"La palabra "+palabra+" es un palíndormo":"La palabra "+palabra+" no es un palíndormo";
        
        System.out.println(palin);
    }

  

    private static boolean comprobarPalabra(String palabra) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        for (int i = 0; i < palabra.length(); i++) {
            list1.add(palabra.charAt(i));
        }
        for (int j = palabra.length()-1; j >= 0; j--) {
            list2.add(palabra.charAt(j));
        }
//        for (int k = 0; k < list1.size(); k++) {
//            System.out.print(list1.get(k));
//        }
//        System.out.print(" ");
//        for (int m = 0; m < list2.size(); m++) {
//            System.out.print(list2.get(m));
//        }

        for (int k = 0; k < list1.size(); k++) {
            if (!(list1.get(k).equals(list2.get(k)))){
                return false;
            }
                
            }
        return true;
        }
    }

