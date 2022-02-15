/*

 */
package pila;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Character> pila;
    private int tamanio;

    public Pila(int tamanio) {
        this.pila = new ArrayList<>();
        this.tamanio = tamanio;
    }

    public ArrayList<Character> getPila() {
        return pila;
    }

    public void setPila(ArrayList<Character> pila, int tamanio) {
        this.pila = pila;
        this.tamanio = tamanio;
    }

    public void push(char sjt) {
        pila.add(sjt);
        if (pila.size() > tamanio) {
            pila.remove(pila.size() - 1);

        }

    }

    public int getSize() {
        int tam = pila.size();

        return tam;
    }

    public void pop() {
        if(pila.size()!=0){
        pila.remove(pila.size() - 1);
        }
    }

    public void imprimirConsola() {//Método que imprime por consola todos los elementos de la lista
        if (pila != null) {
            System.out.println("Imprimiendo lista...");
            pila.forEach(System.out::println);
        }
    }
    public boolean isFullFull(){
       if (pila.size()== tamanio){
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
        for (int i = 0; i < tamanio; i++) {
            pila.add(array[i]);
            
        }
    }

    @Override
    public String toString() {
        return "Pila{" + "pila=" + pila + '}';
    }

}
