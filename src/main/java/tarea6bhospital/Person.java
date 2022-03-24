package tarea6bhospital;

/*
 * @author samjimmaz
 */
public abstract class Person {

    protected String nombre, apellidos;
    protected Nif dni;

    public Person(String nombre, String apellidos, Nif dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    public abstract void renovarNif();

    @Override
    public String toString() {
        return "Datos:\nNombre"+nombre+"\nApellidos"+apellidos+"\nDNI"+dni;
    }
    
    
    
}
