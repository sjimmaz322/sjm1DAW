package interfazSeArranca;

public class Ordenador implements SeArranca, SePara {

    private double precio;

    public Ordenador(double precio) {
        this.precio = precio;
    }

    public Ordenador() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + '}';
    }

    public boolean arrancar() {
        System.out.println("El ordenador ha arrancado...");
        return true;
    }

    public boolean parar() {
        System.out.println("El ordenador ha parado...");
        return false;
    }

}
