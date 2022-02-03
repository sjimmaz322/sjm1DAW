/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class Ejercicio22 {

    /*
    Crear una clase que contenga como atributo una lista (ArrayList) de números enteros Integer.
    Además tendrá los siguientes métodos:

    Generar lista, que genera una lista de números aleatorios en el intervalo [10 : 100]. 
    Imprimir la lista de números generados.
    Imprimir la suma de los números pares.
    Imprimir la cantidad de números impares. 
    Devolver el elemento mayor.
    Devolver el elemento menor.
    Obtener el tamaño de la lista.
    Borrar un elemento de la lista, según su posición.
    Borrar un elemento de la lista, según su valor. Si hay varios, los borra todos.
     */
    public static void main(String[] args) {

//        ListaInteger miLista = new ListaInteger(10);//Creamos el array con el constructor
//        
//        ArrayList<Integer> list = miLista.getLista(); //Creamos otro arraylist que contenga miLista.

        ArrayList<Integer> lista = new ArrayList<>();
        
        Random rd = new Random();
        
        lista.add(6);
        lista.add(7);
        lista.add(1);
        lista.add(4);
        lista.add(3);
        lista.add(5);

        for (int i = 0; i < 10; i++) {
            Integer aux = rd.nextInt(91) + 10;
            lista.add(aux);//Mete en orden los números que van saliendo.
        }
        
        for (Integer tmp : lista) {//forEach para ver todos los sitios
            System.out.print(tmp + " - ");
        }
        
        int sumaPares = 0;
        int contadorImpares = 0;
        
        for (int i = 0; i < lista.size(); i++) {//Bucle de la lista completa
            //Método get (position)
            int num = lista.get(i); //Unboxing
            if (num%2 == 0)
            sumaPares += num;
            
        }
        System.out.println("\nLa suma de los números pares es "+sumaPares+".");
        
        for (int i = 0; i < lista.size(); i++) {//Bucle de la lista completa
            //Método get (position)
            int num = lista.get(i); //Unboxing
            if (num%2 != 0)
            contadorImpares++;
        }
        System.out.println("\nEn total hay "+contadorImpares+" números impares.");
        
        int mayor = Integer.MIN_VALUE;
        //Buscar el mayor
        for (Integer num : lista) {
            if(num>mayor){
                mayor = num;
            }
        }
        int menor = Integer.MAX_VALUE;
        //Buscar el menor
        for (Integer num : lista) {
            if(menor>num){
                menor = num;
            }
        }
        
        System.out.println("\nEl mayor número es "+mayor);
        System.out.println("\nEl menor número es "+menor);
        
        System.out.println("\nBorrado del elemento de la posición 3");
        
        lista.remove(3); //Elimina la posición 3
        
        lista.forEach(e->System.out.print(e+" - "));
        
        lista.set(0, 200); //Cambia el elemento de la posición 0 al valor dado
        
        lista.add(2, 500); //Entre la posición 1 y la 3 añade un 500
        System.out.println(" ");
        lista.forEach(e->System.out.print(e+" - "));
        
        int indice = lista.indexOf(500);//Averiguar donde está el número buscado por primera vez
        
        System.out.println("\nEl 500 está en la posición "+indice);
        
        
    }

}
