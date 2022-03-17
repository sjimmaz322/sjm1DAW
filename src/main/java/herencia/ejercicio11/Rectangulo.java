package herencia.ejercicio11;

public class Rectangulo extends Figuras {

    protected double altura, base;

    public Rectangulo(double altura, double base) {
        super(altura, base);
    }

    public Rectangulo() {
    }

    @Override
    public String toString() {
        return "La figura tiene una altura de " + super.altura + " y una base de " + super.base;
    }

    public String calcularArea() {
        String area = "El área del rectángulo es: " + super.altura * super.base + " unidades cuadradas";
        return area;
    }
}
