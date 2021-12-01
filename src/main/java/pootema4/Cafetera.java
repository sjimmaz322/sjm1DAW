package pootema4;

public class Cafetera {
    
    //Interfaz son los métodos públicos.
    
   private double capacidadMaxima, cantidadActual, cantidadAServir, cantidadAgregar;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        this.cantidadAServir = 0;
        if (this.cantidadAServir < this.cantidadActual){this.cantidadAServir=this.cantidadActual;}
        this.cantidadAgregar = 25;
    }

    public Cafetera(double capacidadMaxima) {this.cantidadActual = this.capacidadMaxima;} 
    
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        if (cantidadActual>capacidadMaxima){
            this.capacidadMaxima = 1000;
        }
        this.cantidadActual = cantidadActual;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCantidadAServir() {
        return cantidadAServir;
    }

    public void setCantidadAServir(double cantidadAServir) {
        this.cantidadAServir = cantidadAServir;
    }    
    public double llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
        return this.cantidadActual;
    }
    
    public double vaciarCafetera(){
        this.cantidadActual = 0;
        return this.cantidadActual;
    }
    
    public double servirTaza(){
        if (this.cantidadAServir < this.cantidadActual){
            this.cantidadAServir=this.cantidadActual;
        }
    return this.cantidadAServir;
    }
    public double agregarCafe(double cantidadAgregar){
        cantidadActual = cantidadActual + cantidadAgregar;
        if ((cantidadActual + cantidadAgregar)>capacidadMaxima){
            return capacidadMaxima;
        }
        return cantidadActual;
    }

    public double getCantidadAgregar() {
        return cantidadAgregar;
    }

    public void setCantidadAgregar(double cantidadAgregar) {
        this.cantidadAgregar = cantidadAgregar;
    }
    

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + ", cantidadAServir=" + cantidadAServir + ", cantidadAgregar=" + cantidadAgregar + '}';
    }

    

}
