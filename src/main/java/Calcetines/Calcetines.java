package Calcetines;

import java.util.Objects;
import java.util.Random;

public class Calcetines {
    //Atributos de la clase
    private int talla;
    private Colores color;
    //Random que nos permitirá que se creen de manera aleatoria los calcetines
    private static Random rd = new Random();

    public Calcetines() {//Constructor por defecto que creará calcetines aleatorio
        int opcion = rd.nextInt(3) + 1;
        
        if (opcion == 1) {
            color = color.GRISCLARO;
        } else if (opcion == 2) {
            color = color.GRISOSCURO;
        } else {
            color = color.NEGRO;
        }
        
        this.talla = rd.nextInt(43 - 40 + 1) + 40;
    }

    public Calcetines(int talla, Colores color) {//Constructor parametrizado para crear nuestros calcetines
        this.talla = talla;
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public Colores getColor() {
        return color;
    }
    //Getters, setters, hassCode y to String a continuación.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.talla;
        hash = 59 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//Los calcetines son iguales si tienen la misma talla y color
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calcetines other = (Calcetines) obj;
        if (this.talla != other.talla) {
            return false;
        }
        return this.color == other.color;
    }

    @Override
    public String toString() {
        return "El calcetín es de color " + color + " y de la talla " + talla;
    }

}
