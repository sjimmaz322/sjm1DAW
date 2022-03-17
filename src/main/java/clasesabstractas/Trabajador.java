package clasesabstractas;

/*
 * @author samjimmaz
 */
public abstract class Trabajador {

    String nombre, apellido1, nif;

    public Trabajador(String nombre, String apellido1, String nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.nif = nif;
    }

    public Trabajador() {
        this.nombre = "NoName";
        this.apellido1 = "NoData";
        this.nif = "Null";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public abstract void cotizar();

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", nif=" + nif + '}';
    }

}
