package pila;

import java.util.ArrayList;
import java.util.Random;

public class PruebaPila {
    
    public static void main(String[] args) {
        Random rd = new Random();
        
        Pila miPila = new Pila();

        for (int i = 0; i < 123; i++) {
            
            char a = (char)(rd.nextInt(122-65+1)+65);
            miPila.push(a);
        }

        
        miPila.imprimirConsola();
        
        String resultado = miPila.isEmpty() ? "Está vacía" : "No está vacía";
        
        System.out.println(resultado);
        
        String resultado2 = miPila.isFull() ? "Está llena" : "No está llena";
        
        System.out.println(resultado2);
        
        System.out.println("El tamaño de la lista es: " + miPila.getSize());
        
        miPila.getPila();
        
    }
    
}
