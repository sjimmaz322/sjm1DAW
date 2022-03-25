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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Nif getDni() {
        return dni;
    }

    public void setDni(Nif dni) {
        this.dni = dni;
    }
    
    public abstract void renovarNif();

    @Override
    public String toString() {
        return "Datos:\nNombre"+nombre+"\nApellidos"+apellidos+"\nDNI "+dni;
    }
    
    
    
}
