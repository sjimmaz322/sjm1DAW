package herencia.ejercicio11;

public class Triangulo extends Figuras {

    protected double altura, base;

    public Triangulo(double altura, double base) {
        super(altura, base);
    }

    public Triangulo() {
        this.altura = 3;
        this.base=3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "El triángulo tiene una altura de " + super.altura + " y una base de " + super.base;
    }

    public double calcularArea() {
        
        return altura*base;
    }

}
