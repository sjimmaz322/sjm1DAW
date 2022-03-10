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
public class Deportivo extends Vehicles{
    Random rd = new Random();
    private int cilindrada;

    public Deportivo() {
        this.cilindrada = rd.nextInt(2000-500)+500 + 1;
    }

    @Override
    public String getAtributos() {

        String atributosSuperClase;

        // Llamada al método getAtributos() de la clase Vehiculo
        atributosSuperClase = super.getAtributos();

        // Ahora concateno los atributos de la superclase con los de la subclase
        return atributosSuperClase + "\nCilindrada: " + this.cilindrada+" cc";
    }

    public int getCilindrada() {
        return cilindrada;
    }


}
