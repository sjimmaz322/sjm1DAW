package herencia.ejercicio11;

public class Romboide extends Figuras {

    protected double altura, base;

    public Romboide(double altura, double base) {
        super(altura, base);
    }

    public Romboide() {
    }

    @Override
    public String toString() {
        return "El rombóide tiene una altura de " + super.altura + " y una base de " + super.base;
    }

    @Override
    public String calcularArea() {
        String area = "El área del romboide es: " + super.altura * super.base + " unidades cuadradas";
        return area;
    }
}
