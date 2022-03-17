package herencia.ejercicio11;

public class Triangulo extends Figuras {

    protected double altura, base;

    public Triangulo(double altura, double base) {
        super(altura, base);
    }

    public Triangulo() {
    }

    @Override
    public String toString() {
        return "El triángulo tiene una altura de " + super.altura + " y una base de " + super.base;
    }

    @Override
    public String calcularArea() {
        String area = "El área del triángulo es: " + super.altura * super.base + " unidades cuadradas";
        return area;
    }

}
