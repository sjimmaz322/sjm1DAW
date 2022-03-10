/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author samjimmaz
 */
public class Camarero extends Trabajador{
    
    private String rango;

    public Camarero(String rango, String nombre, String apellido1, String nif) {
        super(nombre, apellido1, nif);
        this.rango = rango;
    }
    
    @Override
    public void cotizar(){
        System.out.println("El trabajador cotiza como camarero.");
    }

    @Override
    public String toString() {
        String atributosSuperClase;

        // Llamada al método getAtributos() de la clase Vehiculo
        atributosSuperClase = super.toString();
        return atributosSuperClase+"Camarero{" + "rango=" + rango + '}';
    }

    
    
}
