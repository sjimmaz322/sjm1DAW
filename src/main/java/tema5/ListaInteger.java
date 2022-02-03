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
public class ListaInteger {
    private ArrayList<Integer> lista;

    public ListaInteger() {//Crea la lista vacía
        lista = new ArrayList<>();
    }
    public ListaInteger(int tam) {//Crea la lista del tamaño introducido en tam
        Random rd = new Random();
        lista = new ArrayList<>(tam);
        for (int i = 0; i < tam; i++) {
            Integer aux = rd.nextInt(91)+10;
            lista.add(aux);
        }
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
    
}
