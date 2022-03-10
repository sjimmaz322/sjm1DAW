package herencia;

/*
 * @author samjimmaz
 */
public class Trabajador {
    
    String nombre, apellido1, nif;

    public Trabajador(String nombre, String apellido1, String nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.nif = nif;
    }
    
    public void cotizar(){
        System.out.println("El trabajador cotiza.");
    }
    
}
