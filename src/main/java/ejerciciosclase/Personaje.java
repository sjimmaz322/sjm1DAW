package ejerciciosclase;

import java.util.Objects;

public class Personaje {
    
    private String nombre, raza, arquetipo;
    private int nivel;
    private double healthPoints,manaPoints;

    public Personaje(String nombre, String raza, String arquetipo, int nivel, double healthPoints, double manaPoints) {
        this.nombre = nombre;
        this.raza = raza;
        this.arquetipo = arquetipo;
        this.nivel = nivel;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

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

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(double manaPoints) {
        this.manaPoints = manaPoints;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.raza);
        hash = 53 * hash + Objects.hashCode(this.arquetipo);
        hash = 53 * hash + this.nivel;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.manaPoints) ^ (Double.doubleToLongBits(this.manaPoints) >>> 32));
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
        final Personaje other = (Personaje) obj;
        if (this.nivel != other.nivel) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return Objects.equals(this.arquetipo, other.arquetipo);
    }
    
    
}
