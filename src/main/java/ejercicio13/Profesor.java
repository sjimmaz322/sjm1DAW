/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author samjimmaz
 */
public class Profesor extends Persone {

    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellido, String nif, Direccion direction) {
        super(nombre, apellido, nif, direction);
        this.especialidad = especialidad;
    }

    public Profesor() {
        super();
        this.especialidad = "Y";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un profesor");
    }

}
