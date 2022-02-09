package bdpersonajes;

import java.util.Objects;

public class Personaje {

    private String nombre, raza, arquetipo, alineacion, trasfondo;
    private int nivel, edad, healthPoints, manaPoints;
    private double puntosExp;
    /*
    Razas:  Dracónidos, Elfos, Enanos, Gnomos, Humanos, Medianos, Semi-elfos, Semi-orcos, Tiflin, 
    Arquetipos: Bárbaro, Bardo, Brujo, Clérigo, Druida, Explorador, Guerrero, Hechicero, Mago, Monje, Paladín, Pícaro.
    Alineaciones: Lawful Good, Neutral Good, Chaotic Good, Lawful Neutral, True Neutral, Chaotic Neutral, Lawful Evil, Neutral Evil, Chaotic Evil.
    Trasfondo: La historia del personaje, no le haremos mucho caso en esta ocasión.
    */

    public Personaje(String nombre, String raza, String arquetipo, String alineacion, int nivel, int edad, int healthPoints, int manaPoints, double puntosExp, String trasfondo) {
        this.nombre = nombre;
        this.raza = raza;
        this.arquetipo = arquetipo;
        this.alineacion = alineacion;
        this.nivel = nivel;
        this.edad = edad;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.trasfondo = trasfondo;
        this.puntosExp = puntosExp;
    }

    //Getters y setter de todo lo necesario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getArquetipo() {
        return arquetipo;
    }

    public void setArquetipo(String arquetipo) {
        this.arquetipo = arquetipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public String getTrasfondo() {
        return trasfondo;
    }

    public void setTrasfondo(String trasfondo) {
        this.trasfondo = trasfondo;
    }

    public double getPuntosExp() {
        return puntosExp;
    }

    public void setPuntosExp(double puntosExp) {
        this.puntosExp = puntosExp;
    }
    
    //toString para recibir la ficha del personaje

    @Override
    public String toString() {
        return "El siguiente personaje es:\n"
                + "Nombre: " + nombre + "\n"
                + "Raza: " + raza + "\n"
                + "Arquetipo: " + arquetipo + "\n"
                + "Alineación: " + alineacion + "\n"
                + "Edad: " + edad + "\n"
                + "Nivel: " + nivel + "\n"
                + "Puntos de vida: " + healthPoints + "\n"
                + "Puntos de magia: " + manaPoints + "\n"
                + "Puntos de experiencia actuales: " + puntosExp + "\n"
                + "Trasfondo:\n" + trasfondo
                +"\n";
    }
    
    //hashCode porque lo dimos en clase
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.raza);
        hash = 67 * hash + Objects.hashCode(this.arquetipo);
        hash = 67 * hash + Objects.hashCode(this.alineacion);
        hash = 67 * hash + Objects.hashCode(this.trasfondo);
        hash = 67 * hash + this.nivel;
        hash = 67 * hash + this.edad;
        hash = 67 * hash + this.healthPoints;
        hash = 67 * hash + this.manaPoints;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.puntosExp) ^ (Double.doubleToLongBits(this.puntosExp) >>> 32));
        return hash;
    }


    //equals para que funcionen los métodos comparatorios
    //Entendemos que para que dos personajes sean iguales deben tener la misma edad, raza, arquetipo, alineación.

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
        final Personaje other = (Personaje) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.arquetipo, other.arquetipo)) {
            return false;
        }
        return Objects.equals(this.alineacion, other.alineacion);
    }
    

}
