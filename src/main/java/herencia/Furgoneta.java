/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class Furgoneta extends Vehicles{
     Random rd = new Random();
    private int capacidad;

    public Furgoneta() {
        this.capacidad = rd.nextInt(3500-1000)+1000 + 1;
      
    }

    @Override
    public String getAtributos() {

        String atributosSuperClase;

        // Llamada al método getAtributos() de la clase Vehiculo
        atributosSuperClase = super.getAtributos();

        // Ahora concateno los atributos de la superclase con los de la subclase
        return atributosSuperClase + "\nCapacidad de carga: " + this.capacidad+" kg";
    }

    public int getCapacidad() {
        return capacidad;
    }

    
}
