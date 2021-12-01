package pootema4;

public class Prueba2 {

    public static void main(String[] args) {
        
        Cafetera_VICO c1 = new Cafetera_VICO(8);
        Cafetera_VICO c2 = new Cafetera_VICO();
        Cafetera_VICO c3 = new Cafetera_VICO(100,200);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        c2.llenarCafetera();
        
        System.out.println(c2);
        
        c2.servirtaza(500);
        System.out.println(c2);
        
        c2.servirtaza(505);
        System.out.println(c2);
    }

}
