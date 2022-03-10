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

        System.out.println("--Turismo--");
        Turismo t1 = new Turismo();
        atributos = t1.getAtributos();
        System.out.println(atributos);

        System.out.println("\n--Deportivo--");
        Deportivo d1 = new Deportivo();
        String atributos2 = d1.getAtributos();
        System.out.println(atributos2);

        System.out.println("\n--Furgoneta--");
        Furgoneta f1 = new Furgoneta();
        String atributos3 = f1.getAtributos();
        System.out.println(atributos3);
    }

}
