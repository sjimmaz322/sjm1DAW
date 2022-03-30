/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovuelo;

/**
 *
 * @author Mapacherben
 */
public class Pasajero extends Person{
    
    private String clase;

    public Pasajero(String clase, String nombre, String apellidos, Nif dni) {
        super(nombre, apellidos, dni);
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEs pasajero de la clase "+ clase;
    }
    
    
    
}
