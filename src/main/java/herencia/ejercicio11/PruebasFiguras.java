package herencia.ejercicio11;

public class PruebasFiguras {

    public static void main(String[] args) {

        Figuras t1 = new Triangulo();
        Figuras r1 = new Rectangulo();
        Figuras ro1 = new Romboide();
        
        t1.setAltura(4);
        r1.setAltura(5);
        ro1.setAltura(6);

        System.out.println("Calcular áreas");
        System.out.println(t1.calcularArea());
        System.out.println(r1.calcularArea());
        System.out.println(ro1.calcularArea());

    }

}
