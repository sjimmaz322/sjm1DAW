package herencia;

import java.util.Random;

/**
 *
 * @author samjimmaz
 */
public class Turismo extends Vehicles {

    Random rd = new Random();
    private int puertas;
    private boolean marchaAutomatica;

    public Turismo() {
        this.puertas = rd.nextInt(4) + 1;
        this.marchaAutomatica = rd.nextBoolean();
    }

    @Override
    public String getAtributos() {

        String atributosSuperClase;

        // Llamada al método getAtributos() de la clase Vehiculo
        atributosSuperClase = super.getAtributos();

        // Ahora concateno los atributos de la superclase con los de la subclase
        return atributosSuperClase + "\nPuertas: " + this.puertas + "\nMarcha automática: " + this.marchaAutomatica;
    }

    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }
    
}
