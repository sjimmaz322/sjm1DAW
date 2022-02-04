/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class MetodosArrayList {

    public static void rellenarArrayListRandom(int tam, ArrayList<Integer> aux) {
        Random rd = new Random();
        for (int i = 0; i < tam; i++) {
            aux.add(rd.nextInt());
        }
    }

    public static void rellenarArrayListRandomRango(int tam, ArrayList<Integer> aux, int tope, int minimo) {
        Random rd = new Random();
        for (int i = 0; i < tam; i++) {
            aux.add(rd.nextInt(tope - minimo + 1) + minimo);
        }
    }

    public static ArrayList<Integer> rellenarArrayListRandom(int tamanio) {
        Random rd = new Random();
        ArrayList<Integer> aux = new ArrayList<>();

        for (int i = 0; i < tamanio; i++) {
            aux.add(rd.nextInt());
        }

        return aux;
    }
        public static ArrayList<Integer> rellenarArrayListRandomRango(int tamanio, int tope, int minimo){ 
        Random rd = new Random();
        ArrayList<Integer> aux = new ArrayList<>();
        
        for (int i = 0; i < tamanio; i++) {
            aux.add(rd.nextInt(tope-minimo+1)+minimo);
        }
        
        return aux;
    }
}
