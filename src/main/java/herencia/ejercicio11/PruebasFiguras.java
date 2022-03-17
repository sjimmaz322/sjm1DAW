package herencia.ejercicio11;

public class PruebasFiguras {

    public static void main(String[] args) {

        Figuras f1 = new Figuras();
        Triangulo t1 = new Triangulo();
        Rectangulo r1 = new Rectangulo();
        Romboide ro1 = new Romboide();

        t1.setBase(4);
        r1.setBase(5);
        ro1.setBase(6);

        System.out.println("Calcular áreas");
        System.out.println(f1.calcularArea());
        System.out.println(t1.calcularArea());
        System.out.println(r1.calcularArea());
        System.out.println(ro1.calcularArea());

    }

}
