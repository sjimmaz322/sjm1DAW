package herencia.ejercicio5;

/*
 * @author samjimmaz
 */
public class PruebaClientes {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Carlos", "01457841B", 19);
        Cliente c3 = new Cliente("Maria", "45781267K", 20);
        Cliente c4 = new Cliente("Maria", "45781267K", 20);
        Cliente c5 = new Cliente("Maria", "45781267K", 20);
        Cliente c6 = null;

        System.out.println("Prueba de Códigos Hash");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());

        System.out.println("\nPropiedad Transitiva");
        System.out.println("c3.equals(c4) debe ser true es: " + c3.equals(c4));
        System.out.println("c4.equals(c5) debe ser true es: " + c4.equals(c5));
        System.out.println("c3.equals(c5) debe ser true es: " + c3.equals(c5));

        System.out.println("\nPropiedad Reflexiva");
        System.out.println("c2.equals(c2) debe ser true es: " + c2.equals(c2));

        System.out.println("\nPropiedad Simétrica");
        System.out.println("c3.equals(c4) debe ser true es: " + c3.equals(c4));
        System.out.println("c4.equals(c3) debe ser true es: " + c4.equals(c3));

        System.out.println("\nPropiedad de Nulidad");
        System.out.println("c3.equals(c6) debe ser false es : " + c3.equals(c6));

    }

}
