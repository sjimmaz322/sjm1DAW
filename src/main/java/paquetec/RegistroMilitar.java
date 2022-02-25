/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author Mapacherben
 */
public class RegistroMilitar {
      private Set<Soldados> lista;

    //Constructor
    public RegistroMilitar() {
        this.lista = new HashSet<>();
    }

    //Saber el número de soldados
    public int numeroSoldados() {
        return lista.size();
    }

    //Método el cual alista a los soldados(los añade)
    public void alistarSoldado(Soldados soldado) {
        lista.add(soldado);
    }

    //Método el cual sabe si el ejercito no tiene soldados
    public boolean tieneSoldados() {
        return lista.isEmpty();

    }

    //Método el cual dice si hay un soldado alistado
    public boolean containsSoldado(Soldados s) {

        return lista.contains(s);
    }

    //Método el cual saca todos los soldados en forma de ArrayList
    public ArrayList<Soldados> arraySoldados() {

        return new ArrayList<>(lista);

    }

    //Método el cual desmatricula a un soldado del ejército.
    public void desmatricularSoldado(Soldados s) {
        lista.remove(s);

    }

    public void mostrarLista() {
        for (Soldados soldado : lista) {
            System.out.println(soldado);
}
   

