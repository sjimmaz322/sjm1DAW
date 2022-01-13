package ejerciciosclase;

import java.time.LocalDate;

public class FechasPrueba {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        
        System.out.println("Hoy es el día "+hoy.getDayOfMonth());
        System.out.println("Del mes "+hoy.getMonth());
        System.out.println("Del año del señor "+hoy.getYear());
        System.out.println("Estamos a "+hoy.getDayOfWeek());
        System.out.println("Y llevamos de año estos días: "+hoy.getDayOfYear());
        System.out.println("De la era "+hoy.getEra());
    }
}
