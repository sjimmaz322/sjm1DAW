/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author samjimmaz
 */
public class PruebasHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String atributos;

        System.out.println("\t--Turismo--");
        Turismo t1 = new Turismo();
        atributos = t1.getAtributos();
        System.out.println(atributos);

        System.out.println("\n\t--Deportivo--");
        Deportivo d1 = new Deportivo();
        atributos = d1.getAtributos();
        System.out.println(atributos);

        System.out.println("\n\t--Furgoneta--");
        Furgoneta f1 = new Furgoneta();
        atributos = f1.getAtributos();
        System.out.println(atributos);

        System.out.println("\n\t--Otras pruebas--");
        String colorTurismo = t1.getColor();
        System.out.println("El turismo 1 es de color " + colorTurismo);
        
        Trabajador trabajador1 = new Trabajador("Samuel", "Jiménez", "31014322H");
        Camarero camarero1 = new Camarero("Samuel", "Jiménez", "31014322H","Camarero");
        
        trabajador1.cotizar();
        camarero1.cotizar();
        

    }

}
