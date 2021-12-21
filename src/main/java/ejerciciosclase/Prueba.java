
package ejerciciosclase;


public class Prueba {

    
    public static void main(String[] args) {
        PuntoGeometrico puntoA = new PuntoGeometrico(0,1);
        PuntoGeometrico puntoB = new PuntoGeometrico(1,0);
        
        
        puntoB.setX(5);
        puntoB.setY(3);
        
        System.out.println(puntoB);
    }
    
}
