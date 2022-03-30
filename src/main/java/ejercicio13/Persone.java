package ejercicio13;

/**
 *
 * @author samjimmaz
 */
public abstract class Persone implements Identificable{
    
    private String nombre, apellido, nif;
    private Direccion direction;

    public Persone(String nombre, String apellido, String nif, Direccion direction) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.direction = direction;
    }

    public Persone() {
        this.nombre = "";
        this.apellido = "";
        this.nif = "";
        this.direction = new Direccion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Direccion getDirection() {
        return direction;
    }

    public void setDirection(Direccion direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Persone{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", direction=" + direction + '}';
    }

}
