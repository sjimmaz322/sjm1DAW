package p42;

import java.time.YearMonth;

public class PruebaTarjeta {

    public static void main(String[] args) {
        
        TarjetaCredito tarjeta1 = new TarjetaCredito("Tetimo", "1234567891234567", "Nombre Apellido", 1500, YearMonth.of(2022, 31), "1234");
 
        System.out.println(tarjeta1.toString());
    }

}
