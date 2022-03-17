package clasesabstractas;

public class Camarero extends Trabajador {

    String nombre, apellido1, nif;

    public Camarero(String nombre, String apellido1, String nif) {
        super(nombre, apellido1, nif);
    }

    public Camarero() {
        this.nombre = "NoName";
        this.apellido1 = "NoData";
        this.nif = "Null";
    }
@Override
    public String getNombre() {
        return nombre;
    }
@Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String getApellido1() {
        return apellido1;
    }
@Override
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
@Override
    public String getNif() {
        return nif;
    }
@Override
    public void setNif(String nif) {
        this.nif = nif;
    }
@Override
    public void cotizar() {
        System.out.println("El trabajador cotiza como camarero");
    }

    @Override
    public String toString() {
        return "Camarero{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", nif=" + nif + '}';
    }

}
