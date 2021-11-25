package daw.poo;

public class CajaCarton {

    private double ancho, alto, largo, peso;

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getlargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public double setAncho() {
        return this.ancho;
    }

    public double setAlto() {
        return this.alto;
    }

    public double setLargo() {
        return this.largo;
    }

    public double setPeso() {
        return this.peso;
    }

    public static void abrir() {

    }

    public static void cerrar() {

    }
    
    public CajaCarton (double ancho, double alto, double largo, double peso){
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public CajaCarton() {
    }

    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }
    
}
