package pootema4;

public class Cafetera {
    
   private double capacidadMaxima, cantidadActual, cantidadAServir;
   
   
    
    
//Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
//y cantidadActual (la cantidad actual de café que hay dentro de la cafetera). Implementa, al menos, los siguientes métodos:
//Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera vacía).
//
//Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima
//(cafetera llena).
//
//Constructor, que recibe la capacidad máxima y la cantidad actual. Si la cantidad actual que se pasa es mayor que la capacidad máxima
//de la cafetera, se ajustará la cantidad actual a la capacidad máxima.
//
//llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
//
//servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual de café “
//no alcanza” para llenar la taza, se sirve lo que quede.
//
//vaciarCafetera(): pone la cantidad de café actual en cero.

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        this.cantidadAServir = 0;
        if (this.cantidadAServir < this.cantidadActual){this.cantidadAServir=this.cantidadActual;}
    }

    public Cafetera(double capacidadMaxima) {this.cantidadActual = this.capacidadMaxima;} 
    
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima>1000){
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
//    public double servirTaza(){
//        this.cantidadAServir = cantidadAServir;
//        if (this.cantidadAServir < this.cantidadActual){
//            this.cantidadAServir=this.cantidadActual;
//        }
//    }return this.cantidadAServir;

    

}
