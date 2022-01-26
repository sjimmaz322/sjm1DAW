package p42;

import java.time.YearMonth;

public class TarjetaCredito {

    private final String ENTIDAD_EMISORA, NUM_TARJETA, TITULAR;
    private double saldo;
    private boolean estado = false; //false para ddesactivada y true para activada.
    private YearMonth CADUCIDAD;
    public static final double MIN = 500;
    public static final double MAX = 3000;
    private String pin;

    public TarjetaCredito() {
        this.ENTIDAD_EMISORA = "Tetimo";
        this.NUM_TARJETA = "1234-5678-8765-4321";
        this.TITULAR = "Nombre Apellido";
        this.saldo = 1000;
        this.CADUCIDAD = YearMonth.now().plusYears(3);
        this.pin = "1234";
    }

    public TarjetaCredito(String ENTIDAD_EMISORA, String NUM_TARJETA, String TITULAR, double saldo, YearMonth CADUCIDAD, String pin) {
        this.ENTIDAD_EMISORA = ENTIDAD_EMISORA;
        this.NUM_TARJETA = NUM_TARJETA;
        this.TITULAR = TITULAR;
        this.saldo = saldo;
        this.CADUCIDAD = CADUCIDAD;
        this.pin = pin;
    }

    public String getENTIDAD_EMISORA() {
        return ENTIDAD_EMISORA;
    }

    public String getNUM_TARJETA() {
        return NUM_TARJETA;
    }

    public String getTITULAR() {
        return TITULAR;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public YearMonth getCADUCIDAD() {
        return CADUCIDAD;
    }
    
    
}

