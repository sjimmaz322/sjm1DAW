/*

 */
package pila;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Character> pila;
    private final int TAMANIO = 100;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public ArrayList<Character> getPila() {
        return pila;
    }

    public void setPila(ArrayList<Character> pila) {
        this.pila = pila;
    }

    public void push(char sjt) {
        pila.add(sjt);
        if (pila.size() > 100) {
            pila.remove(pila.size() - 1);

        }

    }

    public int getSize() {
        int tam = pila.size();

        return tam;
    }

    public void pop() {
        pila.remove(pila.size() - 1);
    }

    public void imprimirConsola() {//Método que imprime por consola todos los elementos de la lista
        if (pila != null) {
            System.out.println("Imprimiendo lista...");
            pila.forEach(System.out::println);
        }
    }
    public boolean isFullFull(){
       if (pila.size()== TAMANIO){
           return true;
       } 
       return false;
    }
    public boolean isFull(){
       if (pila.size()!= 0){
           return true;
       } 
       return false;
    }
    
    public boolean isEmpty(){
       if (pila.size()==0){
           return true;
       } 
       return false;
    }
    
    public void rellenar(char[] array){
        for (int i = 0; i < pila.size(); i++) {
            pila.add(array[i]);
            
        }
    }

    @Override
    public String toString() {
        return "Pila{" + "pila=" + pila + '}';
    }

}
