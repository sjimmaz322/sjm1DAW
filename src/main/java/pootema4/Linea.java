package pootema4;

public class Linea {

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    public Linea() {
        
//    this.puntoA = puntoA.setCoorX(0),puntoA.setCoorY(0);
//    this.puntoB = (1.1);
        
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        return "La linea tiene unas coordenadas iniciales de"+puntoA+" y un punto final de"+puntoB;
    }
    
    public void mueveDerecha(double x){
        
    }
    public void mueveIzquierda(double x){
        
    }
    public void mueveArriba(double y){
        
    }
    public void mueveAbajo(double y){
        
    }
}
    

   
   
   
    

