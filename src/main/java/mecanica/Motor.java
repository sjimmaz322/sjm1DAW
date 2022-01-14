package mecanica;

public class Motor {

    private double cilindrada; //1.4,1.6,2.0...
    private boolean encendido; //True encendido

    public Motor(double cilindrada, boolean encendido) {
        this.cilindrada = cilindrada;
        this.encendido = encendido;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void arrancar() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada + ", encendido=" + encendido + '}';
    }

}
