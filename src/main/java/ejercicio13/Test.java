/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author samjimmaz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos la lista de personas
        ArrayList<Persone> listaPersonas = new ArrayList<>();

        //No puedo crear objetos de la clase Persone, es una clase abstracta, un molde, no una clase creable en si.
        //Creamos los objetos estudiantes y profesor
        Persone e1 = new Estudiante();
        Persone e2 = new Estudiante();
        Persone e3 = new Estudiante();
        Persone p1 = new Profesor();
        Persone p2 = new Profesor();
        Persone p3 = new Profesor();

        //Para acceder a los métodos de cada clase específica debemos o instanciarlos como Estudiante y Profesor o hacer un casting.
        //Cosa que haremos en el forEach.
        listaPersonas.add(e1);
        listaPersonas.add(e2);
        listaPersonas.add(e3);
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);

        for (Persone per : listaPersonas) {

            if (per instanceof Estudiante) {
                System.out.println(per.getClass());
                System.out.println(((Estudiante) per).getId());
            }
            if (per instanceof Profesor) {
                System.out.println(per.getClass());
                System.out.println(((Profesor) per).getEspecialidad());
            }
            per.identificate();
            System.out.println("\n");
        }

    }

}
