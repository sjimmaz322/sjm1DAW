package mecanica;

public class Transporte {

    public static void main(String[] args) {

        Motor m = new Motor(2.0, false);
        Ventana v1 = new Ventana(true, true);
        Ventana v2 = new Ventana(true, true);
        
        Puerta pp = new Puerta(false,v1);
        Puerta pc = new Puerta(false, v2);
        
        Coche auto = new Coche();
        
    }

}
