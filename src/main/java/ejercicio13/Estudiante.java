/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author samjimmaz
 */
public class Estudiante extends Persone {

    private String id;

    public Estudiante(String id, String nombre, String apellido, String nif, Direccion direction) {
        super(nombre, apellido, nif, direction);
        this.id = id;
    }

    public Estudiante() {
        super();
        this.id = "X";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante{" + "id=" + id + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un estudiante");
    }

}
