package pootema4;
//partes de una clase
//Definición de la clase
public class Cafetera_VICO {
    
    //Atributos encapsulados, campos o propiedades.
    private double capacidadMaxima;
    private double cantidadActual;
    //private double cantidadAServir;
    //private double cantidadAgregar;

    //Métodos
    //Especial mención contructores, getters y setters.
    //Constructor por defecto sin parámetros
    //Contructores sobrecargados
    //Igual nombre con distintos parámetros

    public Cafetera_VICO() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    
    //Si la capacidad máxima es negativa pasa a positiva
    public Cafetera_VICO(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima < 10){     
            this.capacidadMaxima = 10; //Para no poder crear una cafetara de capacidad 0
        }                              
        this.cantidadActual=this.capacidadMaxima;
    }

    public Cafetera_VICO(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.abs(cantidadActual);
        
        if (this.capacidadMaxima < 10){     
            this.capacidadMaxima = 10; //Para no poder crear una cafetara de capacidad 0   
        }
        if (this.cantidadActual > this.capacidadMaxima){ //Para que no pueda desbordarse la cafetera
            this.cantidadActual = this.capacidadMaxima;
            }
        this.cantidadActual=this.capacidadMaxima;
    }
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    public void servirtaza(double cantidadAServir){
        double cantidadPositiva = Math.abs(cantidadAServir);
        this.cantidadActual -= cantidadPositiva;
        if (cantidadPositiva > this.cantidadActual){
            this.cantidadActual = 0;
        } 
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(double cantidadAgregar){
        double agregadoPos = Math.abs(cantidadAgregar);
        this.cantidadActual += agregadoPos;
        if ((agregadoPos+this.cantidadActual)>this.capacidadMaxima){
         this.cantidadActual = this.capacidadMaxima;   
        }
    }
    //Implicación, utilidad public y private en los atributos y métodos de una clase --> Buscar que lo pide
    
    //Encapsulamiento
    
    //toString
    @Override
    public String toString() {
        return "Cafetera_VICO{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

   
}
