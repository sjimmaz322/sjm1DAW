package interfazSeArranca;

import interfazSeArranca.Vehiculos;

public class Turismo extends Vehiculos {

    private int numPuertas;

    public Turismo(int numPuertas, String matrícula) {
        super(matrícula);
        this.numPuertas = numPuertas;
    }

    public Turismo(String matrícula) {
        super(matrícula);
    }

    public Turismo() {
    }
    

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTurismo{" + "numPuertas=" + numPuertas + '}';
    }

    @Override
    public void repostar(String tipoCombustible) {
        System.out.println("El Turismo está repostando " + tipoCombustible);
    }

    public boolean arrancar() {
        System.out.println("El turismo ha arrancado...");
        return true;
    }

}
