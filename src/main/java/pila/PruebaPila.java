package pila;

import java.util.Random;

public class PruebaPila {
    
    public static void main(String[] args) {
        Random rd = new Random();
        char[] lista = {'S','a','m','u','e','l','A','l','e','j','a','n','d','r','o','J','i','m','e','n','e','z','M','a','z','a','s'};
        
        Pila miPila = new Pila();

        miPila.rellenar(lista);

        
        miPila.imprimirConsola();
        
        String resultado = miPila.isEmpty() ? "Está vacía" : "No está vacía";
        
        System.out.println(resultado);
        
        String resultado2 = miPila.isFullFull() ? "Está llena" : "No está llena";
        
        System.out.println(resultado2);
        
        String resultado3 = miPila.isFull() ? "Está llena pero no del todo" : "Está vacía";
        
        System.out.println("El tamaño de la lista es: " + miPila.getSize());
        
        miPila.getPila();
        
        String cadena = miPila.toString();
        System.out.println(cadena);
        
    }
    
}
