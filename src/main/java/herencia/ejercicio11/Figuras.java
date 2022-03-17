package herencia.ejercicio11;

public abstract class Figuras {

    protected double altura, base;

    public Figuras(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Figuras() {
        this.altura = 3;
        this.base = 3;
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
        return "La figura tiene una altura de " + altura + " y una base de " + base;
    }

    public abstract double calcularArea();
    //{
////        String area = "El área de la figura es: " + altura * base + " unidades cuadradas";
////        return area;
//    }

}
