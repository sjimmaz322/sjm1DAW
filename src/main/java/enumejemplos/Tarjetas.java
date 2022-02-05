package enumejemplos;

import java.time.YearMonth;

public enum Tarjetas {
    
    TARJETA1("0237-1234-4567-6789", YearMonth.of(2023,10) ,"415"),
    TARJETA2("0239-1754-4785-1754", YearMonth.of(2025,5) ,"113"),
    TARJETA3("1498-0125-5877-6325", YearMonth.of(2021,12) ,"248");

    
    private final String numTarjeta;
    private final YearMonth caducidad;
    private final String CVV;

    private Tarjetas(String numTarjeta, YearMonth caducidad, String CVV) {
        this.numTarjeta = numTarjeta;
        this.caducidad = caducidad;
        this.CVV = CVV;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public YearMonth getCaducidad() {
        return caducidad;
    }

    public String getCVV() {
        return CVV;
    }

    @Override
    public String toString() {
        return "numTarjeta=" + numTarjeta + ", caducidad=" + caducidad + ", CVV=" + CVV;
    }
    
    
    
}
