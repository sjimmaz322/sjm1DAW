package pila;

import java.util.ArrayList;
import java.util.Random;

public class PruebaPila {
    
    public static void main(String[] args) {
        Random rd = new Random();
        
        Pila pila1 = new Pila(100);

        for (int i = 0; i < 100; i++) {
            
            char a = (char)(rd.nextInt(122-65+1)+65);
            pila1.push(a);
        }

        
        pila1.imprimirConsola();
        
        String resultado = pila1.isEmpty() ? "Está vacía" : "No está vacía";
        
        System.out.println(resultado);
        
        String resultado2 = pila1.isFull() ? "Está llena" : "No está llena";
        
        System.out.println(resultado2);
        
        System.out.println("El tamaño de la lista es: " + pila1.getSize());
        
        pila1.getPila();
        
    }
    
}
