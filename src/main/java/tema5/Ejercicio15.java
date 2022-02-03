
package tema5;


public class Ejercicio15 {

    public static void main(String[] args) {
        
    boolean[] monedita = new boolean[1000];
    
        LanzarMoneda.rellenarArray(monedita);
        System.out.println(LanzarMoneda.caras(monedita));
        System.out.println(LanzarMoneda.cruces(monedita));
        
    }
    
    
}
