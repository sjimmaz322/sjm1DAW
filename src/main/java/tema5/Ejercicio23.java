package tema5;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio23 {

    public static void rellenarArrayListRandom(int tamanio, ArrayList<Integer> aux) {
        Random rd = new Random();
        for (int i = 0; i < tamanio; i++) {
            aux.add(rd.nextInt());
        }
    }
    
    public static ArrayList<Integer> rellenarArrayListRandom(int tamanio){ 
        Random rd = new Random();
        ArrayList<Integer> aux = new ArrayList<>();
        
        for (int i = 0; i < tamanio; i++) {
            aux.add(rd.nextInt());
        }
        
        return aux;
    }
    
    public static void rellenarArrayListRandomRango(int tam, ArrayList<Integer> aux,int tope,int minimo) {
        Random rd = new Random();
        for (int i = 0; i < tam; i++) {
            aux.add(rd.nextInt(tope-minimo+1)+minimo);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        Random rd = new Random();
        int tamanio = rd.nextInt(15 - 5 + 1) + 5;
        int tamanio2 = rd.nextInt(20 - 10 + 1) + 10;

        for (int i = 0; i < tamanio; i++) {
            Integer aux = rd.nextInt(100 - 50 + 1) + 50;
            lista1.add(aux);
        }
        for (int i = 0; i < tamanio2; i++) {
            Integer aux = rd.nextInt(100 - 50 + 1) + 50;
            lista2.add(aux);
        }

        for (Integer tmp : lista1) {
            System.out.print(tmp + " - ");
        }
        System.out.println(" ");

        for (Integer pos : lista2) {
            System.out.print(pos + "-");
        }
        System.out.println(" ");

        ArrayList lista3 = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            Integer aux = lista1.get(i);

            if (!(lista2.contains(aux))) {
                lista3.add(aux);
            }

        }
        lista3.forEach(e -> System.out.print(e + "-"));

        ArrayList lista4 = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i) % 2 == 0) {
                lista4.add(lista1.get(i));
            }

        }
        for (int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i) % 2 != 0) {
                lista4.add(lista2.get(i));
            }
        }
        System.out.println(" ");

        lista4.forEach(e -> System.out.print(e + "-"));
        
        System.out.println(" ");
        
        ArrayList<Integer> lista5 = rellenarArrayListRandom(10);
        
        lista5.forEach(e -> System.out.print(e + "-"));
    }

}
