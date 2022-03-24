package tarea6bhospital;

import java.time.LocalDate;

/*
 * @author samjimmaz
 */
public class Prueba {

    public static void main(String[] args) {

        Medico m1 = new Medico("Psicología", "12457885", 956.20, "Samuel", "Jiménez", new Nif("31014322"));
        
        System.out.println(m1);
    }

}
