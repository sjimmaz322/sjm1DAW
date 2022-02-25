package paquetec;

import java.util.Objects;

public class Soldados implements Comparable<Soldados> {

    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Soldados(String nif, String nombre, String apellido1, String apellido2, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Soldado " + nombre + " " + apellido1 + " " + apellido2 + " de " + edad + " años y con nif " + nif;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nif);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido1);
        hash = 79 * hash + Objects.hashCode(this.apellido2);
        hash = 79 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Soldados other = (Soldados) obj;

        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public int compareTo(Soldados o) {
        return nif.compareTo(o.nif);
    }
}
