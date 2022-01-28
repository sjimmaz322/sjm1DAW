package pootema4;

public class PruebaLinea {

    public static void main(String[] args) {
        
        PuntoGeometrico puntoA = new PuntoGeometrico(0,0);
        PuntoGeometrico puntoB = new PuntoGeometrico(0,0);
        
        Linea l1 = new Linea(puntoA, puntoB);
        
        
        l1.getPuntoA().setCoorX(1);
        l1.getPuntoA().setCoorY(1);
        l1.getPuntoB().setCoorX(4);
        l1.getPuntoB().setCoorY(7);
        
        System.out.println(l1);
        System.out.println(" ");
       
        
        
    }

}
