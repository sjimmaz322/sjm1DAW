package sets;

import java.util.Objects;

/*
Crea la clase Soldado (nif, nombre, apellido1, apellido2 y edad) con constructores,
getters, setters, toString y método equals.
Se entienden que dos soldados son iguales si su nif es igual. 
 */

public class Soldats implements Comparable<Soldats> {
    
    private String nif, nombre, apellido1, apellido2;
    private int edad;

    public Soldats(String nif, String nombre, String apellido1, String apellido2, int edad) {
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
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nif);
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.apellido1);
        hash = 71 * hash + Objects.hashCode(this.apellido2);
        hash = 71 * hash + this.edad;
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
        final Soldats other = (Soldats) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "El soldado "+nombre+" "+apellido1+" "+apellido2+" de "+edad+" años el dueño del NIF "+nif;
    }


    @Override
    public int compareTo(Soldats s) {
        return this.nif.compareTo(s.nif);
    }

    
    
    

}
